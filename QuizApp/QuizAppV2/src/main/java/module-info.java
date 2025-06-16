module com.ndd.quizappv2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    
    opens com.ndd.quizappv2 to javafx.fxml;
    exports com.ndd.quizappv2;
}
