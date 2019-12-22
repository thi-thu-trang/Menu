package sample.model;

public class Product {
    private  int id;
    private  double price;
    private  String image;
    private String detail;
    private  int CategoryId;
    private String name;

    public Product(int id, double price, String image, String detail, int idCategory, String name) {
        this.id = id;
        this.price = price;
        this.image = image;
        this.detail = detail;
        this.CategoryId = idCategory;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        this.CategoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
