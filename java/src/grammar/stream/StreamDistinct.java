package src.grammar.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamDistinct {
    public static void main(String[] args) {
        // 리스트 중복 제거
        List<Integer> intList = Arrays.asList(1, 3, 2, 3, 5, 5, 7, 6);

        List<Integer> intStreamToList = intList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(intList); // [1, 3, 2, 3, 5, 5, 7, 6]
        System.out.println(intStreamToList); // [1, 3, 2, 5, 7, 6] -> 순서가 보장됨

        // 사용자 정의 클래스 중복 제거
        // 중복 요소 확인을 위해 equals, hashCode 오버라이딩
        List<Person> personList = Arrays.asList(
                new Person("짱구", 7),
                new Person("짱구", 7),
                new Person("철수", 7),
                new Person("철수", 7));

        List<Person> personListStream = personList.stream()
                .distinct()
                .collect(Collectors.toList());

        personListStream.forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }
    }
}
