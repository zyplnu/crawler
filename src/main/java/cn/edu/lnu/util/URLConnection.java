package cn.edu.lnu.util;

import cn.edu.lnu.pojo.Comment;
import cn.edu.lnu.pojo.Reply2Comment;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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

}