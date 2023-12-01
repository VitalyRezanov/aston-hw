package com.aston;

import java.util.*;

public class TelephoneBook {
    private Map<String, HashSet<String>> book;

    public TelephoneBook(Map<String, HashSet<String>> book) {
        this.book = book;
    }

    public TelephoneBook() {
        this.book = new HashMap<>();
    }

    public String get(String family) {
        return book.get(family).toString();
    }
    public void add(String family, List<String> numbers) {
        if (book.containsKey(family)) {
            book.get(family).addAll(numbers);

        } else {
            book.put(family, new HashSet<>(numbers));
        }
    }
}
