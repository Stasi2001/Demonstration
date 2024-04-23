module com.example.demonstration {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demonstration to javafx.fxml;
    exports com.example.demonstration;
}