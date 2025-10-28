package com.example.wordsearch.bll;

import com.example.wordsearch.dal.WordsData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordsLogic {

    public static List<String> getWords() {

        return WordsData.readAllLines();
    }

}
