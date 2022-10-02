module com.example.deze2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.deze2 to javafx.fxml;
    exports com.example.deze2;
}