package com.example.wordsearch.bll;

import com.example.wordsearch.dal.HistoryData;

import java.util.List;

public class HistoryLogic {

    public static List<String> getHistory() {

        return HistoryData.readAllLines();

    }

    public static void sendHistory(String message) {

        HistoryData.writeLine(message);

    }

    public static void clearHistory() {

        HistoryData.clearFile();

    }

}