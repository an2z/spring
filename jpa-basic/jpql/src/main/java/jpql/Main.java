package jpql;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member member = new Member();
            member.setUsername("member");
            member.setAge(10);
            em.persist(member);

            /**
             * 스칼라 타입 프로젝션
             */
            em.createQuery("select m.username, m.age from Member m").getResultList();

            // distinct 키워드를 사용해 중복을 제거할 수 있다.
            em.createQuery("select distinct m.username, m.age from Member m").getResultList();

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }

        emf.close();
    }
}
