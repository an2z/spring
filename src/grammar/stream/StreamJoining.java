package src.grammar.stream;

import static java.util.stream.Collectors.joining;

import java.util.Arrays;
import java.util.List;

public class StreamJoining {
    private static final List<Fruit> fruits = Arrays.asList(
            new Fruit("Apple"),
            new Fruit("Banana"),
            new Fruit("Mango")
    );

    public static void main(String[] args) {
        System.out.println(joinName());
    }

    private static String joinName() {
        return fruits.stream()
                .map(Fruit::getName)
                .collect(joining(", ")); // 문자열 연결
    }

    private static class Fruit {
        private final String name;

        public Fruit(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
