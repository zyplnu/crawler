package cn.edu.lnu.util;

import cn.edu.lnu.pojo.Comment;
import cn.edu.lnu.pojo.Reply2Comment;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.ArrayList;
import java.util.List;

/**
 * 获取评论工具类
 */
public class CommentUtil {

    /**
     * 根据url获取每个产品的productId
     * 目的：拼接html用于获取对于评论的回复
     * @param url
     * @return productId
     */
    private static String getProductId(String url){
        //按照url的规则进行三次分割后得到productId
        String splitStr = url.split("\\?")[1].split("&")[1].split("=")[1];
        return splitStr;
    }

    /**
     * 根据productId和guid对html进行拼接
     * 目的：拼接html用于获取对于评论的回复
     * @param url
     * @param guid
     * @return
     */
    private static String concatUrl(String url , String guid){
        return "https://club.jd.com/repay/" + getProductId(url) + "_" + guid +"_1.html";
    }

    /**
     * 根据拼接的url使用jsoup进行解析，将内容进行封装到Reply2Comment中
     * @param url
     * @param guid
     * @return 解析后的内容
     */
    public static List<Reply2Comment> getReply2Comment(String url , String guid){
        String html = URLConnection.getHtml(concatUrl(url , guid));//获取商品评论回复html
        //对html进行解析，并将解后的内容封装
        List<Reply2Comment> list = new ArrayList<>();
        //解析html文档，添加到list集合中
        //备注：jsoup解析学的不好，后期需要再重新学习一下，最好把时间进行解析出来
        Document document = Jsoup.parse(html);
        Elements elements = document.getElementsByClass("tt");
        for(Element element : elements){
            Reply2Comment reply2Comment = new Reply2Comment();
            reply2Comment.setUser(element.text().split(":")[0]);
            reply2Comment.setContent(element.text().split(":")[1]);
            list.add(reply2Comment);
        }

        return list;
    }

    /**
     * 开启重试机制(避免网络延迟)，若重试10次没有得到数据，则系统退出
     * @param url
     * @return
     */
    public static String retry4GetHtml(String url) throws Exception{
        int count = 0;
        String html = "";
        html = URLConnection.getHtml(url);
        if("".equals(html) || html == null){
            do {
                html = URLConnection.getHtml(url);
                count++;
            }while (html == "" || count > 10);
        }
        if(count > 10){
            System.out.println("未知原因，没有获取到数据....");
            System.exit(-1);
        }
        return html;
    }

    /**
     * 打印每页的评论及评论回复
     * 每个商品的评论的评论地址为：productId_guid_1.html
     * @param page
     */
    public static void getComment(int page){
        String url = "https://sclub.jd.com/comment/productPageComments.action?callback=fetchJSON_comment98vv15&productId=6138112&score=0&sortType=5&page=" + String.valueOf(page) + "&pageSize=10&isShadowSku=0&fold=1";
        try{
            String html = retry4GetHtml(url);//获得爬取的数据json串
            System.out.println("第" + (page + 1) + "页html已成功获取,开始构建json串...");
            String start = html.substring(html.indexOf("(") + 1);
            String end = start.substring(0,start.lastIndexOf(")"));//将json串的前后大括号去掉，构建标准的json串
            System.out.println("json串构建完毕，准备使用....");
            JSONObject jsStr = JSONObject.parseObject(end);//将json串转为json对象
            String result = jsStr.getString("comments");//对评论内容进行抽取
            List<Comment> list = JSONObject.parseArray(result , Comment.class);//将每页10条的评论数据构建为Comment对象集合
            for(Comment comment : list){
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("评论内容：" + comment.getContent());
                System.out.println("评论点赞数：" + comment.getUsefulVoteCount());
                System.out.println("评论回复数：" + comment.getReplyCount());
                List<Reply2Comment> replyList = getReply2Comment(url , comment.getGuid());
                System.out.println("评论回复内容：");
                for(Reply2Comment reply : replyList){
                    System.out.println("\t\t" + reply.getUser() + ":" + reply.getContent());
                }
            }
        } catch (Exception ex){
            System.out.println("未知异常退出，请检查...");
            System.exit(-1);
        }

    }

}
