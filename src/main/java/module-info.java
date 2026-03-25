module com.example.calculatricegraphique {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculatricegraphique to javafx.fxml;
    exports com.example.calculatricegraphique;
}