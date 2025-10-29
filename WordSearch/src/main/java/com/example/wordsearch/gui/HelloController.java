package com.example.wordsearch.gui;

import com.example.wordsearch.bll.HistoryLogic;
import com.example.wordsearch.bll.WordsLogic;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

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

            HistoryLogic.sendHistory("Searched '" + txtFieldSearch.getText() + "' and found " + mainWordList.getItems().size() + " words.");

            historyWordList.getItems().clear();

            for (String line: HistoryLogic.getHistory().reversed()) {

                historyWordList.getItems().add(line);

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

    @FXML
    protected void onBtnClearClick() {

        historyWordList.getItems().clear();

        HistoryLogic.clearHistory();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btnUpdate.fire();
        btnSearch2.fire();
        btnSearch3.fire();

        for (String line: HistoryLogic.getHistory().reversed()) {

            historyWordList.getItems().add(line);

        }

    }
}
