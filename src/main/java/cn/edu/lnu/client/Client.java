package cn.edu.lnu.client;

import cn.edu.lnu.service.EmotioAnalyzerService;
import cn.edu.lnu.util.CommentUtil;
import cn.edu.lnu.util.URLConnection;

import java.io.*;
import java.util.ResourceBundle;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {

        new EmotioAnalyzerService().printEmotionAnalyzerResult();
        /*float a = 1.0f;
        float b = 0.5f;
        System.out.println((int)b - a);*/
    }

}


