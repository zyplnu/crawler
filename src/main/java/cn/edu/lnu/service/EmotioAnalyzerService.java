package cn.edu.lnu.service;

import cn.edu.lnu.pojo.Comment;
import cn.edu.lnu.pojo.Reply2Comment;
import cn.edu.lnu.util.CommentUtil;
import cn.edu.lnu.util.ComputeUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 情感分析服务组件
 * @description 根据计算结果对评论列表进行筛选
 */
public class EmotioAnalyzerService {

    public void printEmotionAnalyzerResult(){
        List<Comment> list = new ComputeUtil().getFinalResult(CommentUtil.getComment(0));

        System.out.println("-------------------------");
        System.out.println("处理前得分列表：");
        for (Comment comment : list){
            System.out.print(comment.getFinalResult() + "\t");
        }

        Collections.sort(list, new Comparator<Comment>() {
            @Override
            public int compare(Comment o1, Comment o2) {
                if(o1.getFinalResult() - o2.getFinalResult() > 0){
                    return -1;
                }else if(o1.getFinalResult() - o2.getFinalResult() < 0){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("处理后得分列表：");
        for(Comment comment : list){
            System.out.print(comment.getFinalResult() + "\t");
        }
        System.out.println();
        for(int i = 0; i < 10; i++){
            System.out.println("---------------------------");
            System.out.println("最终得分：" + list.get(i).getFinalResult());
            System.out.println("评论内容：" + list.get(i).getPreContent());
            System.out.println("评论回复内容：");
            List<Reply2Comment> reply2CommentList = list.get(i).getReply2CommentList();
            for(Reply2Comment reply : reply2CommentList){
                System.out.println("\t\t【" + reply.getUser() + "】:" + reply.getContent());
            }
        }
    }

}
