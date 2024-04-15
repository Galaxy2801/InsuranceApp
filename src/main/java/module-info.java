module com.example.insuranceapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.insuranceapp to javafx.fxml;
    exports com.example.insuranceapp;
}