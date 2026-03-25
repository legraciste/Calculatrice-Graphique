module com.example.calculatricegraphique {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.calculatricegraphique to javafx.fxml;
    exports com.example.calculatricegraphique;
}