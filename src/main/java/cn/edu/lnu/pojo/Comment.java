package cn.edu.lnu.pojo;

import java.util.List;

/**
 * 商品评论对象
 */
public class Comment {

    private int replyCount;
    private int usefulVoteCount;
    private int mergeOrderStatus;
    private String referenceTime;
    private String userImage;
    private int score;
    private int integral;
    private List<ProductSales> productSales;
    private String creationTime;
    private int userImgFlag;
    private String userLevelColor;
    private int replyCount2;
    private int status;
    private String nickname;
    private List<Video> video;
    private int topped;
    private String content;
    private String preContent;//保存分词前的文本内容
    private String userLevelName;
    private boolean isReplyGrade;
    private List<Reply> replies;
    private int anonymousFlag;
    private String userProvince;
    private int secondCategory;
    private List<Images> images;
    private boolean isMobile;
    private int firstCategory;
    private int viewCount;
    private List<ShowOrderComment> showOrderComment;
    private String userLevelId;
    private int officialsStatus;
    private String mobileVersion;
    private int imageCount;
    private boolean recommend;
    private long id;
    private String title;
    private String referenceType;
    private int uselessVoteCount;
    private boolean isTop;
    private long discussionId;
    private long orderId;
    private int afterDays;
    private String userImageUrl;
    private String referenceId;
    private int thirdCategory;
    private String productSize;
    private String userClientShow;
    private String referenceName;
    private int referenceTypeId;
    private String guid;
    private String productColor;
    private int days;
    private int plusAvailable;
    private String referenceImage;

    private float emotionGrade;//评论得分
    private List<Reply2Comment> reply2CommentList; //评论回复列表
    private float likeRatio;//点赞率
    private float finalResult;//情感得分*0.5 + 评论关键句得分*0.5

    public String getPreContent() {
        return preContent;
    }

    public void setPreContent(String preContent) {
        this.preContent = preContent;
    }

    public float getFinalResult() {
        return finalResult;
    }

    public void setFinalResult(float finalResult) {
        this.finalResult = finalResult;
    }

    public float getLikeRatio() {
        return likeRatio;
    }

    public void setLikeRatio(float likeRatio) {
        this.likeRatio = likeRatio;
    }

    public float getEmotionGrade() {
        return emotionGrade;
    }

    public void setEmotionGrade(float emotionGrade) {
        this.emotionGrade = emotionGrade;
    }

    public List<Reply2Comment> getReply2CommentList() {
        return reply2CommentList;
    }

    public void setReply2CommentList(List<Reply2Comment> reply2CommentList) {
        this.reply2CommentList = reply2CommentList;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public int getUsefulVoteCount() {
        return usefulVoteCount;
    }

    public void setUsefulVoteCount(int usefulVoteCount) {
        this.usefulVoteCount = usefulVoteCount;
    }

    public int getMergeOrderStatus() {
        return mergeOrderStatus;
    }

    public void setMergeOrderStatus(int mergeOrderStatus) {
        this.mergeOrderStatus = mergeOrderStatus;
    }

    public String getReferenceTime() {
        return referenceTime;
    }

    public void setReferenceTime(String referenceTime) {
        this.referenceTime = referenceTime;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public List<ProductSales> getProductSales() {
        return productSales;
    }

    public void setProductSales(List<ProductSales> productSales) {
        this.productSales = productSales;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public int getUserImgFlag() {
        return userImgFlag;
    }

    public void setUserImgFlag(int userImgFlag) {
        this.userImgFlag = userImgFlag;
    }

    public String getUserLevelColor() {
        return userLevelColor;
    }

    public void setUserLevelColor(String userLevelColor) {
        this.userLevelColor = userLevelColor;
    }

    public int getReplyCount2() {
        return replyCount2;
    }

    public void setReplyCount2(int replyCount2) {
        this.replyCount2 = replyCount2;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<Video> getVideo() {
        return video;
    }

    public void setVideo(List<Video> video) {
        this.video = video;
    }

    public int getTopped() {
        return topped;
    }

    public void setTopped(int topped) {
        this.topped = topped;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserLevelName() {
        return userLevelName;
    }

    public void setUserLevelName(String userLevelName) {
        this.userLevelName = userLevelName;
    }

    public boolean isReplyGrade() {
        return isReplyGrade;
    }

    public void setReplyGrade(boolean replyGrade) {
        isReplyGrade = replyGrade;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }

    public int getAnonymousFlag() {
        return anonymousFlag;
    }

    public void setAnonymousFlag(int anonymousFlag) {
        this.anonymousFlag = anonymousFlag;
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince;
    }

    public int getSecondCategory() {
        return secondCategory;
    }

    public void setSecondCategory(int secondCategory) {
        this.secondCategory = secondCategory;
    }

    public List<Images> getImages() {
        return images;
    }

    public void setImages(List<Images> images) {
        this.images = images;
    }

    public boolean isMobile() {
        return isMobile;
    }

    public void setMobile(boolean mobile) {
        isMobile = mobile;
    }

    public int getFirstCategory() {
        return firstCategory;
    }

    public void setFirstCategory(int firstCategory) {
        this.firstCategory = firstCategory;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public List<ShowOrderComment> getShowOrderComment() {
        return showOrderComment;
    }

    public void setShowOrderComment(List<ShowOrderComment> showOrderComment) {
        this.showOrderComment = showOrderComment;
    }

    public String getUserLevelId() {
        return userLevelId;
    }

    public void setUserLevelId(String userLevelId) {
        this.userLevelId = userLevelId;
    }

    public int getOfficialsStatus() {
        return officialsStatus;
    }

    public void setOfficialsStatus(int officialsStatus) {
        this.officialsStatus = officialsStatus;
    }

    public String getMobileVersion() {
        return mobileVersion;
    }

    public void setMobileVersion(String mobileVersion) {
        this.mobileVersion = mobileVersion;
    }

    public int getImageCount() {
        return imageCount;
    }

    public void setImageCount(int imageCount) {
        this.imageCount = imageCount;
    }

    public boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    public int getUselessVoteCount() {
        return uselessVoteCount;
    }

    public void setUselessVoteCount(int uselessVoteCount) {
        this.uselessVoteCount = uselessVoteCount;
    }

    public boolean isTop() {
        return isTop;
    }

    public void setTop(boolean top) {
        isTop = top;
    }

    public long getDiscussionId() {
        return discussionId;
    }

    public void setDiscussionId(long discussionId) {
        this.discussionId = discussionId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public int getAfterDays() {
        return afterDays;
    }

    public void setAfterDays(int afterDays) {
        this.afterDays = afterDays;
    }

    public String getUserImageUrl() {
        return userImageUrl;
    }

    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public int getThirdCategory() {
        return thirdCategory;
    }

    public void setThirdCategory(int thirdCategory) {
        this.thirdCategory = thirdCategory;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public String getUserClientShow() {
        return userClientShow;
    }

    public void setUserClientShow(String userClientShow) {
        this.userClientShow = userClientShow;
    }

    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    public int getReferenceTypeId() {
        return referenceTypeId;
    }

    public void setReferenceTypeId(int referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getPlusAvailable() {
        return plusAvailable;
    }

    public void setPlusAvailable(int plusAvailable) {
        this.plusAvailable = plusAvailable;
    }

    public String getReferenceImage() {
        return referenceImage;
    }

    public void setReferenceImage(String referenceImage) {
        this.referenceImage = referenceImage;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "replyCount=" + replyCount +
                ", usefulVoteCount=" + usefulVoteCount +
                ", mergeOrderStatus=" + mergeOrderStatus +
                ", referenceTime='" + referenceTime + '\'' +
                ", userImage='" + userImage + '\'' +
                ", score=" + score +
                ", integral=" + integral +
                ", productSales=" + productSales +
                ", creationTime='" + creationTime + '\'' +
                ", userImgFlag=" + userImgFlag +
                ", userLevelColor='" + userLevelColor + '\'' +
                ", replyCount2=" + replyCount2 +
                ", status=" + status +
                ", nickname='" + nickname + '\'' +
                ", video=" + video +
                ", topped=" + topped +
                ", content='" + content + '\'' +
                ", userLevelName='" + userLevelName + '\'' +
                ", isReplyGrade=" + isReplyGrade +
                ", replies=" + replies +
                ", anonymousFlag=" + anonymousFlag +
                ", userProvince='" + userProvince + '\'' +
                ", secondCategory=" + secondCategory +
                ", images=" + images +
                ", isMobile=" + isMobile +
                ", firstCategory=" + firstCategory +
                ", viewCount=" + viewCount +
                ", showOrderComment=" + showOrderComment +
                ", userLevelId='" + userLevelId + '\'' +
                ", officialsStatus=" + officialsStatus +
                ", mobileVersion='" + mobileVersion + '\'' +
                ", imageCount=" + imageCount +
                ", recommend=" + recommend +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", referenceType='" + referenceType + '\'' +
                ", uselessVoteCount=" + uselessVoteCount +
                ", isTop=" + isTop +
                ", discussionId=" + discussionId +
                ", orderId=" + orderId +
                ", afterDays=" + afterDays +
                ", userImageUrl='" + userImageUrl + '\'' +
                ", referenceId='" + referenceId + '\'' +
                ", thirdCategory=" + thirdCategory +
                ", productSize='" + productSize + '\'' +
                ", userClientShow='" + userClientShow + '\'' +
                ", referenceName='" + referenceName + '\'' +
                ", referenceTypeId=" + referenceTypeId +
                ", guid='" + guid + '\'' +
                ", productColor='" + productColor + '\'' +
                ", days=" + days +
                ", plusAvailable=" + plusAvailable +
                ", referenceImage='" + referenceImage + '\'' +
                '}';
    }
}
