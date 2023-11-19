import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(isInInterval(15, 20));
        System.out.println(isInInterval(15, 21));

        printString("Hallo", 9);

        printRational(18);
        printRational(-18);

        System.out.println(isNegative(21));
        System.out.println(isNegative(-21));

        System.out.println(isLeap(1963));
        System.out.println(isLeap(1700));
        System.out.println(isLeap(1600));

        int[] values = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        transposition(values);

        int[] empty = new int[100];
        fillingArray(empty);

        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyArray(array);

        int[][] array2 = new int[][]{{1, 5, 3, 2, 11},
                                    {1, 7, 3, 2, 2},
                                    {1, 7, 3, 2, 2},
                                    {1, 7, 3, 2, 2},
                                    {1, 7, 3, 2, 2}};
        diagonal(array2);
        for (int[] ints : array2) {
            System.out.println(Arrays.toString(ints));
        }

        int[] array3 = initialArray(10, 3);

    }

    public static boolean isInInterval(int value1, int value2) {
        return (value1 > 10 && value1 <= 20) && (value2 > 10 && value2 <= 20);
    }
    public static void printString(String s, int value) {
        for (int i = 0; i < value; i++) {
            System.out.println(s);
        }
    }
    public static void printRational(int value) {
        if (value >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }
    public static boolean isNegative(int value) {
        return value < 0;
    }
    public static boolean isLeap(int date) {
        return (date % 4 == 0) && ((date % 100 != 0) || (date % 400 == 0)) && (date > 1584);
    }
    public static void transposition(int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0)
                values[i] = 1;
            else if (values[i] == 1)
                values[i] = 0;
        }
    }
    public static void fillingArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            values[i] = i + 1;
        }
    }
    public static void multiplyArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 6)
                values[i] *= 2;
        }
    }
    public static void diagonal(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if ((j == i) || (j == values[i].length - i - 1))
                    values[i][j] = 1;
            }
        }
    }
    public static int[] initialArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

}