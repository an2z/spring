package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin(); // 트랜잭션 시작

        try {
            Address address = new Address("street", "zipcode", "city");

            Member member1 = new Member();
            member1.setUsername("member1");
            member1.setAddress(address); // 같은 값 타입 공유
            em.persist(member1);

            Member member2 = new Member();
            member1.setUsername("member2");
            member2.setAddress(address); // 같은 값 타입 공유
            em.persist(member2);

            member1.getAddress().setCity("newCity"); // member2의 city까지 변경되는 side effect 발생

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
