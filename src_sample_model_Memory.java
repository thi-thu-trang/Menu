package sample.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class Memory {
    private static Memory instance;
    private ObservableList<Category> CategoryList;
    private ObservableList<Product> ProductList;

    public ObservableList<Category> getCategoryList() {
        return CategoryList;
    }

    public ObservableList<Product> getProductList() {
        return ProductList;
    }

    private Memory() {
        ProductList = FXCollections.observableArrayList();
        ProductList.add(new Product(1, 59, "/sample/Image/id01", "da", 1, "CHOCO MATCHA HẠNH NHÂN"));
        ProductList.add(new Product(2, 42, "/sample/Image/id01", "da", 1, "TRÀ SỮA OOLONG HẠNH NHÂN"));
        ProductList.add(new Product(3, 59, "/sample/Image/TheCoffeeHouse.jpg", "da", 1, "CHOCO CHERRY HẠNH NHÂN"));
        ProductList.add(new Product(4, 55, "/sample/Image/TheCoffeeHouse.jpg", "nóng", 1, "CÀ PHÊ HẠNH NHÂN"));
        ProductList.add(new Product(5, 50, "/sample/Image/TheCoffeeHouse.jpg", "nóng", 1, "TRÀ SỮA OOLONG HẠNH NHÂN"));
        ProductList.add(new Product(6, 55, "/sample/Image/TheCoffeeHouse.jpg", "da", 1, "CÀ PHÊ SỮA HẠNH NHÂN"));
        ProductList.add(new Product(7, 55, "/sample/Image/TheCoffeeHouse.jpg", "da", 1, "CÀ PHÊ SỮA HẠNH NHÂN"));
        ProductList.add(new Product(8, 55, "/sample/Image/TheCoffeeHouse.jpg", "da", 1, "CÀ PHÊ SỮA HẠNH NHÂN"));
        ProductList.add(new Product(9, 55, "/sample/Image/TheCoffeeHouse.jpg", "da", 1, "CÀ PHÊ SỮA HẠNH NHÂN"));
        ProductList.add(new Product(10, 55, "/sample/Image/TheCoffeeHouse.jpg", "da", 1, "CÀ PHÊ SỮA HẠNH NHÂN"));


        ProductList.add(new Product(7,59000,"image","image",2,"CHOCO MATCHA HẠNH NHÂN"));
        ProductList.add(new Product(8,42000,"image","image",2,"TRÀ SỮA OOLONG HẠNH NHÂN"));
        ProductList.add(new Product(9,59000,"image","image",2,"CHOCO CHERRY HẠNH NHÂN"));
        ProductList.add(new Product(10,55000,"image","image",2,"CÀ PHÊ SỮA HẠNH NHÂN"));
        ProductList.add(new Product(11,50000,"image","image",2,"CÀ PHÊ HẠNH NHÂN"));
        ProductList.add(new Product(12,55000,"image","image",2,"TRÀ SỮA OOLONG HẠNH NHÂN"));


        CategoryList = FXCollections.observableArrayList();
        CategoryList.add(new Category(1, "MÓN NỔI BẬT"));
        CategoryList.add(new Category(2, "CÀ PHÊ"));
        CategoryList.add(new Category(3, "TRÀ & MACCHIATO"));
        CategoryList.add(new Category(4, "THỨC UỐNG ĐÁ XAY"));
        CategoryList.add(new Category(5, "THỨC UỐNG TRÁI CÂY"));
        CategoryList.add(new Category(6, "BÁNH & SNACK"));

    }
    public static Memory getInstance(){
        if(instance == null)
            instance = new Memory();
        return instance;
    }
}
