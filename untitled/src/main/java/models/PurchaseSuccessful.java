package models;

public class PurchaseSuccessful {
    private String categories;
    private String numProduct;
    private String size;

    public PurchaseSuccessful(String categories, String numProduct, String size) {
        this.categories = categories;
        this.numProduct = numProduct;
        this.size = size;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getNumProduct() {
        return numProduct;
    }

    public void setNumProduct(String numProduct) {
        this.numProduct = numProduct;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}