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

public class AdminController {
    Stage stage = new Stage();
    @FXML
    private AnchorPane AdminBussiness;

    @FXML
    private Button AdminEditBuild;

    @FXML
    private TableColumn<String, String> AdminEditBuildAddress;

    @FXML
    private TableColumn<BuildPolicy, String> AdminEditBuildArea;

    @FXML
    private TableColumn<String, String> AdminEditBuildBuildType;

    @FXML
    private TableColumn<String, String> AdminEditBuildClient;

    @FXML
    private TableColumn<String, String> AdminEditBuildCost;

    @FXML
    private TableColumn<String, String> AdminEditBuildDelete;

    @FXML
    private TableColumn<String, String> AdminEditBuildIdbuildPolicy;

    @FXML
    private TableColumn<String, String> AdminEditBuildNumOfRooms;

    @FXML
    private TableView<BuildPolicy> AdminEditBuildTable;

    @FXML
    private Button AdminEditBusiness;

    @FXML
    private TableColumn<String, String> AdminEditBusinessBusinessCost;

    @FXML
    private TableColumn<String, String> AdminEditBusinessClient;

    @FXML
    private TableColumn<String, String> AdminEditBusinessCompensation;

    @FXML
    private TableColumn<String, String> AdminEditBusinessDelete;

    @FXML
    private TableColumn<String, String> AdminEditBusinessIdbusinessPolicy;

    @FXML
    private TableColumn<String, String> AdminEditBusinessName;

    @FXML
    private TableColumn<String, String> AdminEditBusinessProfitPerYear;

    @FXML
    private TableColumn<String, String> AdminEditBusinessRespons;

    @FXML
    private TableColumn<String, String> AdminEditBusinessServIndustries;

    @FXML
    private TableView<BusinessPolicy> AdminEditBusinessTable;

    @FXML
    private Button AdminEditHuman;

    @FXML
    private TableColumn<String, String> AdminEditHumanAge;

    @FXML
    private TableColumn<String, String> AdminEditHumanClient;

    @FXML
    private TableColumn<String, String> AdminEditHumanDelete;

    @FXML
    private TableColumn<String, String> AdminEditHumanFirstName;

    @FXML
    private TableColumn<String, String> AdminEditHumanGender;

    @FXML
    private TableColumn<String, String> AdminEditHumanHealth;

    @FXML
    private TableColumn<String, String> AdminEditHumanIdhumanPolicy;

    @FXML
    private TableColumn<String, String> AdminEditHumanMiddleName;

    @FXML
    private TableColumn<String, String> AdminEditHumanSecondName;

    @FXML
    private TableView<HumanPolicy> AdminEditHumanTable;

    @FXML
    private Button AdminEditItem;

    @FXML
    private TableColumn<String, String> AdminEditItemClient;

    @FXML
    private TableColumn<String, String> AdminEditItemCompensation;

    @FXML
    private TableColumn<String, String> AdminEditItemCost;

    @FXML
    private TableColumn<String, String> AdminEditItemDelete;

    @FXML
    private TableColumn<String, String> AdminEditItemIditemsPolicy;

    @FXML
    private TableColumn<String, String> AdminEditItemName;

    @FXML
    private TableColumn<String, String> AdminEditItemPropCondition;

    @FXML
    private TableView<ItemsPolicy> AdminEditItemTable;

    @FXML
    private Button AdminEditPermission;

    @FXML
    private Button AdminEditPolicy;

    @FXML
    private Button AdminEditTransport;

    @FXML
    private TableColumn<String, String> AdminEditTransportClient;

    @FXML
    private TableColumn<String, String> AdminEditTransportColor;

    @FXML
    private TableColumn<String, String> AdminEditTransportDelete;

    @FXML
    private TableColumn<String, String> AdminEditTransportEngineCapacity;

    @FXML
    private TableColumn<String, String> AdminEditTransportFuelType;

    @FXML
    private TableColumn<String, String> AdminEditTransportIdvehiclePolicy;

    @FXML
    private TableColumn<String, String> AdminEditTransportMaker;

    @FXML
    private TableColumn<String, String> AdminEditTransportModel;

    @FXML
    private TableColumn<String, String> AdminEditTransportRegNumber;

    @FXML
    private TableView<VehiclePolicy> AdminEditTransportTable;

    @FXML
    private TableColumn<String, String> AdminEditTransportType;

    @FXML
    private TableColumn<String, String> AdminEditTransportVinNumber;

    @FXML
    private AnchorPane AdminHuman;

    @FXML
    private TextField AdminItem_field_reg_cost;

    @FXML
    private TextField AdminItem_field_reg_name;

    @FXML
    private TextField AdminItem_field_reg_stanmaina;

    @FXML
    private Button AdminItem_reg_button;

    @FXML
    private ChoiceBox<String> AdminItem_reg_choisebox_compensation;

    @FXML
    private ChoiceBox<String> AdminItem_reg_choisebox_user;

    @FXML
    private AnchorPane AdminItems;

    @FXML
    private AnchorPane AdminPermission;

    @FXML
    private AnchorPane Adminbuild;

    @FXML
    private TextField Adminbuild_field_reg_address;

    @FXML
    private TextField Adminbuild_field_reg_area;

    @FXML
    private TextField Adminbuild_field_reg_roomnum;

    @FXML
    private ChoiceBox<String> Adminbuild_reg_Choicebox_cost_selector;

    @FXML
    private RadioButton Adminbuild_reg_area_selector_ga;

    @FXML
    private RadioButton Adminbuild_reg_area_selector_m;

    @FXML
    private Button Adminbuild_reg_button;

    @FXML
    private ChoiceBox<String> Adminbuild_reg_choisebox_user;

    @FXML
    private RadioButton Adminbuild_reg_type_selector_earth;

    @FXML
    private RadioButton Adminbuild_reg_type_selector_home;

    @FXML
    private RadioButton Adminbuild_reg_type_selector_industrial;

    @FXML
    private TextField Adminbussiness_field_reg_costbussiness;

    @FXML
    private TextField Adminbussiness_field_reg_moneyinyear;

    @FXML
    private TextField Adminbussiness_field_reg_name;

    @FXML
    private TextField Adminbussiness_field_reg_sphere;

    @FXML
    private Button Adminbussiness_reg_button;

    @FXML
    private ChoiceBox<String> Adminbussiness_reg_choisebox_compensation;

    @FXML
    private ChoiceBox<String> Adminbussiness_reg_choisebox_user;

    @FXML
    private RadioButton Adminbussiness_reg_radiobutton_vidpovidal_no;

    @FXML
    private RadioButton Adminbussiness_reg_radiobutton_vidpovidal_yes;

    @FXML
    private Button AdmincreationBuild;

    @FXML
    private Button AdmincreationBusiness;

    @FXML
    private Button AdmincreationHuman;

    @FXML
    private Button AdmincreationItems;

    @FXML
    private Button AdmincreationTransport;

    @FXML
    private AnchorPane AdmineditBuildPane;

    @FXML
    private AnchorPane AdmineditBusinessPane;

    @FXML
    private AnchorPane AdmineditHumanPane;

    @FXML
    private AnchorPane AdmineditItemPane;

    @FXML
    private AnchorPane AdmineditTransportPane;

    @FXML
    private TextField Adminhuman_field_reg_fathername;

    @FXML
    private TextField Adminhuman_field_reg_name;

    @FXML
    private TextField Adminhuman_field_reg_prizv;

    @FXML
    private TextField Adminhuman_field_reg_year;

    @FXML
    private RadioButton Adminhuman_gender_reg_man;

    @FXML
    private RadioButton Adminhuman_gender_reg_woman;

    @FXML
    private RadioButton Adminhuman_health_reg_invalid;

    @FXML
    private RadioButton Adminhuman_health_reg_zdorov;

    @FXML
    private Button Adminhuman_reg_button;

    @FXML
    private ChoiceBox<String> Adminhuman_reg_choisebox_user;

    @FXML
    private AnchorPane Adminpane;

    @FXML
    private AnchorPane Adminredactview;

    @FXML
    private AnchorPane Admintransport;

    @FXML
    private ChoiceBox<String> Admintransport_choisebox_reg_fuel;

    @FXML
    private ChoiceBox<String> Admintransport_choisebox_reg_type;

    @FXML
    private TextField Admintransport_field_reg_color;

    @FXML
    private TextField Admintransport_field_reg_mark;

    @FXML
    private TextField Admintransport_field_reg_model;

    @FXML
    private TextField Admintransport_field_reg_number;

    @FXML
    private TextField Admintransport_field_reg_vin;

    @FXML
    private TextField Admintransport_field_reg_volume;

    @FXML
    private Button Admintransport_reg_button;

    @FXML
    private ChoiceBox<String> Admintransport_reg_choisebox_user;

    @FXML
    private BorderPane Adminworkpane;

    @FXML
    private Button back;

    @FXML
    private Button exit;


    ///
    ///
    ///

    @FXML
    void AdminhandleEditPermission(ActionEvent event) {
        Adminredactview.setVisible(false);
        Admintransport.setVisible(false);
        AdminBussiness.setVisible(false);
        AdminItems.setVisible(false);
        Adminbuild.setVisible(false);
        AdminHuman.setVisible(false);
        AdminPermission.setVisible(true);

    }

    ///
    ///policy redact
    ///
    @FXML
    void AdminEditBuild(ActionEvent event) {
        AdmineditBuildPane.setVisible(true);
        AdmineditHumanPane.setVisible(false);
        AdmineditItemPane.setVisible(false);
        AdmineditBusinessPane.setVisible(false);
        AdmineditTransportPane.setVisible(false);
    }

    @FXML
    void AdminEditBusiness(ActionEvent event) {
        AdmineditBuildPane.setVisible(false);
        AdmineditHumanPane.setVisible(false);
        AdmineditItemPane.setVisible(false);
        AdmineditBusinessPane.setVisible(true);
        AdmineditTransportPane.setVisible(false);
    }

    @FXML
    void AdminEditHuman(ActionEvent event) {
        AdmineditBuildPane.setVisible(false);
        AdmineditHumanPane.setVisible(true);
        AdmineditItemPane.setVisible(false);
        AdmineditBusinessPane.setVisible(false);
        AdmineditTransportPane.setVisible(false);
    }

    @FXML
    void AdminEditItem(ActionEvent event) {
        AdmineditBuildPane.setVisible(false);
        AdmineditHumanPane.setVisible(false);
        AdmineditItemPane.setVisible(true);
        AdmineditBusinessPane.setVisible(false);
        AdmineditTransportPane.setVisible(false);
    }

    @FXML
    void AdminEditTransport(ActionEvent event) {
        AdmineditBuildPane.setVisible(false);
        AdmineditHumanPane.setVisible(false);
        AdmineditItemPane.setVisible(false);
        AdmineditBusinessPane.setVisible(false);
        AdmineditTransportPane.setVisible(true);
    }

    ///
    ///policy redact
    ///


    @FXML
    void AdminhandleEditPolicy(ActionEvent event) {
        AdminPermission.setVisible(false);
        Adminredactview.setVisible(true);
        Adminbuild.setVisible(false);
        AdminBussiness.setVisible(false);
        Admintransport.setVisible(false);
        AdminHuman.setVisible(false);
        AdminItems.setVisible(false);
    }


    @FXML
    void AdminhandleCreationBuild(ActionEvent event) {
        AdminPermission.setVisible(false);
        Adminredactview.setVisible(false);
        Adminbuild.setVisible(true);
        AdminBussiness.setVisible(false);
        Admintransport.setVisible(false);
        AdminHuman.setVisible(false);
        AdminItems.setVisible(false);
    }

    @FXML
    void AdminhandleCreationBussiness(ActionEvent event) {
        AdminPermission.setVisible(false);
        Adminredactview.setVisible(false);
        AdminBussiness.setVisible(true);
        Adminbuild.setVisible(false);
        Admintransport.setVisible(false);
        AdminHuman.setVisible(false);
        AdminItems.setVisible(false);
    }

    @FXML
    void AdminhandleCreationHuman(ActionEvent event) {
        AdminPermission.setVisible(false);
        Adminredactview.setVisible(false);
        AdminHuman.setVisible(true);
        AdminBussiness.setVisible(false);
        Admintransport.setVisible(false);
        Adminbuild.setVisible(false);
        AdminItems.setVisible(false);
    }

    @FXML
    void AdminhandleCreationItems(ActionEvent event) {
        AdminPermission.setVisible(false);
        Adminredactview.setVisible(false);
        AdminItems.setVisible(true);
        AdminBussiness.setVisible(false);
        Admintransport.setVisible(false);
        Adminbuild.setVisible(false);
        AdminHuman.setVisible(false);
    }

    @FXML
    void AdminhandleCreationTransport(ActionEvent event) {
        AdminPermission.setVisible(false);
        Adminredactview.setVisible(false);
        Admintransport.setVisible(true);
        AdminBussiness.setVisible(false);
        AdminItems.setVisible(false);
        Adminbuild.setVisible(false);
        AdminHuman.setVisible(false);
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
        Admintransport_choisebox_reg_fuel.getItems().addAll(fueltype);
        Admintransport_choisebox_reg_type.getItems().addAll(transporttype);
        DatabaseHandler dbHandler = new DatabaseHandler();
        List<String> items = dbHandler.getItemsFromDatabase();
        Admintransport_reg_choisebox_user.getItems().addAll(items);
        //transport

        //build
        ToggleGroup radioGroupArea = new ToggleGroup();
        Adminbuild_reg_area_selector_ga.setToggleGroup(radioGroupArea);
        Adminbuild_reg_area_selector_m.setToggleGroup(radioGroupArea);

        ToggleGroup radioGroupBuildType = new ToggleGroup();
        Adminbuild_reg_type_selector_earth.setToggleGroup(radioGroupBuildType);
        Adminbuild_reg_type_selector_home.setToggleGroup(radioGroupBuildType);
        Adminbuild_reg_type_selector_industrial.setToggleGroup(radioGroupBuildType);

        Adminbuild_reg_Choicebox_cost_selector.getItems().addAll(buildcost);
        Adminbuild_reg_choisebox_user.getItems().addAll(items);
        //build

        //Human
        ToggleGroup radioGroupHumanGender = new ToggleGroup();
        Adminhuman_gender_reg_man.setToggleGroup(radioGroupHumanGender);
        Adminhuman_gender_reg_woman.setToggleGroup(radioGroupHumanGender);

        ToggleGroup radioGroupHumanHealth = new ToggleGroup();
        Adminhuman_health_reg_zdorov.setToggleGroup(radioGroupHumanHealth);
        Adminhuman_health_reg_invalid.setToggleGroup(radioGroupHumanHealth);
        Adminhuman_reg_choisebox_user.getItems().addAll(items);
        //Human

        //bussiness
        ToggleGroup radioGroupBussinessVidpovidal = new ToggleGroup();
        Adminbussiness_reg_radiobutton_vidpovidal_yes.setToggleGroup(radioGroupBussinessVidpovidal);
        Adminbussiness_reg_radiobutton_vidpovidal_no.setToggleGroup(radioGroupBussinessVidpovidal);

        Adminbussiness_reg_choisebox_compensation.getItems().addAll(bussinescompensation);
        Adminbussiness_reg_choisebox_user.getItems().addAll(items);
        //bussiness

        //item
        AdminItem_reg_choisebox_compensation.getItems().addAll(itemcompensation);
        AdminItem_reg_choisebox_user.getItems().addAll(items);
        //item

        Admintransport_reg_button.setOnAction(event -> {
            if (validateTransportFields()) {
                signUpNewVehiclePolicy();
            }
            else {
            }
        });

        Adminbuild_reg_button.setOnAction(event -> {
            if (Adminbuild_reg_choisebox_user.getValue() == null ||
                    Adminbuild_field_reg_address.getText().isEmpty() ||
                    Adminbuild_field_reg_area.getText().isEmpty() ||
                    Adminbuild_field_reg_roomnum.getText().isEmpty() ||
                    Adminbuild_reg_Choicebox_cost_selector.getValue() == null) {
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

            Adminbuild_reg_choisebox_user.setValue(null);
            Adminbuild_field_reg_address.clear();
            Adminbuild_field_reg_area.clear();
            Adminbuild_field_reg_roomnum.clear();
            Adminbuild_reg_Choicebox_cost_selector.setValue(null);
            radioGroupArea.getSelectedToggle().setSelected(false);
            radioGroupBuildType.getSelectedToggle().setSelected(false);
        });

        Adminhuman_reg_button.setOnAction(event -> {
            if (validateHumanFields()) {
                signUpNewHumanPolicy();
            }
        });

        AdminItem_reg_button.setOnAction(event -> {
            if (AdminItem_reg_choisebox_user.getValue() == null ||
                    AdminItem_field_reg_name.getText().isEmpty() ||
                    AdminItem_field_reg_cost.getText().isEmpty() ||
                    AdminItem_field_reg_stanmaina.getText().isEmpty() ||
                    AdminItem_reg_choisebox_compensation.getValue() == null) {
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

                AdminItem_reg_choisebox_user.getSelectionModel().clearSelection();
                AdminItem_field_reg_name.clear();
                AdminItem_field_reg_cost.clear();
                AdminItem_field_reg_stanmaina.clear();
                AdminItem_reg_choisebox_compensation.getSelectionModel().clearSelection();
            }
        });


        Adminbussiness_reg_button.setOnAction(event -> {
            if (Adminbussiness_reg_choisebox_user.getValue() == null ||
                    Adminbussiness_field_reg_name.getText().isEmpty() ||
                    Adminbussiness_field_reg_sphere.getText().isEmpty() ||
                    Adminbussiness_field_reg_costbussiness.getText().isEmpty() ||
                    Adminbussiness_field_reg_moneyinyear.getText().isEmpty() ||
                    Adminbussiness_reg_choisebox_compensation.getValue() == null) {
                showAlert("Помилка", "Будь ласка, заповніть всі поля!", Alert.AlertType.ERROR);
                return;
            }

            if (radioGroupBussinessVidpovidal.getSelectedToggle() == null) {
                showAlert("Помилка", "Будь ласка, оберіть тип відповідальності!", Alert.AlertType.ERROR);
                return;
            }

            signUpNewBusinessPolicy();

            showAlert("Успіх!", "Поліс бізнесу успішно додано!", Alert.AlertType.INFORMATION);

            Adminbussiness_reg_choisebox_user.setValue(null);
            Adminbussiness_field_reg_name.clear();
            Adminbussiness_field_reg_sphere.clear();
            Adminbussiness_field_reg_costbussiness.clear();
            Adminbussiness_field_reg_moneyinyear.clear();
            Adminbussiness_reg_choisebox_compensation.setValue(null);
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
            Stage currentStage = (Stage) Adminpane.getScene().getWindow();
            currentStage.close();


        });


    }

    //
    //Transport
    //
    private boolean validateTransportFields() {
        if (Admintransport_reg_choisebox_user.getValue() == null ||
                Admintransport_field_reg_number.getText().isEmpty() ||
                Admintransport_field_reg_mark.getText().isEmpty() ||
                Admintransport_field_reg_vin.getText().isEmpty() ||
                Admintransport_field_reg_model.getText().isEmpty() ||
                Admintransport_field_reg_volume.getText().isEmpty() ||
                Admintransport_choisebox_reg_type.getValue() == null ||
                Admintransport_choisebox_reg_fuel.getValue() == null ||
                Admintransport_field_reg_color.getText().isEmpty()) {
            showAlert("Помилка", "Будь ласка заповніть всі поля!");
            return false;
        }

        if (Admintransport_field_reg_vin.getText().length() != 17) {
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
        String client = Admintransport_reg_choisebox_user.getValue();
        String maker = Admintransport_field_reg_mark.getText();
        String model = Admintransport_field_reg_model.getText();
        String type = Admintransport_choisebox_reg_type.getValue();
        String regNumber = Admintransport_field_reg_number.getText();
        String vinNumber = Admintransport_field_reg_vin.getText();
        String engineCapacity = Admintransport_field_reg_volume.getText();
        String fuelType = Admintransport_choisebox_reg_fuel.getValue();
        String color = Admintransport_field_reg_color.getText();

        VehiclePolicy vehiclePolicy = new VehiclePolicy(id, client, maker, model, type, regNumber, vinNumber, engineCapacity, fuelType, color);

        dbHandler.signUpVehiclePolicy(vehiclePolicy);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Інформація");
        alert.setHeaderText(null);
        alert.setContentText("Поліс транспорту успішно додано!");
        alert.showAndWait();

        Admintransport_reg_choisebox_user.setValue(null);
        Admintransport_field_reg_number.clear();
        Admintransport_field_reg_mark.clear();
        Admintransport_field_reg_vin.clear();
        Admintransport_field_reg_model.clear();
        Admintransport_field_reg_volume.clear();
        Admintransport_choisebox_reg_type.setValue(null);
        Admintransport_choisebox_reg_fuel.setValue(null);
        Admintransport_field_reg_color.clear();
    }


    //
    //Transport
    //


    private void signUpNewBuildPolicy() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String id = null;
        String client = Adminbuild_reg_choisebox_user.getValue();
        String address = Adminbuild_field_reg_address.getText();
        String area = Adminbuild_field_reg_area.getText();
        String areaUnit = Adminbuild_reg_area_selector_m.isSelected() ? "м²" : "Га";
        String buildType;
        if(Adminbuild_reg_type_selector_earth.isSelected()) {
            buildType = "Земля";
        }
        else if(Adminbuild_reg_type_selector_home.isSelected()) {
            buildType = "Житло";
        }
        else {
            buildType = "Нежитлові приміщення";
        }
        String numOfRooms = Adminbuild_field_reg_roomnum.getText();
        String cost = Adminbuild_reg_Choicebox_cost_selector.getValue();

        BuildPolicy buildPolicy = new BuildPolicy(id, client, address, area, areaUnit, buildType, numOfRooms, cost);

        dbHandler.signUpBuildPolicy(buildPolicy);
    }

    private boolean validateHumanFields() {
        if (Adminhuman_reg_choisebox_user.getValue() == null ||
                Adminhuman_field_reg_name.getText().isEmpty() ||
                Adminhuman_field_reg_prizv.getText().isEmpty() ||
                Adminhuman_field_reg_fathername.getText().isEmpty() ||
                Adminhuman_field_reg_year.getText().isEmpty()) {
            showAlert("Помилка", "Будь ласка, заповніть всі поля!");
            return false;
        }

        if (!Adminhuman_gender_reg_man.isSelected() && !Adminhuman_gender_reg_woman.isSelected()) {
            showAlert("Помилка", "Будь ласка, оберіть стать!");
            return false;
        }

        if (!Adminhuman_health_reg_zdorov.isSelected() && !Adminhuman_health_reg_invalid.isSelected()) {
            showAlert("Помилка", "Будь ласка, оберіть стан здоров'я!");
            return false;
        }

        return true;
    }

    private void signUpNewHumanPolicy() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String id = null;
        String client = Adminhuman_reg_choisebox_user.getValue();
        String firstName = Adminhuman_field_reg_name.getText();
        String secondName = Adminhuman_field_reg_prizv.getText();
        String middleName = Adminhuman_field_reg_fathername.getText();
        String age = Adminhuman_field_reg_year.getText();
        String gender = Adminhuman_gender_reg_man.isSelected() ? "Чоловіча" : "Жіноча";
        String health = Adminhuman_health_reg_zdorov.isSelected() ? "Здоровий" : "Інвалід";

        HumanPolicy humanPolicy = new HumanPolicy(id, client, firstName, secondName, middleName, age, gender, health);

        dbHandler.signUpHumanPolicy(humanPolicy);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Інформація");
        alert.setHeaderText(null);
        alert.setContentText("Поліс особи успішно додано!");
        alert.showAndWait();

        Adminhuman_reg_choisebox_user.setValue(null);
        Adminhuman_field_reg_name.clear();
        Adminhuman_field_reg_prizv.clear();
        Adminhuman_field_reg_fathername.clear();
        Adminhuman_field_reg_year.clear();
        Adminhuman_gender_reg_man.setSelected(false);
        Adminhuman_gender_reg_woman.setSelected(false);
        Adminhuman_health_reg_zdorov.setSelected(false);
        Adminhuman_health_reg_invalid.setSelected(false);
    }

    private void signUpNewItemsPolicy() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String id = null;
        String client = AdminItem_reg_choisebox_user.getValue();
        String name = AdminItem_field_reg_name.getText();
        String cost = AdminItem_field_reg_cost.getText();
        String propCondition = AdminItem_field_reg_stanmaina.getText();
        String compensation = AdminItem_reg_choisebox_compensation.getValue();

        ItemsPolicy itemPolicy = new ItemsPolicy(id, client, name, cost, propCondition, compensation);

        dbHandler.signUpItemsPolicy(itemPolicy);
    }

    private void signUpNewBusinessPolicy() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String id = null;
        String client = Adminbussiness_reg_choisebox_user.getValue();
        String name = Adminbussiness_field_reg_name.getText();
        String servIndustries = Adminbussiness_field_reg_sphere.getText();
        String businessCost = Adminbussiness_field_reg_costbussiness.getText();
        String profitPerYear = Adminbussiness_field_reg_moneyinyear.getText();
        String compensation = Adminbussiness_reg_choisebox_compensation.getValue();
        String respons = Adminbussiness_reg_radiobutton_vidpovidal_yes.isSelected() ? "Так" : "Ні";

        BusinessPolicy businessPolicy = new BusinessPolicy(id, client, name, servIndustries, businessCost, profitPerYear, compensation, respons);

        dbHandler.signUpBusinessPolicy(businessPolicy);
    }

    private void addAllVehiclePoliciesToTable() {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        ObservableList<VehiclePolicy> vehiclePolicies = FXCollections.observableArrayList(databaseHandler.getVehiclePolicy());

        AdminEditTransportIdvehiclePolicy.setCellValueFactory(new PropertyValueFactory<>("id"));
        AdminEditTransportClient.setCellValueFactory(new PropertyValueFactory<>("client"));
        AdminEditTransportMaker.setCellValueFactory(new PropertyValueFactory<>("maker"));
        AdminEditTransportModel.setCellValueFactory(new PropertyValueFactory<>("model"));
        AdminEditTransportType.setCellValueFactory(new PropertyValueFactory<>("type"));
        AdminEditTransportRegNumber.setCellValueFactory(new PropertyValueFactory<>("regNumber"));
        AdminEditTransportVinNumber.setCellValueFactory(new PropertyValueFactory<>("vinNumber"));
        AdminEditTransportEngineCapacity.setCellValueFactory(new PropertyValueFactory<>("engineCapacity"));
        AdminEditTransportFuelType.setCellValueFactory(new PropertyValueFactory<>("fuelType"));
        AdminEditTransportColor.setCellValueFactory(new PropertyValueFactory<>("color"));

        AdminEditTransportTable.setItems(vehiclePolicies);
    }

    private void addAllBuildPoliciesToTable() {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        ObservableList<BuildPolicy> buildPolicies = FXCollections.observableArrayList(databaseHandler.getBuildPolicy());

        AdminEditBuildIdbuildPolicy.setCellValueFactory(new PropertyValueFactory<>("id"));
        AdminEditBuildClient.setCellValueFactory(new PropertyValueFactory<>("client"));
        AdminEditBuildAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        AdminEditBuildArea.setCellValueFactory(cellData -> {
            BuildPolicy buildPolicy = cellData.getValue();
            String area = buildPolicy.getArea();
            String areaUnit = buildPolicy.getAreaUnit();
            String combinedInfo = area + " " + areaUnit;
            return new SimpleStringProperty(combinedInfo);
        });
        AdminEditBuildBuildType.setCellValueFactory(new PropertyValueFactory<>("buildType"));
        AdminEditBuildNumOfRooms.setCellValueFactory(new PropertyValueFactory<>("numOfRooms"));
        AdminEditBuildCost.setCellValueFactory(new PropertyValueFactory<>("cost"));

        AdminEditBuildTable.setItems(buildPolicies);
    }

    private void addAllHumanPoliciesToTable() {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        ObservableList<HumanPolicy> humanPolicies = FXCollections.observableArrayList(databaseHandler.getHumanPolicy());

        AdminEditHumanIdhumanPolicy.setCellValueFactory(new PropertyValueFactory<>("id"));
        AdminEditHumanClient.setCellValueFactory(new PropertyValueFactory<>("client"));
        AdminEditHumanFirstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        AdminEditHumanSecondName.setCellValueFactory(new PropertyValueFactory<>("secondName"));
        AdminEditHumanMiddleName.setCellValueFactory(new PropertyValueFactory<>("middleName"));
        AdminEditHumanAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        AdminEditHumanGender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        AdminEditHumanHealth.setCellValueFactory(new PropertyValueFactory<>("health"));

        AdminEditHumanTable.setItems(humanPolicies);
    }

    private void addAllItemsPoliciesToTable() {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        ObservableList<ItemsPolicy> itemsPolicies = FXCollections.observableArrayList(databaseHandler.getItemsPolicy());

        AdminEditItemIditemsPolicy.setCellValueFactory(new PropertyValueFactory<>("id"));
        AdminEditItemClient.setCellValueFactory(new PropertyValueFactory<>("client"));
        AdminEditItemName.setCellValueFactory(new PropertyValueFactory<>("name"));
        AdminEditItemCost.setCellValueFactory(new PropertyValueFactory<>("cost"));
        AdminEditItemPropCondition.setCellValueFactory(new PropertyValueFactory<>("propCondition"));
        AdminEditItemCompensation.setCellValueFactory(new PropertyValueFactory<>("compensation"));

        AdminEditItemTable.setItems(itemsPolicies);
    }

    private void addAllBusinessPoliciesToTable() {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        ObservableList<BusinessPolicy> businessPolicies = FXCollections.observableArrayList(databaseHandler.getBusinessPolicy());

        AdminEditBusinessIdbusinessPolicy.setCellValueFactory(new PropertyValueFactory<>("id"));
        AdminEditBusinessClient.setCellValueFactory(new PropertyValueFactory<>("client"));
        AdminEditBusinessName.setCellValueFactory(new PropertyValueFactory<>("name"));
        AdminEditBusinessServIndustries.setCellValueFactory(new PropertyValueFactory<>("servIndustries"));
        AdminEditBusinessBusinessCost.setCellValueFactory(new PropertyValueFactory<>("businessCost"));
        AdminEditBusinessProfitPerYear.setCellValueFactory(new PropertyValueFactory<>("profitPerYear"));
        AdminEditBusinessRespons.setCellValueFactory(new PropertyValueFactory<>("respons"));
        AdminEditBusinessCompensation.setCellValueFactory(new PropertyValueFactory<>("compensation"));

        AdminEditBusinessTable.setItems(businessPolicies);
    }
}
