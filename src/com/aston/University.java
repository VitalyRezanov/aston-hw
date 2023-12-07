package com.aston;

import java.util.List;

public class University {

//    private List<Student> students;



//    public University(List<Student> students) {
//        this.students = students;
//    }

    public enum Gender {
        MAN,
        WOMAN
    }
//    public List<Student> getStudents() {
//        return students;
//    }
    public static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }
}
