module Timer {
    requires java.desktop;
    requires javafx.controls;
    requires javafx.graphics;
    requires java.sql;

    opens Timer to javafx.graphics, javafx.controls;
}