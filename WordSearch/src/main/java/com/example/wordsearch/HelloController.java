package com.example.wordsearch;

import com.example.wordsearch.bll.WordsLogic;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button btnSearch, btnUpdate, btnSearch2, btnSearch3;
    @FXML
    private ListView mainWordList, secondaryWordList, thirdWordList, historyWordList;
    @FXML
    private TextField txtFieldSearch;



    @FXML
    protected void onBtnSearchClick() {

        mainWordList.getItems().clear();

        if (!txtFieldSearch.getText().isEmpty()) {

            for (String line: WordsLogic.getWords()) {

                if (line.contains(txtFieldSearch.getText())) {

                    mainWordList.getItems().add(line);

                }

            }

        } else {

            btnUpdate.fire();

        }

    }

    @FXML
    protected void onBtnSearch2Click() {

        secondaryWordList.getItems().clear();

        for (String line: WordsLogic.getWords()) {

            if (line.startsWith("a")) {

                secondaryWordList.getItems().add(line);

            }

        }
    }

    @FXML
    protected void onBtnSearch3Click() {

        thirdWordList.getItems().clear();

        for (String line: WordsLogic.getWords()) {

            if (line.startsWith("n")) {

                thirdWordList.getItems().add(line);

            }

        }
    }

    @FXML
    protected void onBtnUpdateClick() {

        mainWordList.getItems().clear();

        for (String line: WordsLogic.getWords()) {

            mainWordList.getItems().add(line);

        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btnUpdate.fire();
        btnSearch2.fire();
        btnSearch3.fire();


    }
}
