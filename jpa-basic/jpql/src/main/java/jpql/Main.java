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
             * 엔티티 프로젝션
             */
            em.createQuery("select m from Member m", Member.class).getResultList();

            // join이 일어나는 경우 jpql에서도 join 키워드를 명시하는 방법을 권장한다.
            em.createQuery("select m.team from Member m", Team.class).getResultList(); // 권장 x
            em.createQuery("select t from Member m join m.team", Team.class).getResultList(); // 권장 o

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
