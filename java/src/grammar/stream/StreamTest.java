package src.grammar.stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

public class StreamTest {
    private static final Trader raoul = new Trader("Raoul", "Cambridge");
    private static final Trader mario = new Trader("Mario", "Milan");
    private static final Trader alan = new Trader("Alan", "Cambridge");
    private static final Trader brian = new Trader("Brian", "Cambridge");
    private static final List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    public static void main(String[] args) {
        System.out.println(test1());
        System.out.println(test2());
        System.out.println(test3());
        System.out.println(test4());
        System.out.println(test5());
        test6();
        System.out.println(test7());
        System.out.println(test8());
    }

    /**
     * @return 전체 트랜잭션 중 최솟값
     */
    private static int test8() {
        return transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min)
                .get();
    }

    /**
     * @return 전체 트랜잭션 중 최댓값
     */
    private static int test7() {
        return transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max)
                .get();
    }

    /**
     * 케임브리지에 거주하는 거래자의 모든 트랜잭션 값 출력
     */
    private static void test6() {
        transactions.stream()
                .filter(transaction -> transaction.trader.city.equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);
    }

    /**
     * @return 밀라노에 거래자가 있나?
     */
    private static boolean test5() {
        return transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(trader -> trader.getCity().equals("Milan"));
    }

    /**
     * @return 모든 거래자의 이름 (알파벳순 정렬)
     */
    private static String test4() {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(joining(" "));
    }

    /**
     * @return 케임브리지에서 근무하는 모든 거래자 목록 (이름순 정렬)
     */
    private static List<Trader> test3() {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted((comparing(Trader::getName)))
                .collect(toList());
    }

    /**
     * @return 거래자가 근무하는 모든 도시 목록 (중복x)
     */
    private static List<String> test2() {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());
    }

    /**
     * @return 2011년에 일어난 모든 트랜잭션 목록 (값을 기준으로 오름차순 정렬)
     */
    private static List<Transaction> test1() {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());
    }

    private static class Trader {
        private final String name;
        private final String city;

        public Trader(String name, String city) {
            this.name = name;
            this.city = city;
        }

        public String getName() {
            return name;
        }

        public String getCity() {
            return city;
        }

        @Override
        public String toString() {
            return "Trader:" + this.name + " in " + this.city;
        }
    }

    private static class Transaction {
        private final Trader trader;
        private final int year;
        private final int value;

        public Transaction(Trader trader, int year, int value) {
            this.trader = trader;
            this.year = year;
            this.value = value;
        }

        public Trader getTrader() {
            return trader;
        }

        public int getYear() {
            return year;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "{trader=" + trader.name + ", year=" + year + ", value=" + value + "}";
        }
    }
}
