package com.aston;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("Highload", "High", "Load", "Highload");

        System.out.println(evenNumbers(List.of(2, 101, 445, 100, 55, 46, 19)));

        System.out.println(getCountEquals(stringList, "High"));

        System.out.println(getFirstElement(stringList));
        System.out.println(getLastElement(stringList));

        System.out.println(orderStrings(List.of("f10", "f15", "f2", "f4", "f4")).toString());
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

    private static List<String> orderStrings(Collection<String> collection) {
        return collection.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }

    private static double getAverage(List<University.Student> students) {
        return students.stream()
                .filter(student -> student.getGender() == University.Gender.MAN)
                .mapToInt(University.Student::getAge)
                .average()
                .getAsDouble();
    }
    private static List<University.Student> summons(List<University.Student> students) {
        return students.stream()
                .filter(student -> student.getAge() > 18
                        && student.getAge() < 27
                        && student.getGender() == University.Gender.MAN)
                .collect(Collectors.toList());
    }
    private static void inputLogins() {
        List<String> logins = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (!scanner.nextLine().isEmpty()) {
            logins.add(scanner.nextLine());
        }
        scanner.close();
        logins.stream().filter(s -> s.charAt(0) == 'f').forEach(System.out::println);
    }



}