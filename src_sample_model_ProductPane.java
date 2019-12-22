package sample.model;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.InputStream;

public class ProductPane extends VBox {
    private Product product;
    public ProductPane(Product product){
        this.product = product;
        this.setStyle("-fx-border-color: black");

        ImageView productImage = new ImageView();
        File file = new File(product.getImage());
        if (!file.exists()) {
            file = new File("/sample/Image/TheCoffeeHouse.jpg");
        }
        Image image = new Image(file.toURI().toString());
        productImage.setImage(image);
        productImage.setFitWidth(200);
        productImage.setFitHeight(150);

        this.getChildren().add(productImage);
        Label productName = new Label(product.getName());
        productName.setWrapText(true);
        this.getChildren().add(productName);
        this.getChildren().add(new Label(String.valueOf(product.getPrice())));
        this.setSpacing(10);
        Button addToCart = new Button("Add To Cart");
        addToCart.setOnMouseClicked(e-> {
            System.out.println(product);
        });
        this.getChildren().add(addToCart);


    }

    public Product getProduct() {
        return product;
    }
}
