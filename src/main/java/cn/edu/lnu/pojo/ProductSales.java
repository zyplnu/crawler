package cn.edu.lnu.pojo;

/**
 *
 * 商品评论对象
 */
public class ProductSales {

    private int dim;
    private String saleName;
    private String saleValue;

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public String getSaleValue() {
        return saleValue;
    }

    public void setSaleValue(String saleValue) {
        this.saleValue = saleValue;
    }

    @Override
    public String toString() {
        return "ProductSales{" +
                "dim=" + dim +
                ", saleName='" + saleName + '\'' +
                ", saleValue='" + saleValue + '\'' +
                '}';
    }
}
