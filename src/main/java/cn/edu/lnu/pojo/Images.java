package cn.edu.lnu.pojo;
/**
 * 商品评论对象
 */
public class Images {

    private String imgUrl;
    private String id;
    private String associateId;
    private int jShow;
    private int dealt;
    private String pin;
    private int available;
    private int isMain;
    private String imgTitle;
    private int productId;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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

    public int getDealt() {
        return dealt;
    }

    public void setDealt(int dealt) {
        this.dealt = dealt;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getIsMain() {
        return isMain;
    }

    public void setIsMain(int isMain) {
        this.isMain = isMain;
    }

    public String getImgTitle() {
        return imgTitle;
    }

    public void setImgTitle(String imgTitle) {
        this.imgTitle = imgTitle;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Images{" +
                "imgUrl='" + imgUrl + '\'' +
                ", id='" + id + '\'' +
                ", associateId='" + associateId + '\'' +
                ", jShow=" + jShow +
                ", dealt=" + dealt +
                ", pin='" + pin + '\'' +
                ", available=" + available +
                ", isMain=" + isMain +
                ", imgTitle='" + imgTitle + '\'' +
                ", productId=" + productId +
                '}';
    }
}
