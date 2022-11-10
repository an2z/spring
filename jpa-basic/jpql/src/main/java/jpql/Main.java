package jpql;

import static jpql.MemberType.ADMIN;

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
            Member member = new Member();
            member.setUsername("jolly");
            member.setAge(10);
            member.setType(ADMIN);

            em.persist(member);

            Team teamA = new Team();
            teamA.setName("팀A");
            teamA.addMember(member);

            em.persist(teamA);

            em.flush();
            em.clear();

            String query = "select size(t.members) from Team t";
            List<Integer> result = em.createQuery(query, Integer.class).getResultList();

            for (Integer s : result) {
                System.out.println("s = " + s); // 1
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
