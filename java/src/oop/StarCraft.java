package src.oop;

public class StarCraft {
    public static void main(String[] args) {
        // 객체 생성
        Marine marine = new Marine("마린", 80);
        Medic medic = new Medic("메딕", 60, 60);

        // 마린의 스팀팩!
        marine.stimpack();

        // 메딕의 힐!
        medic.heal(marine);
    }

    static class Marine {
        String name;
        int hp;

        public Marine(String name, int hp) {
            this.name = name;
            this.hp = hp;
        }

        public void stimpack() {
            System.out.printf("[%s]의 스팀팩! HP: %d -> ", name, hp);
            hp -= 10;
            System.out.printf("%d\n", hp);
        }
    }

    static class Medic {
        String name;
        int hp;
        int mp;

        public Medic(String name, int hp, int mp) {
            this.name = name;
            this.hp = hp;
            this.mp = mp;
        }

        public void heal(Marine target) {
            System.out.printf("[%s]의 치유! => [%s] HP(%d -> ", name, target.name, target.hp);
            mp -= 10;
            target.hp += 10;
            System.out.printf("%d)\n", target.hp);
        }
    }
}
