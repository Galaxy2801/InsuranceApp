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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.ToggleGroup;
import javafx.stage.StageStyle;

public class SignUpController {
    Stage stage = new Stage();

    @FXML
    private AnchorPane registerpane;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SignUpButton;

    @FXML
    private Button back;

    @FXML
    private TextField signUpFather;

    @FXML
    private TextField signUpName;

    @FXML
    private TextField signUpPrizv;

    @FXML
    private RadioButton signUpRadioButtonAdmin;

    @FXML
    private RadioButton signUpRadioButtonUser;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private PasswordField password_field_double;

    @FXML
    void login_field(ActionEvent event) {

    }

    @FXML
    void password_field(ActionEvent event) {

    }

    @FXML
    void password_field_double(){

    }

    @FXML
    void initialize() {

        ToggleGroup radioGroup = new ToggleGroup();
        signUpRadioButtonAdmin.setToggleGroup(radioGroup);
        signUpRadioButtonUser.setToggleGroup(radioGroup);

        SignUpButton.setOnAction(event -> {

            if (password_field.getText().equals(password_field_double.getText())) {
                signUpNewUser();
                showAlert(Alert.AlertType.INFORMATION, "Успішна реєстрація", "Успішно зареєстровано нового користувача.");
                signUpName.clear();
                signUpPrizv.clear();
                signUpFather.clear();
                login_field.clear();
                password_field.clear();
                password_field_double.clear();

                signUpRadioButtonAdmin.setSelected(false);
                signUpRadioButtonUser.setSelected(false);
            } else {
                showAlert(Alert.AlertType.ERROR, "Помилка", "Паролі не співпадають.");
            }
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
            Stage currentStage = (Stage) registerpane.getScene().getWindow();
            currentStage.close();
        });
    }

    private void signUpNewUser() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String firstName = signUpName.getText();
        String secondName = signUpPrizv.getText();
        String thirdName = signUpFather.getText();
        String userName = login_field.getText();
        String password = password_field.getText();
        String permission = signUpRadioButtonAdmin.isSelected() ? "Адмін" : "Клієнт";

        User user = new User(firstName, secondName, thirdName, userName, password, permission);

        dbHandler.signUpUser(user);
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
