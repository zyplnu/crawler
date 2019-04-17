package cn.edu.lnu.pojo;

/**
 * 评论回复内容
 */
public class Reply2Comment {

    private String date;
    private String content;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Reply2Comment{" +
                "date='" + date + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
