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
            member1.setAddress(address);
            em.persist(member1);

            Address copyAddress = new Address(address.getStreet(), address.getZipcode(), "newCity");

            Member member2 = new Member();
            member1.setUsername("member2");
            member2.setAddress(copyAddress);
            em.persist(member2);

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
