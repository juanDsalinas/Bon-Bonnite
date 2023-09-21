package models;

public class PurchaseSuccessfulModel {
    private String categories;
    private String numProduct;
    private String size;

    private String color;


    public PurchaseSuccessfulModel(String categories, String numProduct, String size, String color) {
        this.categories = categories;
        this.numProduct = numProduct;
        this.size = size;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}