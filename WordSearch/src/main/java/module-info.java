module com.example.wordsearch {
    requires javafx.controls;
    requires javafx.fxml;
    //requires com.example.wordsearch;


    exports com.example.wordsearch;
    opens com.example.wordsearch to javafx.fxml;
    exports com.example.wordsearch.gui;
    opens com.example.wordsearch.gui to javafx.fxml;
    //exports com.example.wordsearch.gui;
    //opens com.example.wordsearch.gui to javafx.fxml;
}