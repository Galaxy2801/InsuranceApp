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
import javafx.scene.control.Alert;
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

    public static String NAME;

    @FXML
    void login_field(ActionEvent event) {

    }

    @FXML
    void password_field(ActionEvent event) {

    }

    @FXML
    void initialize() {
        exit.setOnAction(event -> {
            Stage stage = (Stage) exit.getScene().getWindow();
            stage.close();
        });

        authSigInButton.setOnAction(event -> {
            String loginText = login_field.getText().trim();
            String loginPassword = password_field.getText().trim();

            if (loginText.isEmpty() || loginPassword.isEmpty()) {
                showAlert("Будь ласка, заповніть всі поля !");
                return;
            }

            NAME = loginText;

            loginUser(loginText, loginPassword);
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
        boolean isAdmin = false;
        boolean isSuperAdmin = false;

        try {
            while (result.next()) {
                counter++;
                userPermission = result.getString(Const.USER_PERMISSION);
                if (userPermission.equals("Адмін")) {
                    isAdmin = true;
                } else if (userPermission.equals("СуперАдмін")) {
                    isSuperAdmin = true;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (counter == 1) {
            System.out.println("Success! User permission: " + userPermission);
            if (isSuperAdmin) {
                openSuperAdminPanel();
            } else if (isAdmin) {
                openAdminPanel();
            } else {
                openUserPanel();
            }
        } else if (counter > 1) {
            showAlert("Знайдено повторення користувачів !");
        } else {
            showAlert("Введіть правильний логін та пароль !");
        }
    }


    private void openAdminPanel() {
        openPanel("Workerpanel.fxml");
    }

    private void openUserPanel() {
        openPanel("Userpanel.fxml");
    }

    private void openSuperAdminPanel() {
        openPanel("AdminPanel.fxml");
    }

    private void openPanel(String panelFXML) {
        Parent root = null;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource(panelFXML)));
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

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Попередження");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public void register(MouseEvent mouseEvent) throws IOException {
        openPanel("signup.fxml");
    }
}
