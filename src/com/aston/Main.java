package com.aston;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[]{new Employee("Ivan Mokarov", "HR", "makarov@mail.com",
                "89478375820",50000, 35),
                new Employee("Roman Derkov", "Engineer", "Derkov@mail.com",
                        "89472349876",40000, 26),
                new Employee("Oleg Suraikin", "Analyst", "Suraikin@mail.com",
                        "89608364820",70000, 41),
                new Employee("Adam Soikin", "Team Lead", "Soikin@mail.com",
                        "89808383620",100000, 45),
                new Employee("Maksim Tatoshkin", "Manager", "Tatoshkin@mail.com",
                        "89558823750",70000, 32)};
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }

        Park park = new Park(Arrays.asList(new Park.Attraction("Attraction1", 8,550),
                new Park.Attraction("Attraction2", 6,450)));
        System.out.println(park);

    }
}