package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Agnieszka", "Warszawa", 28);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(new Person("Iza", "Krakow", 18));
        personList.add(new Person("Tatiana", "Kalisz", 25));
        personList.add(new Person("Angelika", "Gdansk", 28));

        for (Person person : personList) {
            System.out.println(person);
        }
        System.out.println();
        personList.stream()
                .sorted(new PersonByNameComparator())
                .forEach(System.out::println);

        System.out.println();
        personList.stream()
                .filter(s -> s.getName().startsWith("Iza"))
                .forEach(System.out::println);


    }
}
