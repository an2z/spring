package hellojpa;

public class ValueMain {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        System.out.println("a == b : " + (a == b)); // ture

        Address address1 = new Address("street", "zipcode", "city");
        Address address2 = new Address("street", "zipcode", "city");

        System.out.println("address1 == address2 : " + (address1 == address2)); // false, 서로 다른 인스턴스로 참조 값을 비교
        System.out.println("address1 equals address2 : " + (address1.equals(address2))); // true, equals() 재정의를 통해 인스턴스의 값을 비교
    }
}
