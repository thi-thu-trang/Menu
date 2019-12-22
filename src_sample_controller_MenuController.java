package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import sample.model.Category;
import sample.model.Memory;
import sample.model.Product;
import sample.model.ProductPane;


import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicInteger;

public class MenuController implements Initializable {

    List<Category> categoryList = Memory.getInstance().getCategoryList();
    List<Product> productList = Memory.getInstance().getProductList();

    @FXML
    private VBox VboxCategory;

    @FXML
    private Label title;

    @FXML
    private FlowPane productFlowPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Memory.getInstance().getCategoryList().forEach(category -> {
            Button button = new Button(category.getName());
            button.setOnAction(event -> {
                viewProductPane(category.getId());
                title.setText(category.getName());
            });
            viewProductPane(1);
            VboxCategory.getChildren().add(button);
        });
    }
    void viewProductPane(int id) {
        productFlowPane.getChildren().clear();
        AtomicInteger x = new AtomicInteger();
        AtomicInteger y = new AtomicInteger();
        Memory.getInstance().getProductList().
                filtered(product -> product.getCategoryId() == id).
                forEach(product -> {
                    ProductPane productPane = new ProductPane(product);
                    productPane.setMinWidth(productFlowPane.getPrefWidth()/3-5 );
                    productPane.setMaxWidth(productFlowPane.getPrefWidth()/3-5);
                    productPane.setMinHeight(productFlowPane.getPrefWidth()/2 - 5);
                    productPane.setMaxHeight(productFlowPane.getPrefWidth()/2 - 5);
                    productFlowPane.setHgap(2);
                    productFlowPane.setVgap(3);

                    productFlowPane.getChildren().add(productPane);
                });
    }


}

