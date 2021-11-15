module example.isdemo_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens example.gui to javafx.fxml, javafx.graphics;
    exports example.gui;
}