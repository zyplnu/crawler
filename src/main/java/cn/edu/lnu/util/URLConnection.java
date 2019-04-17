package cn.edu.lnu.util;

import cn.edu.lnu.pojo.Reply2Comment;

import java.io.*;
import java.net.URL;

/**
 * 使用httpclient建立网络连接，获取HTML内容交给jsoup进行解析
 */
public class URLConnection {


    /**
     * 爬取网页数据
     * @param url
     * @return 爬取后的json字符串
     */
    public static String getHtml(String url){
        BufferedReader in = null;
        //定义字符缓冲区
        StringBuffer stringBuffer = new StringBuffer();
        try {
            //创建URL地址
            URL net = new URL(url);
            //打开URL
            java.net.URLConnection connection = net.openConnection();
            //开启输入/输出。注意：请求网络需要传参必须开启
            //connection.setDoOutput(true);
            //connection.setDoInput(true);
            //实例化字符缓冲输入流来读取数据
            in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream() , "GBK"));
            String line = null;
            while ((line = in.readLine())!=null) {
                //用stringBuffer拼接数据
                stringBuffer.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("网络超时");
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringBuffer.toString();
    }

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
    public static Reply2Comment getReply2Comment(String url , String guid){
        String html = getHtml(concatUrl(url , guid));//获取商品评论回复html
        //对html进行解析，并将解后的内容封装
        System.out.println(html);
        Reply2Comment reply2Comment = new Reply2Comment();
        return reply2Comment;
    }

    public static void main(String[] args) {
        /**
         * 每个商品的评论的评论地址为：productId_guid_1.html
         */
        String url = "https://sclub.jd.com/comment/productPageComments.action?callback=fetchJSON_comment98vv15&productId=6138112&score=0&sortType=5&page=0&pageSize=10&isShadowSku=0&fold=1";
        /*String html = getHtml(url);//获得爬取的数据json串
        String start = html.substring(html.indexOf("(") + 1);
        String end = start.substring(0,start.lastIndexOf(")"));//将json串的前后大括号去掉，构建标准的json串
        JSONObject jsStr = JSONObject.parseObject(end);//将json串转为json对象
        String result = jsStr.getString("comments");//对评论内容进行抽取
        List<Comment> list = JSONObject.parseArray(result , Comment.class);//将每页10条的评论数据构建为Comment对象集合
        for(Comment comment : list){
            System.out.println("评论内容：" + comment.getContent());
            System.out.println("评论点赞数：" + comment.getUsefulVoteCount());
            System.out.println("评论回复数：" + comment.getReplyCount());
            System.out.println("referenceId:" + comment.getReferenceId());
            System.out.println("guid:" + comment.getGuid());
        }*/

        getReply2Comment(url , "9e3f0b48-046a-4195-9e7e-2ab15e4ec0fb");

    }
}