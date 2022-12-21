package src.oop;

public class WorkTime {
    public static void main(String[] args) {
        // 배열 생성
        int[] hours1 = {2, 4, 3, 4, 5, 8, 8};
        int[] hours2 = {7, 3, 4, 3, 3, 4, 4};
        int[] hours3 = {3, 3, 4, 3, 3, 2, 2};

        // 객체 생성
        Employee e1 = new Employee("직원1", hours1); // 래퍼런스 변수
        Employee e2 = new Employee("직원2", hours2); // 래퍼런스 변수
        Employee e3 = new Employee("직원3", hours3); // 래퍼런스 변수

        // 객체 배열 정보 만들기
        Employee[] employees = {e1, e2, e3};

        // 정보 출력
        for (Employee employee : employees) {
            employee.printTotalHours();
        }
    }

    static class Employee {
        String name; // 이름
        int[] hours; // 요일별 일한 시간

        Employee(String name, int[] hours) {
            this.name = name;
            this.hours = hours;
        }

        void printTotalHours() {
            System.out.printf("%s -> %d시간\n", name, totalHours());
        }

        int totalHours() {
            int total = 0;
            for (int hour : hours) {
                total += hour;
            }
            return total;
        }
    }
}
