module com.example.partb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires sqlite.jdbc;


    opens com.example.partb to javafx.fxml;
    exports com.example.partb;
    exports com.example.partb.Controller;
    opens com.example.partb.Controller to javafx.fxml;
    exports com.example.partb.models;
    opens com.example.partb.models to javafx.fxml;
}