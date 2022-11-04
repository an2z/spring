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
            member.setUsername("member1");
            member.setAge(10);

            em.persist(member);

            Team team = new Team();
            team.setName("teamA");
            team.addMember(member);

            em.persist(team);

            em.flush();
            em.clear();

            String query = "select m from Member m inner join m.team t";
            List<Member> result = em.createQuery(query, Member.class)
                    .setFirstResult(0)
                    .setMaxResults(5)
                    .getResultList();

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
