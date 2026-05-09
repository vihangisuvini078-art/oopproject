package model;

public class Product {

    private int productId;
    private String productName;
    private String category;
    private double price;
    private String ecoRating;

    public Product() {
    }

    public Product(int productId, String productName, String category, double price, String ecoRating) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.ecoRating = ecoRating;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
}
}