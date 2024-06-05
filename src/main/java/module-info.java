module com.example.pruebita {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.pruebita to javafx.fxml;
    exports com.example.pruebita;
}