package com.example.wordsearch.dal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HistoryData {

    private static final String historyFile = "src/main/resources/com/example/wordsearch/history.txt";

    public static List<String> readAllLines() {

        try (BufferedReader br = new BufferedReader(new FileReader(historyFile))) {

            List<String> lines = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
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

    public static void writeLine(String message) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(historyFile, true))) {

            bw.write(message);
            bw.newLine();


            //bw.close();

        }
        catch (IOException e) {

            e.printStackTrace();

        }

    }

    public static void clearFile() {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(historyFile))) {

            bw.flush();

            //bw.close();

        }
        catch (IOException e) {

            e.printStackTrace();

        }

    }

}
