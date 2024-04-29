package com.example.insuranceapp;

import java.io.IOException;
import java.net.URL;
import java.util.List;
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
import javafx.scene.control.Alert;
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
    private TextField Item_field_reg_cost;

    @FXML
    private TextField Item_field_reg_name;

    @FXML
    private TextField Item_field_reg_stanmaina;

    @FXML
    private Button Item_reg_button;

    @FXML
    private ChoiceBox<String> Item_reg_choisebox_compensation;

    @FXML
    private ChoiceBox<String> Item_reg_choisebox_user;

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
    private ChoiceBox<String> build_reg_Choicebox_cost_selector;

    @FXML
    private RadioButton build_reg_area_selector_ga;

    @FXML
    private RadioButton build_reg_area_selector_m;

    @FXML
    private Button build_reg_button;

    @FXML
    private ChoiceBox<String> build_reg_choisebox_user;

    @FXML
    private RadioButton build_reg_type_selector_earth;

    @FXML
    private RadioButton build_reg_type_selector_home;

    @FXML
    private RadioButton build_reg_type_selector_industrial;

    @FXML
    private TextField bussiness_field_reg_costbussiness;

    @FXML
    private TextField bussiness_field_reg_moneyinyear;

    @FXML
    private TextField bussiness_field_reg_name;

    @FXML
    private TextField bussiness_field_reg_sphere;

    @FXML
    private Button bussiness_reg_button;

    @FXML
    private ChoiceBox<String> bussiness_reg_choisebox_compensation;

    @FXML
    private ChoiceBox<String> bussiness_reg_choisebox_user;

    @FXML
    private RadioButton bussiness_reg_radiobutton_vidpovidal_no;

    @FXML
    private RadioButton bussiness_reg_radiobutton_vidpovidal_yes;

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
    private ChoiceBox<String> human_reg_choisebox_user;

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
    private TextField transport_field_reg_vin;

    @FXML
    private TextField transport_field_reg_volume;

    @FXML
    private Button transport_reg_button;

    @FXML
    private ChoiceBox<String> transport_reg_choisebox_user;

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
    private String[] fueltype = {"Бензин","Газ/Бензин","Дизель","Гібрид","Електро"};
    private String[] transporttype = {"A: Мотоцикли","B: Легкові автомобілі","C: Вантажні автомобілі","D: Пасажирські автобуси"};
    //transport

    //build
    private String[] buildcost = {"До 100k $","Від 100k $ до 300k $","Від 300k $ до 1M $","Понад 1M $"};
    //build

    //bussiness
    private String[] bussinescompensation = {"30%","50%","70%","100%"};
    //bussiness

    //item
    private String[] itemcompensation = {"30%", "35%", "40%", "45%", "50%", "55%", "60%", "65%", "70%", "75%", "80%", "85%", "90%", "95%", "100%"};
    //item

    @FXML
    void initialize() {

        //transport
        transport_choisebox_reg_fuel.getItems().addAll(fueltype);
        transport_choisebox_reg_type.getItems().addAll(transporttype);
        DatabaseHandler dbHandler = new DatabaseHandler();
        List<String> items = dbHandler.getItemsFromDatabase();
        transport_reg_choisebox_user.getItems().addAll(items);
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
        build_reg_choisebox_user.getItems().addAll(items);
        //build

        //Human
        ToggleGroup radioGroupHumanGender = new ToggleGroup();
        human_gender_reg_man.setToggleGroup(radioGroupHumanGender);
        human_gender_reg_woman.setToggleGroup(radioGroupHumanGender);

        ToggleGroup radioGroupHumanHealth = new ToggleGroup();
        human_health_reg_zdorov.setToggleGroup(radioGroupHumanHealth);
        human_health_reg_invalid.setToggleGroup(radioGroupHumanHealth);
        human_reg_choisebox_user.getItems().addAll(items);
        //Human

        //bussiness
        ToggleGroup radioGroupBussinessVidpovidal = new ToggleGroup();
        bussiness_reg_radiobutton_vidpovidal_yes.setToggleGroup(radioGroupBussinessVidpovidal);
        bussiness_reg_radiobutton_vidpovidal_no.setToggleGroup(radioGroupBussinessVidpovidal);

        bussiness_reg_choisebox_compensation.getItems().addAll(bussinescompensation);
        bussiness_reg_choisebox_user.getItems().addAll(items);
        //bussiness

        //item
        Item_reg_choisebox_compensation.getItems().addAll(itemcompensation);
        Item_reg_choisebox_user.getItems().addAll(items);
        //item

        transport_reg_button.setOnAction(event -> {
            if (validateTransportFields()) {
                signUpNewVehiclePolicy();
            }
            else {
            }
        });

        build_reg_button.setOnAction(event -> {
            signUpNewBuildPolicy();
        });

        human_reg_button.setOnAction(event -> {
            signUpNewHumanPolicy();
        });

        Item_reg_button.setOnAction(event -> {
            signUpNewItemsPolicy();
        });

        bussiness_reg_button.setOnAction(event -> {
            signUpNewBusinessPolicy();
        });

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

    //
    //Transport
    //
    private boolean validateTransportFields() {
        if (transport_reg_choisebox_user.getValue() == null ||
                transport_field_reg_number.getText().isEmpty() ||
                transport_field_reg_mark.getText().isEmpty() ||
                transport_field_reg_vin.getText().isEmpty() ||
                transport_field_reg_model.getText().isEmpty() ||
                transport_field_reg_volume.getText().isEmpty() ||
                transport_choisebox_reg_type.getValue() == null ||
                transport_choisebox_reg_fuel.getValue() == null ||
                transport_field_reg_color.getText().isEmpty()) {
            showAlert("Помилка", "Будь ласка заповніть всі поля!");
            return false;
        }

        if (transport_field_reg_vin.getText().length() != 17) {
            showAlert("Помилка", "Номер шасі має складатися з 17 символів!");
            return false;
        }

        return true;
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }



    private void signUpNewVehiclePolicy() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String client = transport_reg_choisebox_user.getValue();
        String maker = transport_field_reg_mark.getText();
        String model = transport_field_reg_model.getText();
        String type = transport_choisebox_reg_type.getValue();
        String regNumber = transport_field_reg_number.getText();
        String vinNumber = transport_field_reg_vin.getText();
        String engineCapacity = transport_field_reg_volume.getText();
        String fuelType = transport_choisebox_reg_fuel.getValue();
        String color = transport_field_reg_color.getText();

        VehiclePolicy vehiclePolicy = new VehiclePolicy(client, maker, model, type, regNumber, vinNumber, engineCapacity, fuelType, color);

        dbHandler.signUpVehiclePolicy(vehiclePolicy);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Інформація");
        alert.setHeaderText(null);
        alert.setContentText("Поліс транспорту успішно додано!");
        alert.showAndWait();

        transport_reg_choisebox_user.setValue(null);
        transport_field_reg_number.clear();
        transport_field_reg_mark.clear();
        transport_field_reg_vin.clear();
        transport_field_reg_model.clear();
        transport_field_reg_volume.clear();
        transport_choisebox_reg_type.setValue(null);
        transport_choisebox_reg_fuel.setValue(null);
        transport_field_reg_color.clear();
    }


    //
    //Transport
    //


    private void signUpNewBuildPolicy() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String client = build_reg_choisebox_user.getValue();
        String address = build_field_reg_address.getText();
        String area = build_field_reg_area.getText();
        String areaUnit = build_reg_area_selector_m.isSelected() ? "м³" : "Га";
        String buildType;
        if(build_reg_type_selector_earth.isSelected()) {
            buildType = "Земля";
        }
        else if(build_reg_type_selector_home.isSelected()) {
            buildType = "Житло";
        }
        else {
            buildType = "Нежитлові приміщення";
        }
        String numOfRooms = build_field_reg_roomnum.getText();
        String cost = build_reg_Choicebox_cost_selector.getValue();

        BuildPolicy buildPolicy = new BuildPolicy(client, address, area, areaUnit, buildType, numOfRooms, cost);

        dbHandler.signUpBuildPolicy(buildPolicy);
    }

    private void signUpNewHumanPolicy() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String client = human_reg_choisebox_user.getValue();
        String firstName = human_field_reg_name.getText();
        String secondName = human_field_reg_prizv.getText();
        String middleName = human_field_reg_fathername.getText();
        String age = human_field_reg_year.getText();
        String gender = human_gender_reg_man.isSelected() ? "Чоловіча" : "Жіноча";
        String health = human_health_reg_zdorov.isSelected() ? "Здоровий" : "Інвалід";

        HumanPolicy humanPolicy = new HumanPolicy(client, firstName, secondName, middleName, age, gender, health);

        dbHandler.signUpHumanPolicy(humanPolicy);
    }

    private void signUpNewItemsPolicy() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String client = Item_reg_choisebox_user.getValue();
        String name = Item_field_reg_name.getText();
        String cost = Item_field_reg_cost.getText();
        String propCondition = Item_field_reg_stanmaina.getText();
        String compensation = Item_reg_choisebox_compensation.getValue();

        ItemsPolicy itemPolicy = new ItemsPolicy(client, name, cost, propCondition, compensation);

        dbHandler.signUpItemsPolicy(itemPolicy);
    }

    private void signUpNewBusinessPolicy() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String client = bussiness_reg_choisebox_user.getValue();
        String name = bussiness_field_reg_name.getText();
        String servIndustries = bussiness_field_reg_sphere.getText();
        String businessCost = bussiness_field_reg_costbussiness.getText();
        String profitPerYear = bussiness_field_reg_moneyinyear.getText();
        String compensation = bussiness_reg_choisebox_compensation.getValue();
        String respons = bussiness_reg_radiobutton_vidpovidal_yes.isSelected() ? "Так" : "Ні";

        BusinessPolicy businessPolicy = new BusinessPolicy(client, name, servIndustries, businessCost, profitPerYear, compensation, respons);

        dbHandler.signUpBusinessPolicy(businessPolicy);
    }
}
