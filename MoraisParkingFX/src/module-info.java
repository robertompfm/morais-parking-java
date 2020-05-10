module MoraisParkingFX {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires java.sql;
    requires fontawesomefx;


    opens control;
    opens control.content;
    opens control.sidebar;

    opens model.data;
    opens model.objects;

    opens view;
    opens view.css;
    opens view.fxml;
    opens view.fxml.content;
    opens view.fxml.sidebar;
    opens view.fxml.topbar;
}