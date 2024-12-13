module com.example.demo7 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.demo7 to javafx.fxml;
    exports com.example.demo7;
}