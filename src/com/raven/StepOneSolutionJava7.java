package com.raven;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StepOneSolutionJava7 {

    public static void main(String[] args) throws Exception {
        List<Person> persons = Arrays.asList(
                new Person("Snow", "White", 60),
                new Person("Charles", "Dickens", 53),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 49),
                new Person("Charllote", "Brante", 46),
                new Person("Mathew", "Arnold", 39));

        // Step 1: sort the list by last name
        Collections.sort(persons, new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }

        });

        // Step 2: Create a methos that prints all the elements in the list
        printAll(persons);

        // Step 3: Create a method that prints all people those have last name begining
        // with C
        printLastNameBeginingWithC(persons);

        System.out.println("Print conditionally all last name with C ----------------");
        printConditionally(persons, new Condition() {

            @Override
            public boolean check(Person p) {
                return p.getLastName().startsWith("C");
            }

        });

        System.out.println("Print conditionally all first name with C ----------------");
        printConditionally(persons, new Condition() {

            @Override
            public boolean check(Person p) {
                return p.getFirstName().startsWith("C");
            }

        });
    }

    private static void printConditionally(List<Person> persons, Condition condition) {
        for (Person p : persons) {
            if (condition.check(p)) {
                System.out.println(p);
            }
        }
        System.out.println("----------------");
    }

    private static void printLastNameBeginingWithC(List<Person> persons) {
        System.out.println("Print all last name with C ----------------");
        for (Person p : persons) {
            if (p.getLastName().startsWith("C")) {
                System.out.println(p);
            }
        }
        System.out.println("----------------");
    }

    private static void printAll(List<Person> persons) {
        System.out.println("Print all ----------------");
        for (Person p : persons) {
            System.out.println(p);
        }
        System.out.println("----------------");
    }
}
