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

            em.flush();
            em.clear();

            String query1 = "select function('group_concat', m.username) from Member m";
            String query2 = "select gruop_concat(m.username) from Member m";
            List<String> result = em.createQuery(query2, String.class).getResultList(); // query1, query2 결과 동일

            for (String s : result) {
                System.out.println("s = " + s); // jolly,molly
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
