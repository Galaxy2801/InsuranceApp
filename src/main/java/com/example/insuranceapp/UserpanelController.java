package com.example.insuranceapp;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class UserpanelController {
    Stage stage = new Stage();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Build;

    @FXML
    private AnchorPane Buildview;

    @FXML
    private Button Business;

    @FXML
    private AnchorPane Businessview;

    @FXML
    private Button Human;

    @FXML
    private AnchorPane Humanview;

    @FXML
    private Button Items;

    @FXML
    private AnchorPane Itemview;

    @FXML
    private Button Transport;

    @FXML
    private AnchorPane Transportview;

    @FXML
    private Button back;

    @FXML
    private Button exit;

    @FXML
    private AnchorPane userpane;

    @FXML
    void handleViewBuild(ActionEvent event) {
        Transportview.setVisible(false);
        Buildview.setVisible(true);
        Humanview.setVisible(false);
        Itemview.setVisible(false);
        Businessview.setVisible(false);
    }

    @FXML
    void handleViewBusiness(ActionEvent event) {
        Transportview.setVisible(false);
        Buildview.setVisible(false);
        Humanview.setVisible(false);
        Itemview.setVisible(false);
        Businessview.setVisible(true);
    }

    @FXML
    void handleViewHuman(ActionEvent event) {
        Transportview.setVisible(false);
        Buildview.setVisible(false);
        Humanview.setVisible(true);
        Itemview.setVisible(false);
        Businessview.setVisible(false);
    }

    @FXML
    void handleViewItems(ActionEvent event) {
        Transportview.setVisible(false);
        Buildview.setVisible(false);
        Humanview.setVisible(false);
        Itemview.setVisible(true);
        Businessview.setVisible(false);
    }

    @FXML
    void handleViewTransport(ActionEvent event) {
        Transportview.setVisible(true);
        Buildview.setVisible(false);
        Humanview.setVisible(false);
        Itemview.setVisible(false);
        Businessview.setVisible(false);
    }

    @FXML
    void initialize() {
        exit.setOnAction(event -> {
            Stage stage = (Stage) exit.getScene().getWindow();
            stage.close();
        });

        back.setOnAction(event -> {
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("login.fxml")));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Scene scene = new Scene(root);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
            Stage currentStage = (Stage) userpane.getScene().getWindow();
            currentStage.close();
        });
    }

}
