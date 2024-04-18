package com.example.insuranceapp;


import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import javafx.stage.StageStyle;

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
        exit.setOnAction(event -> {
            Stage stage = (Stage) exit.getScene().getWindow();
            stage.close();
        });

        authSigInButton.setOnAction(event -> {
            String loginText = login_field.getText().trim();
            String loginPassword = password_field.getText().trim();

            if(!loginText.equals("") && !loginPassword.equals(""))
                loginUser(loginText, loginPassword);
            else
                System.out.println("Login and password are empty");
        });
    }

    private void loginUser(String loginText, String loginPassword) {
        DatabaseHandler dbHandler = new DatabaseHandler();
        User user = new User();
        user.setUserName(loginText);
        user.setPassword(loginPassword);
        ResultSet result = dbHandler.getUser(user);

        int counter = 0;
        String userPermission = "";

        try {
            while (result.next()) {
                counter++;
                userPermission = result.getString(Const.USER_PERMISSION);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (counter == 1) {
            System.out.println("Success! User permission: " + userPermission);
            if (userPermission.equals("Адмін")) {
                Parent root = null;
                try {
                    root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("Workerpanel.fxml")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Scene scene = new Scene(root);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(scene);
                stage.show();
                Stage currentStage = (Stage) registerpane.getScene().getWindow();
                currentStage.close();
            }
            else if (userPermission.equals("Клієнт")) {
                Parent root = null;
                try {
                    root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("Userpanel.fxml")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Scene scene = new Scene(root);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(scene);
                stage.show();
                Stage currentStage = (Stage) registerpane.getScene().getWindow();
                currentStage.close();
            }
        } else if (counter > 1) {
            System.out.println("Duplicate users found!");
        } else {
            System.out.println("Incorrect username or password!");

        }
    }

    public void register(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("signup.fxml")));
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage currentStage = (Stage) registerpane.getScene().getWindow();
        currentStage.close();
    }



}

