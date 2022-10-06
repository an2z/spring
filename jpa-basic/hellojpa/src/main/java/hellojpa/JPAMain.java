package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JPAMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin(); // 트랜잭션 시작

        try {
            // 저장
            Team team = new Team();
            team.setName("teamA");
            em.persist(team);

            Member member = new Member();
            member.setUsername("member1");
            member.setTeam(team); // 연관관계 주인에 값 설정
            em.persist(member);

            team.getMember().add(member); // 연관관계 주인이 아닌 곳에도 값 설정

            em.flush();
            em.clear();
            
            // 조회
            Member findMember = em.find(Member.class, member.getId());

            Team findTeam = findMember.getTeam();
            System.out.println("team = " + findTeam.getName());

            List<Member> members = findTeam.getMember(); // 역방향 조회
            for (Member m : members) {
                System.out.println("member = " + m.getUsername());
            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
