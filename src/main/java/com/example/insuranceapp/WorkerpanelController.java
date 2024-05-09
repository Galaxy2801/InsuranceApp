package com.example.insuranceapp;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
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

import static com.example.insuranceapp.MainController.NAME;

public class WorkerpanelController {
    Stage stage = new Stage();

    @FXML
    private AnchorPane Bussiness;

    @FXML
    private Button EditBuild;

    @FXML
    private TableColumn<String, String> EditBuildAddress;

    @FXML
    private TableColumn<BuildPolicy, String> EditBuildArea;

    @FXML
    private TableColumn<String, String> EditBuildBuildType;

    @FXML
    private TableColumn<String, String> EditBuildClient;

    @FXML
    private TableColumn<String, String> EditBuildCost;

    @FXML
    private TableColumn<String, String> EditBuildDelete;

    @FXML
    private TableColumn<String, String> EditBuildIdbuildPolicy;

    @FXML
    private TableColumn<String, String> EditBuildNumOfRooms;

    @FXML
    private TableView<BuildPolicy> EditBuildTable;

    @FXML
    private Button EditBusiness;

    @FXML
    private TableColumn<String, String> EditBusinessBusinessCost;

    @FXML
    private TableColumn<String, String> EditBusinessClient;

    @FXML
    private TableColumn<String, String> EditBusinessCompensation;

    @FXML
    private TableColumn<String, String> EditBusinessDelete;

    @FXML
    private TableColumn<String, String> EditBusinessIdbusinessPolicy;

    @FXML
    private TableColumn<String, String> EditBusinessName;

    @FXML
    private TableColumn<String, String> EditBusinessProfitPerYear;

    @FXML
    private TableColumn<String, String> EditBusinessRespons;

    @FXML
    private TableColumn<String, String> EditBusinessServIndustries;

    @FXML
    private TableView<BusinessPolicy> EditBusinessTable;

    @FXML
    private Button EditHuman;

    @FXML
    private TableColumn<String, String> EditHumanAge;

    @FXML
    private TableColumn<String, String> EditHumanClient;

    @FXML
    private TableColumn<String, String> EditHumanDelete;

    @FXML
    private TableColumn<String, String> EditHumanFirstName;

    @FXML
    private TableColumn<String, String> EditHumanGender;

    @FXML
    private TableColumn<String, String> EditHumanHealth;

    @FXML
    private TableColumn<String, String> EditHumanIdhumanPolicy;

    @FXML
    private TableColumn<String, String> EditHumanMiddleName;

    @FXML
    private TableColumn<String, String> EditHumanSecondName;

    @FXML
    private TableView<HumanPolicy> EditHumanTable;

    @FXML
    private Button EditItem;

    @FXML
    private TableColumn<String, String> EditItemClient;

    @FXML
    private TableColumn<String, String> EditItemCompensation;

    @FXML
    private TableColumn<String, String> EditItemCost;

    @FXML
    private TableColumn<String, String> EditItemDelete;

    @FXML
    private TableColumn<String, String> EditItemIditemsPolicy;

    @FXML
    private TableColumn<String, String> EditItemName;

    @FXML
    private TableColumn<String, String> EditItemPropCondition;

    @FXML
    private TableView<ItemsPolicy> EditItemTable;

    @FXML
    private Button EditPolicy;

    @FXML
    private Button EditTransport;

    @FXML
    private TableColumn<String, String> EditTransportClient;

    @FXML
    private TableColumn<String, String> EditTransportFuelType;

    @FXML
    private TableColumn<String, String> EditTransportIdvehiclePolicy;

    @FXML
    private TableColumn<String, String> EditTransportMaker;

    @FXML
    private TableColumn<String, String> EditTransportModel;

    @FXML
    private TableView<VehiclePolicy> EditTransportTable;

    @FXML
    private TableColumn<String, String> EditTransportType;

    @FXML
    private TableColumn<String, String> EditTransportVinNumber;

    @FXML
    private TableColumn<String, String> EditTransportColor;

    @FXML
    private TableColumn<String, String> EditTransportDelete;

    @FXML
    private TableColumn<String, String> EditTransportEngineCapacity;

    @FXML
    private TableColumn<String, String> EditTransportRegNumber;

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
    private AnchorPane editBuildPane;

    @FXML
    private AnchorPane editBusinessPane;

    @FXML
    private AnchorPane editHumanPane;

    @FXML
    private AnchorPane editItemPane;

    @FXML
    private AnchorPane editTransportPane;

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
    private AnchorPane redactview;

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


    ///
    ///
    ///
    @FXML
    void EditBuild(ActionEvent event) {
        editTransportPane.setVisible(false);
        editBuildPane.setVisible(true);
        editHumanPane.setVisible(false);
        editItemPane.setVisible(false);
        editBusinessPane.setVisible(false);
    }

    @FXML
    void EditBusiness(ActionEvent event) {
        editTransportPane.setVisible(false);
        editBuildPane.setVisible(false);
        editHumanPane.setVisible(false);
        editItemPane.setVisible(false);
        editBusinessPane.setVisible(true);
    }

    @FXML
    void EditHuman(ActionEvent event) {
        editTransportPane.setVisible(false);
        editBuildPane.setVisible(false);
        editHumanPane.setVisible(true);
        editItemPane.setVisible(false);
        editBusinessPane.setVisible(false);
    }

    @FXML
    void EditItem(ActionEvent event) {
        editTransportPane.setVisible(false);
        editBuildPane.setVisible(false);
        editHumanPane.setVisible(false);
        editItemPane.setVisible(true);
        editBusinessPane.setVisible(false);
    }

    @FXML
    void EditTransport(ActionEvent event) {
        editTransportPane.setVisible(true);
        editBuildPane.setVisible(false);
        editHumanPane.setVisible(false);
        editItemPane.setVisible(false);
        editBusinessPane.setVisible(false);
    }

    ///
    ///
    ///


    @FXML
    void handleEditPolicy(ActionEvent event) {
        redactview.setVisible(true);
        build.setVisible(false);
        Bussiness.setVisible(false);
        transport.setVisible(false);
        Human.setVisible(false);
        Items.setVisible(false);

    }


    @FXML
    void handleCreationBuild(ActionEvent event) {
        redactview.setVisible(false);
        build.setVisible(true);
        Bussiness.setVisible(false);
        transport.setVisible(false);
        Human.setVisible(false);
        Items.setVisible(false);

    }

    @FXML
    void handleCreationBussiness(ActionEvent event) {
        redactview.setVisible(false);
        Bussiness.setVisible(true);
        build.setVisible(false);
        transport.setVisible(false);
        Human.setVisible(false);
        Items.setVisible(false);

    }

    @FXML
    void handleCreationHuman(ActionEvent event) {
        redactview.setVisible(false);
        Human.setVisible(true);
        Bussiness.setVisible(false);
        transport.setVisible(false);
        build.setVisible(false);
        Items.setVisible(false);

    }

    @FXML
    void handleCreationItems(ActionEvent event) {
        redactview.setVisible(false);
        Items.setVisible(true);
        Bussiness.setVisible(false);
        transport.setVisible(false);
        build.setVisible(false);
        Human.setVisible(false);

    }

    @FXML
    void handleCreationTransport(ActionEvent event) {
        redactview.setVisible(false);
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

    private void showAlert(String title, String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    @FXML
    void initialize() {
        addAllVehiclePoliciesToTable();
        addAllBuildPoliciesToTable();
        addAllHumanPoliciesToTable();
        addAllItemsPoliciesToTable();
        addAllBusinessPoliciesToTable();
        //transport
        transport_choisebox_reg_fuel.getItems().addAll(fueltype);
        transport_choisebox_reg_type.getItems().addAll(transporttype);
        DatabaseHandler dbHandler = new DatabaseHandler();
        List<String> items = dbHandler.getClientsFromDatabase();
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
            if (build_reg_choisebox_user.getValue() == null ||
                    build_field_reg_address.getText().isEmpty() ||
                    build_field_reg_area.getText().isEmpty() ||
                    build_field_reg_roomnum.getText().isEmpty() ||
                    build_reg_Choicebox_cost_selector.getValue() == null) {
                showAlert("Помилка", "Будь ласка, заповніть всі поля!", Alert.AlertType.ERROR);
                return;
            }

            if (radioGroupArea.getSelectedToggle() == null) {
                showAlert("Помилка", "Будь ласка, оберіть тип площі!", Alert.AlertType.ERROR);
                return;
            }

            if (radioGroupBuildType.getSelectedToggle() == null) {
                showAlert("Помилка", "Будь ласка, оберіть тип нерухомості!", Alert.AlertType.ERROR);
                return;
            }

            signUpNewBuildPolicy();

            showAlert("Інформація", "Поліс нерухомості успішно додано!", Alert.AlertType.INFORMATION);

            build_reg_choisebox_user.setValue(null);
            build_field_reg_address.clear();
            build_field_reg_area.clear();
            build_field_reg_roomnum.clear();
            build_reg_Choicebox_cost_selector.setValue(null);
            radioGroupArea.getSelectedToggle().setSelected(false);
            radioGroupBuildType.getSelectedToggle().setSelected(false);
        });

        human_reg_button.setOnAction(event -> {
            if (validateHumanFields()) {
                signUpNewHumanPolicy();
            }
        });

        Item_reg_button.setOnAction(event -> {
            if (Item_reg_choisebox_user.getValue() == null ||
                    Item_field_reg_name.getText().isEmpty() ||
                    Item_field_reg_cost.getText().isEmpty() ||
                    Item_field_reg_stanmaina.getText().isEmpty() ||
                    Item_reg_choisebox_compensation.getValue() == null) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Помилка");
                alert.setHeaderText(null);
                alert.setContentText("Будь ласка, заповніть всі поля!");
                alert.showAndWait();
            } else {
                signUpNewItemsPolicy();
                Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
                successAlert.setTitle("Успіх!");
                successAlert.setHeaderText(null);
                successAlert.setContentText("Поліс Майна успішно додано!");
                successAlert.showAndWait();

                Item_reg_choisebox_user.getSelectionModel().clearSelection();
                Item_field_reg_name.clear();
                Item_field_reg_cost.clear();
                Item_field_reg_stanmaina.clear();
                Item_reg_choisebox_compensation.getSelectionModel().clearSelection();
            }
        });


        bussiness_reg_button.setOnAction(event -> {
            if (bussiness_reg_choisebox_user.getValue() == null ||
                    bussiness_field_reg_name.getText().isEmpty() ||
                    bussiness_field_reg_sphere.getText().isEmpty() ||
                    bussiness_field_reg_costbussiness.getText().isEmpty() ||
                    bussiness_field_reg_moneyinyear.getText().isEmpty() ||
                    bussiness_reg_choisebox_compensation.getValue() == null) {
                showAlert("Помилка", "Будь ласка, заповніть всі поля!", Alert.AlertType.ERROR);
                return;
            }

            if (radioGroupBussinessVidpovidal.getSelectedToggle() == null) {
                showAlert("Помилка", "Будь ласка, оберіть тип відповідальності!", Alert.AlertType.ERROR);
                return;
            }

            signUpNewBusinessPolicy();

            showAlert("Успіх!", "Поліс бізнесу успішно додано!", Alert.AlertType.INFORMATION);

            bussiness_reg_choisebox_user.setValue(null);
            bussiness_field_reg_name.clear();
            bussiness_field_reg_sphere.clear();
            bussiness_field_reg_costbussiness.clear();
            bussiness_field_reg_moneyinyear.clear();
            bussiness_reg_choisebox_compensation.setValue(null);
            radioGroupBussinessVidpovidal.getSelectedToggle().setSelected(false);
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

        String id = null;
        String client = transport_reg_choisebox_user.getValue();
        String maker = transport_field_reg_mark.getText();
        String model = transport_field_reg_model.getText();
        String type = transport_choisebox_reg_type.getValue();
        String regNumber = transport_field_reg_number.getText();
        String vinNumber = transport_field_reg_vin.getText();
        String engineCapacity = transport_field_reg_volume.getText();
        String fuelType = transport_choisebox_reg_fuel.getValue();
        String color = transport_field_reg_color.getText();

        VehiclePolicy vehiclePolicy = new VehiclePolicy(id, client, maker, model, type, regNumber, vinNumber, engineCapacity, fuelType, color);

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

        String id = null;
        String client = build_reg_choisebox_user.getValue();
        String address = build_field_reg_address.getText();
        String area = build_field_reg_area.getText();
        String areaUnit = build_reg_area_selector_m.isSelected() ? "м²" : "Га";
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

        BuildPolicy buildPolicy = new BuildPolicy(id, client, address, area, areaUnit, buildType, numOfRooms, cost);

        dbHandler.signUpBuildPolicy(buildPolicy);
    }

    private boolean validateHumanFields() {
        if (human_reg_choisebox_user.getValue() == null ||
                human_field_reg_name.getText().isEmpty() ||
                human_field_reg_prizv.getText().isEmpty() ||
                human_field_reg_fathername.getText().isEmpty() ||
                human_field_reg_year.getText().isEmpty()) {
            showAlert("Помилка", "Будь ласка, заповніть всі поля!");
            return false;
        }

        if (!human_gender_reg_man.isSelected() && !human_gender_reg_woman.isSelected()) {
            showAlert("Помилка", "Будь ласка, оберіть стать!");
            return false;
        }

        if (!human_health_reg_zdorov.isSelected() && !human_health_reg_invalid.isSelected()) {
            showAlert("Помилка", "Будь ласка, оберіть стан здоров'я!");
            return false;
        }

        return true;
    }

    private void signUpNewHumanPolicy() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String id = null;
        String client = human_reg_choisebox_user.getValue();
        String firstName = human_field_reg_name.getText();
        String secondName = human_field_reg_prizv.getText();
        String middleName = human_field_reg_fathername.getText();
        String age = human_field_reg_year.getText();
        String gender = human_gender_reg_man.isSelected() ? "Чоловіча" : "Жіноча";
        String health = human_health_reg_zdorov.isSelected() ? "Здоровий" : "Інвалід";

        HumanPolicy humanPolicy = new HumanPolicy(id, client, firstName, secondName, middleName, age, gender, health);

        dbHandler.signUpHumanPolicy(humanPolicy);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Інформація");
        alert.setHeaderText(null);
        alert.setContentText("Поліс особи успішно додано!");
        alert.showAndWait();

        human_reg_choisebox_user.setValue(null);
        human_field_reg_name.clear();
        human_field_reg_prizv.clear();
        human_field_reg_fathername.clear();
        human_field_reg_year.clear();
        human_gender_reg_man.setSelected(false);
        human_gender_reg_woman.setSelected(false);
        human_health_reg_zdorov.setSelected(false);
        human_health_reg_invalid.setSelected(false);
    }

    private void signUpNewItemsPolicy() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String id = null;
        String client = Item_reg_choisebox_user.getValue();
        String name = Item_field_reg_name.getText();
        String cost = Item_field_reg_cost.getText();
        String propCondition = Item_field_reg_stanmaina.getText();
        String compensation = Item_reg_choisebox_compensation.getValue();

        ItemsPolicy itemPolicy = new ItemsPolicy(id, client, name, cost, propCondition, compensation);

        dbHandler.signUpItemsPolicy(itemPolicy);
    }

    private void signUpNewBusinessPolicy() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String id = null;
        String client = bussiness_reg_choisebox_user.getValue();
        String name = bussiness_field_reg_name.getText();
        String servIndustries = bussiness_field_reg_sphere.getText();
        String businessCost = bussiness_field_reg_costbussiness.getText();
        String profitPerYear = bussiness_field_reg_moneyinyear.getText();
        String compensation = bussiness_reg_choisebox_compensation.getValue();
        String respons = bussiness_reg_radiobutton_vidpovidal_yes.isSelected() ? "Так" : "Ні";

        BusinessPolicy businessPolicy = new BusinessPolicy(id, client, name, servIndustries, businessCost, profitPerYear, compensation, respons);

        dbHandler.signUpBusinessPolicy(businessPolicy);
    }

    private void addAllVehiclePoliciesToTable() {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        ObservableList<VehiclePolicy> vehiclePolicies = FXCollections.observableArrayList(databaseHandler.getVehiclePolicy());

        EditTransportIdvehiclePolicy.setCellValueFactory(new PropertyValueFactory<>("id"));
        EditTransportClient.setCellValueFactory(new PropertyValueFactory<>("client"));
        EditTransportMaker.setCellValueFactory(new PropertyValueFactory<>("maker"));
        EditTransportModel.setCellValueFactory(new PropertyValueFactory<>("model"));
        EditTransportType.setCellValueFactory(new PropertyValueFactory<>("type"));
        EditTransportRegNumber.setCellValueFactory(new PropertyValueFactory<>("regNumber"));
        EditTransportVinNumber.setCellValueFactory(new PropertyValueFactory<>("vinNumber"));
        EditTransportEngineCapacity.setCellValueFactory(new PropertyValueFactory<>("engineCapacity"));
        EditTransportFuelType.setCellValueFactory(new PropertyValueFactory<>("fuelType"));
        EditTransportColor.setCellValueFactory(new PropertyValueFactory<>("color"));

        EditTransportTable.setItems(vehiclePolicies);

        EditTransportDelete.setCellFactory(param -> new TableCell<String, String>() {
            private final Button deleteButton = new Button("Видалити");

            {
                deleteButton.setOnAction(event -> {
                    TableRow row = getTableRow();
                    VehiclePolicy policy = (VehiclePolicy) row.getItem();
                    if (policy != null) {
                        databaseHandler.deleteVehiclePolicy(policy.getId());
                        EditTransportTable.getItems().remove(policy);
                    }
                });
            }

            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);

                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(deleteButton);
                }
            }
        });
    }

    private void addAllBuildPoliciesToTable() {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        ObservableList<BuildPolicy> buildPolicies = FXCollections.observableArrayList(databaseHandler.getBuildPolicy());

        EditBuildIdbuildPolicy.setCellValueFactory(new PropertyValueFactory<>("id"));
        EditBuildClient.setCellValueFactory(new PropertyValueFactory<>("client"));
        EditBuildAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        EditBuildArea.setCellValueFactory(cellData -> {
            BuildPolicy buildPolicy = cellData.getValue();
            String area = buildPolicy.getArea();
            String areaUnit = buildPolicy.getAreaUnit();
            String combinedInfo = area + " " + areaUnit;
            return new SimpleStringProperty(combinedInfo);
        });
        EditBuildBuildType.setCellValueFactory(new PropertyValueFactory<>("buildType"));
        EditBuildNumOfRooms.setCellValueFactory(new PropertyValueFactory<>("numOfRooms"));
        EditBuildCost.setCellValueFactory(new PropertyValueFactory<>("cost"));

        EditBuildTable.setItems(buildPolicies);

        EditBuildDelete.setCellFactory(param -> new TableCell<String, String>() {
            private final Button deleteButton = new Button("Видалити");

            {
                deleteButton.setOnAction(event -> {
                    TableRow row = getTableRow();
                    BuildPolicy policy = (BuildPolicy) row.getItem();
                    if (policy != null) {
                        databaseHandler.deleteBuildPolicy(policy.getId());
                        EditBuildTable.getItems().remove(policy);
                    }
                });
            }

            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);

                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(deleteButton);
                }
            }
        });
    }

    private void addAllHumanPoliciesToTable() {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        ObservableList<HumanPolicy> humanPolicies = FXCollections.observableArrayList(databaseHandler.getHumanPolicy());

        EditHumanIdhumanPolicy.setCellValueFactory(new PropertyValueFactory<>("id"));
        EditHumanClient.setCellValueFactory(new PropertyValueFactory<>("client"));
        EditHumanFirstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        EditHumanSecondName.setCellValueFactory(new PropertyValueFactory<>("secondName"));
        EditHumanMiddleName.setCellValueFactory(new PropertyValueFactory<>("middleName"));
        EditHumanAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        EditHumanGender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        EditHumanHealth.setCellValueFactory(new PropertyValueFactory<>("health"));

        EditHumanTable.setItems(humanPolicies);

        EditHumanDelete.setCellFactory(param -> new TableCell<String, String>() {
            private final Button deleteButton = new Button("Видалити");

            {
                deleteButton.setOnAction(event -> {
                    TableRow row = getTableRow();
                    HumanPolicy policy = (HumanPolicy) row.getItem();
                    if (policy != null) {
                        databaseHandler.deleteHumanPolicy(policy.getId());
                        EditHumanTable.getItems().remove(policy);
                    }
                });
            }

            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);

                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(deleteButton);
                }
            }
        });
    }

    private void addAllItemsPoliciesToTable() {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        ObservableList<ItemsPolicy> itemsPolicies = FXCollections.observableArrayList(databaseHandler.getItemsPolicy());

        EditItemIditemsPolicy.setCellValueFactory(new PropertyValueFactory<>("id"));
        EditItemClient.setCellValueFactory(new PropertyValueFactory<>("client"));
        EditItemName.setCellValueFactory(new PropertyValueFactory<>("name"));
        EditItemCost.setCellValueFactory(new PropertyValueFactory<>("cost"));
        EditItemPropCondition.setCellValueFactory(new PropertyValueFactory<>("propCondition"));
        EditItemCompensation.setCellValueFactory(new PropertyValueFactory<>("compensation"));

        EditItemTable.setItems(itemsPolicies);
        EditItemDelete.setCellFactory(param -> new TableCell<String, String>() {
            private final Button deleteButton = new Button("Видалити");

            {
                deleteButton.setOnAction(event -> {
                    String item = getItem();
                    if (item != null) {
                        TableRow row = getTableRow();
                        EditItemTable.getItems().remove(row.getItem());
                    }
                });
            }

            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);

                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(deleteButton);
                }
            }
        });
    }

    private void addAllBusinessPoliciesToTable() {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        ObservableList<BusinessPolicy> businessPolicies = FXCollections.observableArrayList(databaseHandler.getBusinessPolicy());

        EditBusinessIdbusinessPolicy.setCellValueFactory(new PropertyValueFactory<>("id"));
        EditBusinessClient.setCellValueFactory(new PropertyValueFactory<>("client"));
        EditBusinessName.setCellValueFactory(new PropertyValueFactory<>("name"));
        EditBusinessServIndustries.setCellValueFactory(new PropertyValueFactory<>("servIndustries"));
        EditBusinessBusinessCost.setCellValueFactory(new PropertyValueFactory<>("businessCost"));
        EditBusinessProfitPerYear.setCellValueFactory(new PropertyValueFactory<>("profitPerYear"));
        EditBusinessRespons.setCellValueFactory(new PropertyValueFactory<>("respons"));
        EditBusinessCompensation.setCellValueFactory(new PropertyValueFactory<>("compensation"));

        EditBusinessTable.setItems(businessPolicies);

        EditBusinessDelete.setCellFactory(param -> new TableCell<String, String>() {
            private final Button deleteButton = new Button("Видалити");

            {
                deleteButton.setOnAction(event -> {
                    String item = getItem();
                    if (item != null) {
                        TableRow row = getTableRow();
                        EditBusinessTable.getItems().remove(row.getItem());
                    }
                });
            }

            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);

                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(deleteButton);
                }
            }
        });
    }
}
