package com.sh.prototype.usage.collection;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student keesun = new Student("keesun");
        Student whiteship = new Student("whiteship");
        List<Student> students = new ArrayList<>();
        students.add(keesun);
        students.add(whiteship);

        List<Student> cloned = new ArrayList<>(students);
        System.out.println(cloned);

        System.out.println(students != cloned); // true
        System.out.println(students.equals(cloned)); // true

        // shallow copy
        students.get(0).setName("honggd");
        System.out.println(cloned.get(0).getName()); // honggd
    }
}
