package com.aston;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("Vitaly", "alex", "Vlad", "Vitaly",
                                                     "lena", "Oleg", "Gena", "Vlad",
                                                        "jackson", "rick", "morty");
        HashSet<String> hashSet = new HashSet<>(stringList);
        System.out.println(hashSet);

        Map<String, Integer> stringsHashMap = new HashMap<>();

        for (String word : stringList) {
            Integer oldCount = stringsHashMap.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
            stringsHashMap.put(word, oldCount + 1);
        }
        for (String word : hashSet) {
            System.out.println(word + ":" + stringsHashMap.get(word));
        }

        //TelephoneBook

        TelephoneBook telephoneBook = new TelephoneBook();

        telephoneBook.add("Rezanov", List.of("89067895401", "89067896101"));
        telephoneBook.add("Kartapov", List.of("89063095402"));
        telephoneBook.add("Astapov", List.of("89603095403", "89603097003", "89608935403"));

        System.out.println(telephoneBook.get("Rezanov"));
        System.out.println(telephoneBook.get("Kartapov"));
        System.out.println(telephoneBook.get("Astapov"));


    }
}