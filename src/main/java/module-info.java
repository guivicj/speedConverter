module org.guivic.speedconverter {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.guivic.speedconverter to javafx.fxml;
    exports org.guivic.speedconverter;
}