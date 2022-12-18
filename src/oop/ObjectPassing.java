package src.oop;

public class ObjectPassing {
    public static void main(String[] args) {
        // 객체 생성
        Hero thor = new Hero("토르", 150);     // thor -> {"토르", 150}
        Hero thanos = new Hero("타노스", 160); // thanos -> {"타노스", 160}

        // 토르의 펀치 -> 타노스
        thor.punch(thanos);

        // 타노스의 펀치 -> 토르
        thanos.punch(thor); // thor -> {"토르", 140}
        thanos.punch(thor); // thor -> {"토르", 130}
    }

    static class Hero {
        // 필드
        String name;
        int hp;

        // 생성자
        Hero(String name, int hp) {
            this.name = name;
            this.hp = hp;
        }

        // 메소드
        void punch(Hero enemy) {
            System.out.printf("[%s]의 펀치!! ", name);
            System.out.printf("%s의 HP: %d -> ", enemy.name, enemy.hp);
            enemy.hp -= 10;
            System.out.printf("%d\n", enemy.hp);
        }
    }
}
