package cn.edu.lnu.pojo;
/**
 * 商品评论对象
 */
public class Video {

    private int videoHeight;
    private int dealt;
    private String remark;
    private String videoUrl;
    private String videoTitle;
    private int videoWidth;
    private String mainUrl;
    private int available;
    private String productId;
    private String id;
    private String associateId;
    private int jShow;
    private String pin;
    private int videoLength;
    private int yn;
    private int isMain;

    public int getVideoHeight() {
        return videoHeight;
    }

    public void setVideoHeight(int videoHeight) {
        this.videoHeight = videoHeight;
    }

    public int getDealt() {
        return dealt;
    }

    public void setDealt(int dealt) {
        this.dealt = dealt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public int getVideoWidth() {
        return videoWidth;
    }

    public void setVideoWidth(int videoWidth) {
        this.videoWidth = videoWidth;
    }

    public String getMainUrl() {
        return mainUrl;
    }

    public void setMainUrl(String mainUrl) {
        this.mainUrl = mainUrl;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAssociateId() {
        return associateId;
    }

    public void setAssociateId(String associateId) {
        this.associateId = associateId;
    }

    public int getjShow() {
        return jShow;
    }

    public void setjShow(int jShow) {
        this.jShow = jShow;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getVideoLength() {
        return videoLength;
    }

    public void setVideoLength(int videoLength) {
        this.videoLength = videoLength;
    }

    public int getYn() {
        return yn;
    }

    public void setYn(int yn) {
        this.yn = yn;
    }

    public int getIsMain() {
        return isMain;
    }

    public void setIsMain(int isMain) {
        this.isMain = isMain;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoHeight=" + videoHeight +
                ", dealt=" + dealt +
                ", remark='" + remark + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", videoTitle='" + videoTitle + '\'' +
                ", videoWidth=" + videoWidth +
                ", mainUrl='" + mainUrl + '\'' +
                ", available=" + available +
                ", productId='" + productId + '\'' +
                ", id='" + id + '\'' +
                ", associateId='" + associateId + '\'' +
                ", jShow=" + jShow +
                ", pin='" + pin + '\'' +
                ", videoLength=" + videoLength +
                ", yn=" + yn +
                ", isMain=" + isMain +
                '}';
    }
}
