package com.raven;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("**** Welcome to Lamda Expression Excersice ***");

        List<Person> persons = Arrays.asList(
                new Person("Snow", "White", 60),
                new Person("Charles", "Dickens", 53),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 49),
                new Person("Charllote", "Brante", 46),
                new Person("Mathew", "Arnold", 39));

        // Step 1: sort the list by last name
        Collections.sort(persons, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2: Create a methos that prints all the elements in the list
        // printAll(persons);
        System.out.println("Print all sorted list  ------------------------------------");
        // printConditionally(persons, p -> true);
        printConditionallyWithPredicate(persons, p -> true);

        // Step 3: Create a method that prints all people those have last name begining
        // with C
        System.out.println("Print conditionally all last name with C ----------------");
        // printConditionally(persons, p -> p.getLastName().startsWith("C"));
        printConditionallyWithPredicate(persons, p -> p.getLastName().startsWith("C"));

        System.out.println("Print conditionally all first name with C ----------------");
        // printConditionally(persons, p -> p.getFirstName().startsWith("C"));
        printConditionallyWithPredicate(persons, p -> p.getFirstName().startsWith("C"));
    }

    // "Predicate" is an interface provided by Java 8,
    // which has a method "test" same as method "check" in interface "Condition"
    private static void printConditionallyWithPredicate(List<Person> persons, Predicate<Person> condition) {
        for (Person p : persons) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
        System.out.println("-------------------------------");
    }

    // private static void printConditionally(List<Person> persons, Condition condition) {
    //     for (Person p : persons) {
    //         if (condition.check(p)) {
    //             System.out.println(p);
    //         }
    //     }
    //     System.out.println("----------------");
    // }

    // private static void printAll(List<Person> persons) {
    //     System.out.println("Print all sorted list  ------------------------------------");
    //     for (Person p : persons) {
    //         System.out.println(p);
    //     }
    //     System.out.println("------------------------------------------------------------");
    // }
}
