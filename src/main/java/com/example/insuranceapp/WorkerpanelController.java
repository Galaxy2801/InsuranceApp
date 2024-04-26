package com.example.insuranceapp;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class WorkerpanelController {
    Stage stage = new Stage();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane Bussiness;

    @FXML
    private AnchorPane Human;

    @FXML
    private AnchorPane Items;

    @FXML
    private BorderPane Workerworkpane;

    @FXML
    private Button back;

    @FXML
    private AnchorPane build;

    @FXML
    private TextField build_field_reg_address;

    @FXML
    private TextField build_field_reg_area;

    @FXML
    private TextField build_field_reg_roomnum;

    @FXML
    private TextField build_field_reg_user;

    @FXML
    private ChoiceBox<String> build_reg_Choicebox_cost_selector;

    @FXML
    private RadioButton build_reg_area_selector_ga;

    @FXML
    private RadioButton build_reg_area_selector_m;

    @FXML
    private Button build_reg_button;

    @FXML
    private RadioButton build_reg_type_selector_earth;

    @FXML
    private RadioButton build_reg_type_selector_home;

    @FXML
    private RadioButton build_reg_type_selector_industrial;

    @FXML
    private Button creationBuild;

    @FXML
    private Button creationBusiness;

    @FXML
    private Button creationHuman;

    @FXML
    private Button creationItems;

    @FXML
    private Button creationTransport;

    @FXML
    private Button exit;

    @FXML
    private TextField human_field_reg_fathername;

    @FXML
    private TextField human_field_reg_name;

    @FXML
    private TextField human_field_reg_prizv;

    @FXML
    private TextField human_field_reg_year;

    @FXML
    private RadioButton human_gender_reg_man;

    @FXML
    private RadioButton human_gender_reg_woman;

    @FXML
    private RadioButton human_health_reg_invalid;

    @FXML
    private RadioButton human_health_reg_zdorov;

    @FXML
    private Button human_reg_button;

    @FXML
    private AnchorPane transport;

    @FXML
    private ChoiceBox<String> transport_choisebox_reg_fuel;

    @FXML
    private ChoiceBox<String> transport_choisebox_reg_type;

    @FXML
    private TextField transport_field_reg_color;

    @FXML
    private TextField transport_field_reg_mark;

    @FXML
    private TextField transport_field_reg_model;

    @FXML
    private TextField transport_field_reg_number;

    @FXML
    private TextField transport_field_reg_user;

    @FXML
    private TextField transport_field_reg_vin;

    @FXML
    private TextField transport_field_reg_volume;

    @FXML
    private Button transport_reg_button;

    @FXML
    private AnchorPane workerpane;


    @FXML
    void handleCreationBuild(ActionEvent event) {
        build.setVisible(true);
        Bussiness.setVisible(false);
        transport.setVisible(false);
        Human.setVisible(false);
        Items.setVisible(false);

    }

    @FXML
    void handleCreationBussiness(ActionEvent event) {
        Bussiness.setVisible(true);
        build.setVisible(false);
        transport.setVisible(false);
        Human.setVisible(false);
        Items.setVisible(false);

    }

    @FXML
    void handleCreationHuman(ActionEvent event) {
        Human.setVisible(true);
        Bussiness.setVisible(false);
        transport.setVisible(false);
        build.setVisible(false);
        Items.setVisible(false);

    }

    @FXML
    void handleCreationItems(ActionEvent event) {
        Items.setVisible(true);
        Bussiness.setVisible(false);
        transport.setVisible(false);
        build.setVisible(false);
        Human.setVisible(false);

    }

    @FXML
    void handleCreationTransport(ActionEvent event) {
        transport.setVisible(true);
        Bussiness.setVisible(false);
        Items.setVisible(false);
        build.setVisible(false);
        Human.setVisible(false);

    }
    //transport
    private String[] fueltype = {"Газ/Бензин","Дизель","Гібрид","Електро"};
    private String[] transporttype = {"A: Мотоцикли","B: Легкові автомобілі","C: Вантажні автомобілі","D: Пасажирські автобуси"};
    //transport

    //build
    private String[] buildcost = {"До 100k $","Від 100k $ до 300k $","Від 300k $ до 1M $","Понад 1M $"};
    //build

    @FXML
    void initialize() {

        //transport
        transport_choisebox_reg_fuel.getItems().addAll(fueltype);
        transport_choisebox_reg_type.getItems().addAll(transporttype);
        //transport

        //build
        ToggleGroup radioGroupArea = new ToggleGroup();
        build_reg_area_selector_ga.setToggleGroup(radioGroupArea);
        build_reg_area_selector_m.setToggleGroup(radioGroupArea);

        ToggleGroup radioGroupBuildType = new ToggleGroup();
        build_reg_type_selector_earth.setToggleGroup(radioGroupBuildType);
        build_reg_type_selector_home.setToggleGroup(radioGroupBuildType);
        build_reg_type_selector_industrial.setToggleGroup(radioGroupBuildType);

        build_reg_Choicebox_cost_selector.getItems().addAll(buildcost);
        //build

        //Human
        ToggleGroup radioGroupHumanGender = new ToggleGroup();
        human_gender_reg_man.setToggleGroup(radioGroupHumanGender);
        human_gender_reg_woman.setToggleGroup(radioGroupHumanGender);

        ToggleGroup radioGroupHumanHealth = new ToggleGroup();
        human_health_reg_zdorov.setToggleGroup(radioGroupHumanHealth);
        human_health_reg_invalid.setToggleGroup(radioGroupHumanHealth);
        //Human

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
            Stage currentStage = (Stage) workerpane.getScene().getWindow();
            currentStage.close();


        });


    }


}
