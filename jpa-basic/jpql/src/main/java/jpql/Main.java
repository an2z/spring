package jpql;

import javax.persistence.*;
import java.util.List;

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
             * 결과 조회 api
             * getResultList() : 결과가 하나 이상일 때
             * getSingleResult() : 결과가 정확히 하나일 때
             */
            TypedQuery<Member> query = em.createQuery("select m from Member m", Member.class);
            Member result = query.getSingleResult();
            List<Member> results = query.getResultList();

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
