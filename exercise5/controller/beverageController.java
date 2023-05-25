package controller;

import model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class beverageController {

    @FXML
    Button milkbutton, bjbutton, waterbutton, melonbutton, gulamanbutton;

    bukojuice bj = new bukojuice();
    gulaman gul = new gulaman();
    melon mel = new melon();
    milk mil = new milk();
    water wat = new water();

    public void initialize() {

        bj.setName("Buko Juice");
        bj.setPrice("Php 120.00");

        gul.setName("Gulaman Juice");
        gul.setPrice("Php 70.00");

        mel.setName("Melon Juice");
        mel.setPrice("Php 90.00");

        mil.setName("Milk");
        mil.setPrice("Php 140.00");

        wat.setName("Water");
        wat.setPrice("Php 40.00");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(milkbutton)) {
            alert.setContentText("Indulge the farm freshness of " + mil.getName() + " for a price of " + mil.getPrice());
        }

        
        if (sourceButton.equals(bjbutton)) {
            alert.setContentText("Introducing the freshness of " + bj.getName() + " for a price of " + bj.getPrice());
        }

        
        if (sourceButton.equals(waterbutton)) {
            alert.setContentText("Not just your ordinary things, but extraordinary! I present to you " + wat.getName() + " for a price of " + wat.getPrice());
        }

        
        if (sourceButton.equals(melonbutton)) {
            alert.setContentText("Indulge the farm freshness of " + mel.getName() + " for a price of " + mel.getPrice());
        }

        
        if (sourceButton.equals(gulamanbutton)) {
            alert.setContentText("Sweet things we got you for our " + gul.getName() + " for a price of " + gul.getPrice());
        }

        alert.showAndWait();
    }
    
}
