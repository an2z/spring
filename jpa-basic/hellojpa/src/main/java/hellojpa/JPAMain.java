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
            member.setUsername("member");
            em.persist(member);

            em.flush();
            em.clear();
            
            // 조회
            Member proxyMember = em.getReference(Member.class, member.getId());
            System.out.println("proxyMember.class() = " + proxyMember.getClass());

            em.detach(proxyMember); // 준영속 상태로 만듬

            proxyMember.getUsername(); // 프록시 객체 초기화 실패, LazyInitializationException 에러 발생

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
