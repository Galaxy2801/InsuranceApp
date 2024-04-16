package com.example.insuranceapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.ToggleGroup;

public class SignUpController {
    Stage stage = new Stage();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SignUpButton;

    @FXML
    private Button exit;

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
    void login_field(ActionEvent event) {

    }

    @FXML
    void password_field(ActionEvent event) {

    }

    @FXML
    void initialize() {

        ToggleGroup radioGroup = new ToggleGroup();
        signUpRadioButtonAdmin.setToggleGroup(radioGroup);
        signUpRadioButtonUser.setToggleGroup(radioGroup);

        SignUpButton.setOnAction(event -> {

            signUpNewUser();

        });

        exit.setOnAction(event -> {
            Stage stage = (Stage) exit.getScene().getWindow();
            stage.close();
        });
    }

    private void signUpNewUser() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String firstName = signUpName.getText();
        String secondName = signUpPrizv.getText();
        String thirdName = signUpFather.getText();
        String userName = login_field.getText();
        String password = password_field.getText();
        String gender = "";
        if (signUpRadioButtonAdmin.isSelected())
            gender = "Адмін";
        else
            gender = "Клієнт";

        User user = new User(firstName, secondName, thirdName, userName, password, gender);

        dbHandler.signUpUser(user);
    }

}
