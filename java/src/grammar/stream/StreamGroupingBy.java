package src.grammar.stream;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class StreamGroupingBy {
    private static final List<Dish> dishes = Arrays.asList(
            new Dish("salmon", Type.FISH, 300),
            new Dish("rice", Type.OTHER, 300),
            new Dish("pizza", Type.OTHER, 900),
            new Dish("pork", Type.MEAT, 500),
            new Dish("chicken", Type.MEAT, 800),
            new Dish("beef", Type.MEAT, 450)
    );

    public static void main(String[] args) {
        System.out.println(dishesByType());
        System.out.println(dishesByCaloricLevel());
        System.out.println(dishesByTypeCaloricLevel());
        System.out.println(countByType());
        System.out.println(mostCaloricByType());
    }

    /**
     * @return 종류별 가장 고칼로리 음식
     */
    private static Map<Type, Dish> mostCaloricByType() {
        return dishes.stream()
                .collect(groupingBy(Dish::getType, // 분류 함수
                        collectingAndThen(
                                maxBy(comparingInt(Dish::getCalorie)), // Optional<Dish>
                                Optional::get // 변환 함수 => Dish
                        ))
                );
    }

    /**
     * @return 종류별 음식 목록
     */
    private static Map<Type, List<Dish>> dishesByType() {
        return dishes.stream().collect(groupingBy(Dish::getType));
    }

    /**
     * @return 칼로리 단계별 음식 목록
     */
    private static Map<CaloricLevel, List<Dish>> dishesByCaloricLevel() {
        return dishes.stream()
                .collect(groupingBy(dish -> {
                    if (dish.getCalorie() <= 400) {
                        return CaloricLevel.DIET;
                    } else if (dish.getCalorie() <= 700) {
                        return CaloricLevel.NORMAL;
                    } else {
                        return CaloricLevel.FAT;
                    }
                }));
    }

    /**
     * @return 종류에 따른 칼로리 단계별 음식 목록
     */
    private static Map<Type, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloricLevel() {
        return dishes.stream().collect(
                groupingBy(Dish::getType, // 첫번째 수준의 분류 함수 => FISH, MEAT, OTHER
                        groupingBy(dish -> { // 두번째 수준의 분류 함수 => DIET, NORMAL, FAT
                            if (dish.getCalorie() <= 400) {
                                return CaloricLevel.DIET;
                            } else if (dish.getCalorie() <= 700) {
                                return CaloricLevel.NORMAL;
                            } else {
                                return CaloricLevel.FAT;
                            }
                        })
                )
        );
    }

    /**
     * @return 종류 별 음식 개수
     */
    private static Map<Type, Long> countByType() {
        return dishes.stream().collect(groupingBy(Dish::getType, counting()));
    }

    private enum CaloricLevel {
        DIET, NORMAL, FAT
    }

    private enum Type {
        FISH, MEAT, OTHER
    }

    private static class Dish {
        private final String name;
        private final Type type;
        private final int calorie;

        public Dish(String name, Type type, int calorie) {
            this.name = name;
            this.type = type;
            this.calorie = calorie;
        }

        public String getName() {
            return name;
        }

        public Type getType() {
            return type;
        }

        public int getCalorie() {
            return calorie;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
