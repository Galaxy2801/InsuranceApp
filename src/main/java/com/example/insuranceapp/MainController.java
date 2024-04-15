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


import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {
    @FXML
    public AnchorPane registerpane;

    Stage stage = new Stage();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button authSigInButton;

    @FXML
    private Button exit;

    @FXML
    private Button loginSignUpButton;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    void login_field(ActionEvent event) {

    }

    @FXML
    void password_field(ActionEvent event) {

    }

    @FXML
    void initialize()
    {

    }

    public void register(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("signup.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage currentStage = (Stage) registerpane.getScene().getWindow();
        currentStage.close();
    }



}

