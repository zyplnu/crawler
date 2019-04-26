package cn.edu.lnu.util;

import cn.edu.lnu.pojo.Comment;
import cn.edu.lnu.pojo.Reply2Comment;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
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
    public static String getHtml2(String url){
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

    public static String getHtml(String url) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet(url);
            CloseableHttpResponse response = httpclient.execute(httpget);
            try {
                // 获取响应实体
                HttpEntity entity = response.getEntity();
                // 打印响应状态
                if (entity != null) {
                    return EntityUtils.toString(entity);
                }
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭连接,释放资源
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}