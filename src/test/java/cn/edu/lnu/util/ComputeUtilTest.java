package cn.edu.lnu.util;

import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

import java.io.StringReader;

/**
 * 计算工具测试类
 */
public class ComputeUtilTest {

    public static void main(String[] args) {
        String text = "基于java语言高兴一下开发的轻量级的中文分词工具包";

        //独立Lucene实现
        StringReader re = new StringReader(text);
        IKSegmenter ik = new IKSegmenter(re,true);
        Lexeme lex = null;
        try {
            while((lex=ik.next())!=null){
                System.out.print(lex.getLexemeText()+"|");
            }
        }catch (Exception e) {
        }
    }

}
