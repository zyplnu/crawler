package cn.edu.lnu.client;

import cn.edu.lnu.util.CommentUtil;
import cn.edu.lnu.util.URLConnection;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        int page = 0;
        while(page < 1000   ){
            CommentUtil.getComment(page);
            page++;
        }
    }

}


