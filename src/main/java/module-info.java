module com.bedtobed.bed2bed {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.bedtobed.bed2bed to javafx.fxml;
    exports com.bedtobed.bed2bed;
}