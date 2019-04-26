package cn.edu.lnu.client;

import cn.edu.lnu.util.CommentUtil;
import cn.edu.lnu.util.URLConnection;

import java.io.*;
import java.util.ResourceBundle;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        int page = 0;
//        while(page < 10){
            CommentUtil.getComment(page);
//            page++;
//        }
    }

}


