package com.aston;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] strings = new String[]{"value1", "value2", "value3"};
        int row = strings.length;

        int[][] values = new int[][]{{10, 20, 33}, {3, 6, 1}};
        int lines = values.length;



        AppData writeData = new AppData(strings, values);
        save(writeData);

        AppData readData = read(lines,row);
        System.out.println(readData);


    }
    public static void save(AppData data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test.csv"))) {
            for (int i = 0; i < data.getHeader().length; i++) {
                if (i == data.getHeader().length - 1)
                    writer.write(data.getHeader()[i]);
                else
                    writer.write(data.getHeader()[i] + ";");
            }

            writer.newLine();

            for (int i = 0; i < data.getData().length; i++) {
                for (int j = 0; j < data.getData()[i].length; j++) {
                    if (j == data.getData()[i].length - 1)
                        writer.write(Integer.toString(data.getData()[i][j]));
                    else
                        writer.write(data.getData()[i][j] + ";");
                }
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static AppData read(int lines, int row) {
        String[] headers;
        int [][] values = new int[lines][row];

        try (BufferedReader reader = new BufferedReader(new FileReader("test.csv"))) {
            headers = reader.readLine().split(";");
            for (int i = 0; i < lines; i++) {
                String line = reader.readLine();
                values[i] = intArrayToStr(line.split(";"));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new AppData(headers,values);
    }
    private static int[] intArrayToStr(String[] strings) {
        int[] values = new int[strings.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(strings[i]);
        }
        return values;
    }
}