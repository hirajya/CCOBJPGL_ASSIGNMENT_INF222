package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class OrderController implements Initializable{

    @FXML
    Label name1, name2, name3;

    @FXML
    Label price1, price2, price3;

    @FXML 
    Label qty1, qty2, qty3;

    @FXML 
    Label date1, date2, date3;

    @FXML
    Label totalLabel;

    @Override
    public  void initialize(URL arg0, ResourceBundle arg1){
        
        name1.setText(HomeController.blamp.getProductName());
        name2.setText(HomeController.clamp.getProductName());
        name3.setText(HomeController.wlamp.getProductName());

        price1.setText(String.valueOf(HomeController.blamp.getProductPrice()));
        price2.setText(String.valueOf(HomeController.clamp.getProductPrice()));
        price3.setText(String.valueOf(HomeController.wlamp.getProductPrice()));


        qty1.setText(String.valueOf(HomeController.blamp.getProductQuantity()));
        qty2.setText(String.valueOf(HomeController.clamp.getProductQuantity()));
        qty3.setText(String.valueOf(HomeController.wlamp.getProductQuantity()));

        totalLabel.setText(CheckoutController.totalSagad);

        date1.setText("6 / 1 / 23");
        date2.setText("6 / 1 / 23");
        date3.setText("6 / 1 / 23");
    
    }

    // public static void setTotal(String total) {
    //     totalTalaga = total;
    // }

}