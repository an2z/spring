package jpql;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member member1 = new Member();
            member1.setUsername("jolly");

            Member member2 = new Member();
            member2.setUsername("molly");

            em.persist(member1);
            em.persist(member2);

            Team teamA = new Team();
            teamA.setName("A");
            teamA.addMember(member1);
            teamA.addMember(member2);

            em.persist(teamA);

            em.flush();
            em.clear();

            /**
             * 컬렉션 값 연관 경로
             * 묵시적 내부 조인이 발생하며, 탐색이 불가능하다.
             * FROM 절에서 명시적 조인을 통해 별칭을 얻으면 별칭을 통해 탐색이 가능하다.
             */
            String query = "select m.username from Team t join t.members m";
            List<String> result = em.createQuery(query, String.class).getResultList();

            for (Object o : result) {
                System.out.println(o);
            }

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
