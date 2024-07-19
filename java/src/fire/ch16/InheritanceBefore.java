package src.fire.ch16;

/* 인맥관리 프로그램 (상속 전) */
class InheritanceBefore {
    public static void main(String[] args) {
        // 대학 동창 관리를 위한 배열과 변수
        UnivFriend[] uf = new UnivFriend[5];
        int uCnt = 0;

        // 직장 동료 관리를 위한 배열과 변수
        CompFriend[] cf = new CompFriend[5];
        int cCnt = 0;

        // 대학 동창 정보 저장
        uf[uCnt++] = new UnivFriend("Lee", "010-222-333", "java");
        uf[uCnt++] = new UnivFriend("Kim", "010-444-555", "python");

        // 직장 동료 정보 저장
        cf[cCnt++] = new CompFriend("Lim", "010-555-666", "R&D 1");
        cf[cCnt++] = new CompFriend("Park", "010-777-888", "R&D 2");

        // 모든 동창 및 동료의 정보 전체 출력
        for (int i = 0; i < uCnt; i++) {
            uf[i].showInfo();
            System.out.println();
        }
        for (int i = 0; i < cCnt; i++) {
            cf[i].showInfo();
            System.out.println();
        }
    }

    static class UnivFriend { // 대학 동창
        private String name;
        private String phone;
        private String major;

        public UnivFriend(String name, String phone, String major) {
            this.name = name;
            this.phone = phone;
            this.major = major;
        }

        public void showInfo() {
            System.out.println("이름: " + name);
            System.out.println("전화번호: " + phone);
            System.out.println("전공: " + major);
        }
    }

    static class CompFriend { // 직장 동료
        private String name;
        private String phone;
        private String department;

        public CompFriend(String name, String phone, String department) {
            this.name = name;
            this.phone = phone;
            this.department = department;
        }

        public void showInfo() {
            System.out.println("이름: " + name);
            System.out.println("전화번호: " + phone);
            System.out.println("부서: " + department);
        }
    }
}
