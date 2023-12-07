package com.aston;

import java.io.InputStream;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("Highload", "High", "Load", "Highload");

        System.out.println(evenNumbers(List.of(2, 101, 445, 100, 55, 46, 19)));

        System.out.println(getCountEquals(stringList, "High"));

        System.out.println(getFirstElement(stringList));
        System.out.println(getLastElement(stringList));

        System.out.println(Arrays.toString(orderStrings(List.of("f10", "f15", "f2", "f4", "f4"))));
        List<University.Student> students = List.of(
                new University.Student("Дмитрий", 17, University.Gender.MAN),
                new University.Student("Максим", 20, University.Gender.MAN),
                new University.Student("Екатерина", 20, University.Gender.WOMAN),
                new University.Student("Михаил", 28, University.Gender.MAN));

        System.out.println(getAverage(students));
        System.out.println(summons(students));
        inputLogins();






    }
    private static long evenNumbers(List<Integer> integers) {
        return integers.stream().filter(integer -> (integer % 2) == 0).count();
    }

    private static long getCountEquals(Collection<String> collection, String s2) {
        return collection.stream().filter(s -> s.compareTo(s2) == 0).count();
    }

    private static String getFirstElement(Collection<String> collection) {
        if (collection.isEmpty())
            return null;
        return collection.stream().findFirst().get();
    }
    private static String getLastElement(Collection<String> collection) {
        if (collection.isEmpty())
            return null;
        return collection.stream().reduce((s, s2) -> s2).orElse(null);
    }

    private static String[] orderStrings(Collection<String> collection) {
        String[] strings = new String[collection.size()];
        strings =  collection.toArray(strings);
        Arrays.sort(strings);
        return strings;
    }

    private static double getAverage(List<University.Student> students) {
        List<Integer> integerList = students.stream()
                .filter(student -> student.getGender() == University.Gender.MAN)
                .map(University.Student::getAge)
                .collect(Collectors.toList());

        Integer[] agesInt = new Integer[integerList.size()];

        agesInt = integerList.toArray(agesInt);

        int[] ints = Arrays.stream(agesInt).mapToInt(i->i).toArray();

        IntStream intStream = IntStream.of(ints);

        return intStream.average().getAsDouble();
    }
    private static List<University.Student> summons(List<University.Student> students) {
        return students.stream()
                .filter(student -> student.getAge() > 18 && student.getAge()<27)
                .collect(Collectors.toList());
    }
    private static void inputLogins() {
        List<String> logins = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (!scanner.nextLine().isEmpty()) {
            logins.add(scanner.nextLine());
        }
        logins.stream().filter(s -> s.charAt(0) == 'f').forEach(System.out::println);
    }



}