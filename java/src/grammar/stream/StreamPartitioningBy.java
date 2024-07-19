package src.grammar.stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.partitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StreamPartitioningBy {
    private static final List<Person> persons = Arrays.asList(
            new Person("jolly", Sex.FEMALE),
            new Person("wuga", Sex.MALE),
            new Person("jin", Sex.MALE)
    );

    public static void main(String[] args) {
        System.out.println(partitioningByMale());
        System.out.println(countByMail());
    }

    private static Object countByMail() {
        return persons.stream()
                .collect(partitioningBy(Person::isMale, counting()));
    }

    private static Map<Boolean, List<Person>> partitioningByMale() {
        return persons.stream()
                .collect(partitioningBy(Person::isMale));
    }

    private enum Sex {
        MALE, FEMALE
    }

    private static class Person {
        private final String name;
        private final Sex sex;

        private Person(String name, Sex sex) {
            this.name = name;
            this.sex = sex;
        }

        private boolean isMale() {
            return sex.equals(Sex.MALE);
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
