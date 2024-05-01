package com.example.insuranceapp;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.layout.AnchorPane;

import static com.example.insuranceapp.MainController.NAME;

public class UserpanelController {
    Stage stage = new Stage();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Build;

    @FXML
    private TableColumn<String, String> BuildadressView;

    @FXML
    private TableColumn<BuildPolicy, String> BuildareaView;

    @FXML
    private TableColumn<String, String> BuildcostView;

    @FXML
    private TableColumn<String, String> BuildroomnumberView;

    @FXML
    private TableColumn<String, String> BuildtypeView;

    @FXML
    private AnchorPane Buildview;

    @FXML
    private Button Business;

    @FXML
    private TableColumn<String, String> BusinesscompensationView;

    @FXML
    private TableColumn<String, String> BusinesscostView;

    @FXML
    private TableColumn<String, String> BusinessnameView;

    @FXML
    private TableColumn<String, String> BusinessprofitinyearView;

    @FXML
    private TableColumn<String, String> BusinessresponsView;

    @FXML
    private TableColumn<String, String> BusinesssphereView;

    @FXML
    private AnchorPane Businessview;

    @FXML
    private TableView<String> BusinessviewTable;

    @FXML
    private Button Human;

    @FXML
    private TableColumn<String, String> HumanfirstnameView;

    @FXML
    private TableColumn<String, String> HumangenderView;

    @FXML
    private TableColumn<String, String> HumanhealthView;

    @FXML
    private TableColumn<String, String> HumanmiddlenameView;

    @FXML
    private TableColumn<String, String> HumansecondnameView;

    @FXML
    private AnchorPane Humanview;

    @FXML
    private TableColumn<String, String> HumanyearView;

    @FXML
    private TableColumn<String, String> ItemcompensationView;

    @FXML
    private TableColumn<String, String> ItemconditionView;

    @FXML
    private TableColumn<String, String> ItemcostView;

    @FXML
    private TableColumn<String, String> ItemnameView;

    @FXML
    private Button Items;

    @FXML
    private AnchorPane Itemview;

    @FXML
    private TableView<ItemsPolicy> ItemviewTable;

    @FXML
    private Button Transport;

    @FXML
    private TableColumn<String, String> TransportCapacityView;

    @FXML
    private TableColumn<String, String> TransportColorView;

    @FXML
    private TableColumn<String, String> TransportFueltypeView;

    @FXML
    private TableColumn<String, String> TransportMarkView;

    @FXML
    private TableColumn<String, String> TransportModelView;

    @FXML
    private TableColumn<String, String> TransportNumberView;

    @FXML
    private TableColumn<String, String> TransportTypeViwe;

    @FXML
    private TableColumn<String, String> TransportVinnumberView;

    @FXML
    private AnchorPane Transportview;

    @FXML
    private Button back;

    @FXML
    private TableView<BuildPolicy> buildviewTable;

    @FXML
    private Button exit;

    @FXML
    private TableView<HumanPolicy> humanviewTable;

    @FXML
    private TableView<VehiclePolicy> transportviewTable;

    @FXML
    private AnchorPane userpane;

    @FXML
    void handleViewBuild(ActionEvent event) {
        Transportview.setVisible(false);
        Buildview.setVisible(true);
        Humanview.setVisible(false);
        Itemview.setVisible(false);
        Businessview.setVisible(false);
    }

    @FXML
    void handleViewBusiness(ActionEvent event) {
        Transportview.setVisible(false);
        Buildview.setVisible(false);
        Humanview.setVisible(false);
        Itemview.setVisible(false);
        Businessview.setVisible(true);
    }

    @FXML
    void handleViewHuman(ActionEvent event) {
        Transportview.setVisible(false);
        Buildview.setVisible(false);
        Humanview.setVisible(true);
        Itemview.setVisible(false);
        Businessview.setVisible(false);
    }

    @FXML
    void handleViewItems(ActionEvent event) {
        Transportview.setVisible(false);
        Buildview.setVisible(false);
        Humanview.setVisible(false);
        Itemview.setVisible(true);
        Businessview.setVisible(false);
    }

    @FXML
    void handleViewTransport(ActionEvent event) {
        Transportview.setVisible(true);
        Buildview.setVisible(false);
        Humanview.setVisible(false);
        Itemview.setVisible(false);
        Businessview.setVisible(false);
    }

    @FXML
    void initialize() {
        addVehiclePoliciesToTable();
        addBuildPoliciesToTable();
        addHumanPoliciesToTable();
        addItemsPoliciesToTable();
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
            Stage currentStage = (Stage) userpane.getScene().getWindow();
            currentStage.close();
        });
    }

    private void addVehiclePoliciesToTable() {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        ObservableList<VehiclePolicy> vehiclePolicies = FXCollections.observableArrayList(databaseHandler.getVehiclePolicy());

        ObservableList<VehiclePolicy> filteredVehiclePolicies = FXCollections.observableArrayList();

        for(VehiclePolicy vehiclePolicy : vehiclePolicies) {
            if(vehiclePolicy.getClient().equals(NAME)) {
                filteredVehiclePolicies.add(vehiclePolicy);
            }
        }

        TransportMarkView.setCellValueFactory(new PropertyValueFactory<>("maker"));
        TransportModelView.setCellValueFactory(new PropertyValueFactory<>("model"));
        TransportTypeViwe.setCellValueFactory(new PropertyValueFactory<>("type"));
        TransportNumberView.setCellValueFactory(new PropertyValueFactory<>("regNumber"));
        TransportVinnumberView.setCellValueFactory(new PropertyValueFactory<>("vinNumber"));
        TransportCapacityView.setCellValueFactory(new PropertyValueFactory<>("engineCapacity"));
        TransportFueltypeView.setCellValueFactory(new PropertyValueFactory<>("fuelType"));
        TransportColorView.setCellValueFactory(new PropertyValueFactory<>("color"));

        transportviewTable.setItems(filteredVehiclePolicies);
    }

    private void addBuildPoliciesToTable() {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        ObservableList<BuildPolicy> buildPolicies = FXCollections.observableArrayList(databaseHandler.getBuildPolicy());

        ObservableList<BuildPolicy> filteredBuildPolicies = FXCollections.observableArrayList();

        for(BuildPolicy buildPolicy : buildPolicies) {
            if(buildPolicy.getClient().equals(NAME)) {
                filteredBuildPolicies.add(buildPolicy);
            }
        }

        BuildadressView.setCellValueFactory(new PropertyValueFactory<>("address"));
        BuildareaView.setCellValueFactory(cellData -> {
            BuildPolicy buildPolicy = cellData.getValue();
            String area = buildPolicy.getArea();
            String areaUnit = buildPolicy.getAreaUnit();
            String combinedInfo = area + " " + areaUnit;
            return new SimpleStringProperty(combinedInfo);
        });
        BuildtypeView.setCellValueFactory(new PropertyValueFactory<>("buildType"));
        BuildroomnumberView.setCellValueFactory(new PropertyValueFactory<>("numOfRooms"));
        BuildcostView.setCellValueFactory(new PropertyValueFactory<>("cost"));

        buildviewTable.setItems(filteredBuildPolicies);
    }

    private void addHumanPoliciesToTable() {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        ObservableList<HumanPolicy> humanPolicies = FXCollections.observableArrayList(databaseHandler.getHumanPolicy());

        ObservableList<HumanPolicy> filteredHumanPolicies = FXCollections.observableArrayList();

        for(HumanPolicy humanPolicy : humanPolicies) {
            if(humanPolicy.getClient().equals(NAME)) {
                filteredHumanPolicies.add(humanPolicy);
            }
        }

        HumanfirstnameView.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        HumansecondnameView.setCellValueFactory(new PropertyValueFactory<>("secondName"));
        HumanmiddlenameView.setCellValueFactory(new PropertyValueFactory<>("middleName"));
        HumanyearView.setCellValueFactory(new PropertyValueFactory<>("age"));
        HumangenderView.setCellValueFactory(new PropertyValueFactory<>("gender"));
        HumanhealthView.setCellValueFactory(new PropertyValueFactory<>("health"));

        humanviewTable.setItems(filteredHumanPolicies);
    }

    private void addItemsPoliciesToTable() {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        ObservableList<ItemsPolicy> itemsPolicies = FXCollections.observableArrayList(databaseHandler.getItemsPolicy());

        ObservableList<ItemsPolicy> filteredItemsPolicies = FXCollections.observableArrayList();

        for(ItemsPolicy itemsPolicy : itemsPolicies) {
            if(itemsPolicy.getClient().equals(NAME)) {
                filteredItemsPolicies.add(itemsPolicy);
            }
        }

        ItemnameView.setCellValueFactory(new PropertyValueFactory<>("name"));
        ItemcostView.setCellValueFactory(new PropertyValueFactory<>("cost"));
        ItemconditionView.setCellValueFactory(new PropertyValueFactory<>("propCondition"));
        ItemcompensationView.setCellValueFactory(new PropertyValueFactory<>("compensation"));

        ItemviewTable.setItems(filteredItemsPolicies);
    }
}
