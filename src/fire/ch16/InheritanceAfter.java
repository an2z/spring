package src.fire.ch16;

/* 인맥관리 프로그램 (상속 후) */
class InheritanceAfter {
    public static void main(String[] args) {
        Friend[] f = new Friend[5];
        int cnt = 0;

        f[cnt++] = new UnivFriend("Lee", "010-222-333", "java");
        f[cnt++] = new UnivFriend("Kim", "010-444-555", "python");
        f[cnt++] = new CompFriend("Lim", "010-555-666", "R&D 1");
        f[cnt++] = new CompFriend("Park", "010-777-888", "R&D 2");

        // 모든 동창 동료 정보 전체 출력
        for (int i = 0; i < cnt; i++) {
            f[i].showInfo(); // 오버라이딩 한 메소드가 호출됨
            System.out.println();
        }
    }

    static class Friend {
        protected String name;
        protected String phone;

        public Friend(String na, String ph) {
            name = na;
            phone = ph;
        }

        public void showInfo() {
            System.out.println("이름: " + name);
            System.out.println("전화번호: " + phone);
        }
    }

    static class UnivFriend extends Friend {
        private String major;

        public UnivFriend(String na, String ph, String ma) {
            super(na, ph); // 상위클래스 생성자 호출
            major = ma;
        }

        public void showInfo() { // 메소드 오버라이딩
            super.showInfo();
            System.out.println("전공: " + major);
        }
    }

    static class CompFriend extends Friend {
        private String department;

        public CompFriend(String na, String ph, String de) {
            super(na, ph); // 상위클래스 생성자 호출
            department = de;
        }

        public void showInfo() { // 메소드 오버라이딩
            super.showInfo();
            System.out.println("부서: " + department);
        }
    }
}
