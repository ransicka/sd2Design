module org.example.hellooo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.hellooo to javafx.fxml;
    exports org.example.hellooo;
}