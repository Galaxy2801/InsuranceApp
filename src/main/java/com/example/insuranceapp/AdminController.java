package com.example.insuranceapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class AdminController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane AdminPanel;

    @FXML
    private Button AdminPanelBackButton;

    @FXML
    private Button AdminPanelSetAdmin;

    @FXML
    private Button AdminPanelSetUser;

    @FXML
    private TextArea AdminPanelShowUser;

    @FXML
    private ChoiceBox<?> AdminPanelUserChoiceBox;

    @FXML
    void initialize() {

    }

}

