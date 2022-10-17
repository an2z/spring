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
            Member member1 = new Member();
            member1.setUsername("member1");
            em.persist(member1);

            Member member2 = new Member();
            member2.setUsername("member1");
            em.persist(member2);

            em.flush();
            em.clear();
            
            // 조회
            Member findMember = em.find(Member.class, member1.getId());
            Member proxyMember = em.getReference(Member.class, member2.getId());

            System.out.println("findMember.class() = " + findMember.getClass());
            System.out.println("proxyMember.class() = " + proxyMember.getClass());

            // 타입 체크 시 == 비교 대신 instance of를 사용해야 한다.
            System.out.println("findMember == proxyMember : " + (findMember == proxyMember));
            System.out.println("findMember == proxyMember : " + (findMember instanceof Member || proxyMember instanceof Member));

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
