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
            Member member1 = new Member();
            member1.setUsername("member1");
            member1.setAge(10);

            Member member2 = new Member();
            member2.setUsername("member2");
            member2.setAge(20);

            Member member3 = new Member();
            member3.setUsername("member3");
            member3.setAge(30);

            em.persist(member1);
            em.persist(member2);
            em.persist(member3);

            Team teamA = new Team();
            teamA.setName("A");
            teamA.addMember(member1);

            Team teamB = new Team();
            teamB.setName("B");
            teamB.addMember(member2);

            em.persist(teamA);
            em.persist(teamB);

            em.flush();
            em.clear();

            /* 서브 쿼리 지원 함수 */
            // 팀A 소속인 회원 조회 -> EXISTS
            String query1 = "select m from Member m where exists (select t from m.team t where t.name = 'A')";
            List<Member> result1 = em.createQuery(query1, Member.class).getResultList();

            // 어떤 팀이든 팀에 소속된 회원 조회 -> ANY
            String query2 = "select m from Member m where m.team = any (select t from Team t)";
            List<Member> result2 = em.createQuery(query2, Member.class).getResultList();

            System.out.println("result1 = " + result1);
            System.out.println("result2 = " + result2);

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
