package cn.edu.lnu.util;

import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class DownloadPic {
    static int count = 1;

    public static String getHtml(String url){
        BufferedReader in = null;
        //定义字符缓冲区
        StringBuffer stringBuffer = new StringBuffer();
        try {

            URL net = new URL(url);

            URLConnection connection = net.openConnection();

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

    public static List<String> getImgSrc(String htmlStr) {
        List<String> pics = new ArrayList<>();
        String img = "";
        Pattern p_image;
        Matcher m_image;
        //     String regEx_img = "<img.*src=(.*?)[^>]*?>"; //图片链接地址
        String regEx_img = "<img.*src\\s*=\\s*(.*?)[^>]*?>";
        p_image = Pattern.compile
                (regEx_img, Pattern.CASE_INSENSITIVE);
        m_image = p_image.matcher(htmlStr);
        while (m_image.find()) {
            // 得到<img />数据
            img = m_image.group();
            // 匹配<img>中的src数据
            Matcher m = Pattern.compile("src\\s*=\\s*\"?(.*?)(\"|>|\\s+)").matcher(img);
            while (m.find()) {
                pics.add(m.group(1));
            }
        }
        return pics;
    }

    public static void main(String[] args) throws IOException {
        String start = "3100000";
        String end = "3100999";
        String content;
        for(int i = Integer.parseInt(start); i <= Integer.parseInt(end) ; i++){
            String urlt = "http://bai.com/p/" + String.valueOf(i);
            //System.out.println(url);
            content = getHtml(urlt);
            List<String> list = getImgSrc(content);
           // System.out.println(list);
            for(String str : list){
                if(str.endsWith(".jpeg")){
                    System.out.println("第" + count + "张图片开始下载...");
                    String dest = str.substring(str.lastIndexOf("/") + 1);
                    System.out.println(dest);
                    URL url = new URL(str);
                    java.net.URLConnection connection = url.openConnection();
                    InputStream inputStream = connection.getInputStream();
                    String local = "D:/image/";
                    OutputStream outputStream = new FileOutputStream(new File(local + dest));
                    byte[] b = new byte[1024];
                    int len;
                    while((len = inputStream.read(b)) != -1){
                        outputStream.write(b ,0 , len);
                    }
                    count++;
                    System.out.println("下载完毕.");
                }
            }
            content = "";
        }
    }

}
