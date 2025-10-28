package com.example.wordsearch.dal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordsData {

    private static String wordFile = "src/main/resources/com/example/wordsearch/brit-a-z.txt";

    public static List<String> readAllLines() {

        try (BufferedReader br = new BufferedReader(new FileReader(wordFile))) {

            List<String> lines = new ArrayList<>();
            String line = br.readLine();
            int count = 0;

            while (line != null) {
                count++;
                lines.add(line);
                line = br.readLine();
            }

            return lines;

        }
        catch (IOException e) {

            e.printStackTrace();
            return null;

        }
    }

}
