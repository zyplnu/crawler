package cn.edu.lnu.client;

import cn.edu.lnu.service.EmotioAnalyzerService;
import cn.edu.lnu.system.SystemPath;
import cn.edu.lnu.util.CommentUtil;
import cn.edu.lnu.util.URLConnection;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) throws FileNotFoundException {

        new EmotioAnalyzerService().printEmotionAnalyzerResult();

    }

}


