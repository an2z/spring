package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Set;

public class JPAMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin(); // 트랜잭션 시작

        try {
            Member member = new Member();
            member.setUsername("member");
            member.setAddress(new Address("street", "zipcode", "city"));

            member.getFavoriteFoods().add("치킨");
            member.getFavoriteFoods().add("피자");

            member.getAddressHistory().add(new Address("street1", "zipcode1", "city1"));
            member.getAddressHistory().add(new Address("street2", "zipcode2", "city2"));

            // 값 타입 컬렉션을 따로 persist 하지 않아도 Member 생명주기를 따라감
            em.persist(member);

            em.flush();
            em.clear();

            System.out.println("============== START ==============");
            Member findMember = em.find(Member.class, member.getId());

            // 값 타입 컬렉션도 지연 로딩 전략을 사용
            Set<String> favoriteFoods = findMember.getFavoriteFoods();
            for (String favoriteFood : favoriteFoods) {
                System.out.println("favoriteFood = " + favoriteFood);
            }

            List<Address> addressHistory = findMember.getAddressHistory();
            for (Address address : addressHistory) {
                System.out.println("address = " + address.getCity());
            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            System.out.println("e = " + e);
        } finally {
            em.close();
        }

        emf.close();
    }
}
