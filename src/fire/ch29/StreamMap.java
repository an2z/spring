package src.fire.ch29;

import java.util.Arrays;
import java.util.List;

class StreamMap {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("Red", "Black", "Blue");

        li.stream()
                .map(s -> s.length())
                .forEach(s -> System.out.print(s + " "));
    }
}
