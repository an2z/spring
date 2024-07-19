package src.fire.ch14;


class InheritanceExam2 {
    public static void main(String[] args) {
        BusinessMan man = new BusinessMan("jolly", "자취", "Intern");
        man.tellYourInfo();
    }

    static class Man {
        String name;

        // 생성자 (상위클래스)
        public Man(String name) {
            this.name = name;
        }

        public void tellYourName() {
            System.out.println("My name is " + name);
        }
    }

    /* 상위 클래스의 생성자 호출
     * super 키워드를 사용해서 명시적으로 상위클래스를 호출.
     * 상속 관계에 있어도 인스턴스 변수는 각 클래스의 생성자를 통해 초기화하는 것이 좋다.
     */
    static class BusinessMan extends Man {
        String company;
        String position;

        // 생성자 (하위클래스)
        public BusinessMan(String name, String company, String position) {
            super(name); // 상위 클래스의 생성자 호출
            this.company = company;
            this.position = position;
        }

        public void tellYourInfo() {
            System.out.println("My company is " + company);
            System.out.println("My position is " + position);
            tellYourName();
        }
    }
}
