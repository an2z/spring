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
            // 저장
            Member member = new Member();
            member.setUsername("hello");

            em.persist(member);

            em.flush();
            em.clear();
            
            // 조회
//            Member findMember = em.find(Member.class, member.getId()); // 실제 엔티티 객체 조회
            Member findMember = em.getReference(Member.class, member.getId()); // 프록시 엔티티 객체 조회

            System.out.println("findMember.class() = " + findMember.getClass());
            System.out.println("findMember.id() = " + findMember.getId());
            System.out.println("findMember.username() = " + findMember.getUsername());

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
