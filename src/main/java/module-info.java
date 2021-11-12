module ucf.assignments.App {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;
    requires junit;


    opens ucf.assignments to javafx.fxml;
    exports ucf.assignments;
}