module com.example.pruebita {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pruebita to javafx.fxml;
    exports com.example.pruebita;
}