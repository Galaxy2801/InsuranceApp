package com.example.insuranceapp;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AdminController {
    Stage stage = new Stage();

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

        AdminPanelBackButton.setOnAction(event -> {
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
            Stage currentStage = (Stage) AdminPanelBackButton.getScene().getWindow();
            currentStage.close();
        });

    }

}

