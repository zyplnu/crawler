package cn.edu.lnu.util;

import cn.edu.lnu.pojo.Comment;
import cn.edu.lnu.pojo.Reply2Comment;
import cn.edu.lnu.system.SystemPath;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @description 计算情感句得分和评论关键句得分工具类
 */
public class ComputeUtil {

    /**
     * 根据评论内容计算情感关键句得分
     * @param list 评论内容列表
     * @return 该评论的得分
     */
    public static List<Comment> getEmotionGrade(List<Comment> list){
        System.out.println();
        try {
            System.out.println("情感关键句处理，开始切词...");
            Thread.sleep(2000);//此处休眠是为了视觉效果
        } catch (InterruptedException e) {
            System.out.println("系统休眠2s");
        }
        //1、根据关键词获取得分进行累加emotionGrade
        String keywords = "keywords";//关键词文件名
        String positive = "positive";//正向情感词文件名
        String negative = "negative";//负向情感词文件名
        List<String> wordsList = new ArrayList<>();//关键词文件集合
        List<String> positiveList = new ArrayList<>();//正向情感词文件集合
        List<String> negativeList = new ArrayList<>();//负向情感词文件集合
        wordsList = getWordsListFromFile(keywords);
        positiveList = getWordsListFromFile(positive);
        negativeList = getWordsListFromFile(negative);
        for(Comment comment : list){//根据返回的评论列表进行切词
            comment.setPreContent(comment.getContent());
            comment.setContent(getSegmentWord(comment.getContent()));
            System.out.println(comment.getContent());
            String[] strArr = comment.getContent().split("\\|");//获取切词内容
            float emotionGrade = 0.0f;
            for(String  str : strArr){//根据条件将emotionGrade进行累加
                if(wordsList.contains(str)){
                    emotionGrade += 1.0f;
                }
                if(positiveList.contains(str)){
                    emotionGrade += 1.0f;
                }
                if(negativeList.contains(str)){
                    emotionGrade -= 1.0f;
                }
            }
            comment.setEmotionGrade(emotionGrade);
//            System.out.println(comment.getEmotionGrade());
        }
        return list;
    }

    /**
     * 根据评论回复列表计算评论回复关键句得分
     * @param commentList 评论列表
     * @return 评论回复得分
     */
    public static List<Comment> getReplyGrade(List<Comment> commentList){
        System.out.println();
        try {
            System.out.println("评论关键句处理，开始计算点赞率、支持率...");
            Thread.sleep(2000);//此处休眠是为了视觉效果
        } catch (InterruptedException e) {
            System.out.println("系统休眠2s");
        }
        //计算点赞率（点赞数 / 回复数）
        for(Comment comment : commentList){
            if(comment.getReplyCount() == 0 || comment.getUsefulVoteCount() == 0){ //若点赞数或回复数有一个为0，则设置点赞率为0，避免出现异常
                comment.setLikeRatio(0.0f);
            }else {
                comment.setLikeRatio((comment.getUsefulVoteCount() * 1.0f) / comment.getReplyCount());
            }
        }
        System.out.println("点赞率、支持率计算完成...");
        return commentList;
    }

    /**
     * 获取两个指标加权后的值，返回评论集合
     * @param commentList 初始评论集合
     * @return
     */
    public List<Comment> getFinalResult(List<Comment> commentList){
        List<Comment> resultList = getReplyGrade(getEmotionGrade(commentList));
        try {
            System.out.println("按权重计算情感关键句和评论关键句...");
            Thread.sleep(2000);//此处休眠是为了视觉效果
        } catch (InterruptedException e) {
            System.out.println("系统休眠2s");
        }
        for(Comment comment : resultList){
            comment.setFinalResult(comment.getEmotionGrade() * 0.5f + comment.getLikeRatio() * 0.5f);
        }
        System.out.println("计算完成...");
        return resultList;
    }


    /**
     * 对内容进行切词，返回去除停用词后的分词内容
     * @param content
     */
    public static String getSegmentWord(String content) {
        //独立Lucene实现
        StringReader re = new StringReader(content);
        IKSegmenter ik = new IKSegmenter(re,true);
        Lexeme lex = null;
        String text = "";
        try {
            while((lex=ik.next())!=null){
                text += (lex.getLexemeText()+"|");
            }
            return text;
        }catch (Exception e) {
            System.out.println("切词工具异常...");
        }
        return content;
    }

    /**
     * 根据文件获取文字集合
     * @param fileName 文件名
     * @return 文字集合
     */
    public static List<String> getWordsListFromFile(String fileName){
        List<String> list = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(SystemPath.SYSTEM_PATH_PREFIX + fileName + ".txt")) , "GBK"));
            String line = "";
            while((line = reader.readLine()) != null){
                list.add(line);
            }
            return list;
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return null;
    }

    /*public static void main(String[] args) {
        new ComputeUtil().getFinalResult(CommentUtil.getComment(0));
        *//*System.out.println(System.getProperty("user.dir"));
        ComputeUtil.getEmotionGrade(null);*//*
        *//*String str = "买过|一台|4a|高|配|版|失望|上了|贴|看了|轻易|下手|抱着|不满意|退|想法|下单|机子|一到|试了|吃|鸡|王者|效果|4a|cpu|骁|龙|617|625|综合|比较满意|满意|64g|内存|备|机|合格|";
        String[] strArr = str.split("\\|");
        for(String s : strArr){
            System.out.println(s);
        }*//*
    }*/


}
