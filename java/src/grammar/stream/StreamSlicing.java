package src.grammar.stream;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

public class StreamSlicing {
    private static final List<Person> persons = Arrays.asList(
            new Person("jolly", 25),
            new Person("wuk", 26),
            new Person("jin", 27),
            new Person("anne", 28)
    );

    public static void main(String[] args) {
        System.out.println("drop = " + drop());
        System.out.println("take = " + take());
    }

    public static List<Person> drop() {
        return persons.stream()
                .dropWhile(person -> person.age <= 26)
                .collect(toList());
    }

    public static List<Person> take() {
        return persons.stream()
                .takeWhile(person -> person.age <= 26)
                .collect(toList());
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "{" + "name='" + name + '\'' + ", age=" + age + '}';
        }
    }
}
