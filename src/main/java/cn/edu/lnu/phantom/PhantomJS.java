package cn.edu.lnu.phantom;

import java.io.*;


public class PhantomJS {

    // 如果要更换运行环境，请注意exePath最后的phantom.exe需要更改。因为这个只能在window版本上运行。前面的路径名
    // 也需要和exePath里面的保持一致。否则无法调用

    /**
     * 调用phantomjs程序，并传入js文件，并通过流拿回需要的数据。
     *
     * @param url
     * @return
     * @throws
     */
    public static String getAjaxCotnent(String url) throws IOException {
        Runtime rt =Runtime.getRuntime();

        Process p = rt.exec("phantomjs D:\\workspaces\\crawler\\crawler.js ");

        InputStream is = p.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        StringBuffer sbf = new StringBuffer();

        String tmp = "";

        while((tmp =br.readLine())!=null){

            sbf.append(tmp);

        }

        return sbf.toString();

    }



    public static void main(String[] args) throws IOException{

        System.out.println(getAjaxCotnent(""));

    }
}
