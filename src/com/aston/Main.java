package com.aston;

public class Main {
    public static void main(String[] args) {
        String[][] s1 = {{"1","2","3","4"},
                        {"1","2","3","4"},
                        {"1","2","3","4"},
                        {"1","2","3","4"}};
        System.out.println("Sum: " + stringArrayToIntArray(s1));

        String[][] s2 = {{"1","2","3","4"},
                        {"1","2","fdgdfg","4"},
                        {"1","2","3","4"},
                        {"1","2","3","4"}};
        //System.out.println("Sum: " + stringArrayToIntArray(s2));

        String[][] s3 = {{"1","2","3","4"},
                        {"1","2","3","4"},
                        {"1","2","3","4","6"},
                        {"1","2","3","4"}};
        System.out.println("Sum: " + stringArrayToIntArray(s3));




    }
    static int stringArrayToIntArray(String[][] strings) {

        int [][] arrays = new int[4][4];
        int sum = 0;
        checkMyArraySizeException(strings.length);
        for (int i = 0; i < strings.length; i++) {
            checkMyArraySizeException(strings[i].length);
            for (int j = 0; j < strings[i].length; j++) {
                try {
                    arrays[i][j] = Integer.parseInt(strings[i][j]);
                    sum += arrays[i][j];
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("There is no number in the cell " +
                            "[" + i + "]" + "[" + j + "]" + " value: " + strings[i][j]);
                }

            }
        }
        return sum;
    }
    private static void checkMyArraySizeException(int length) {
        if (length != 4) {
            throw new MyArraySizeException("The input is not a square array of 4x4 size");
        }
    }
    private static void checkMyArrayDataException(int length) {
        if (length != 4) {
            throw new MyArrayDataException("");
        }
    }
}