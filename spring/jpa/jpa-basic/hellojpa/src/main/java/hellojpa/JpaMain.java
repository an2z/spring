package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin(); // 트랜잭션 시작

        try {
            Member member = new Member();
            member.setUsername("user");
            em.persist(member); // 영속성 컨텍스트에 저장 (아직 db에 저장x)

            // flush -> commit, query
            // 쿼리를 날릴 때 자동으로 flush()를 호출 -> insert문 실행(db에 저장)
            List<Member> result = em.createNativeQuery(
                    "select member_id, city, street, zipcode, user_name from Member", Member.class
            ).getResultList();

            for (Member member1 : result) {
                System.out.println("member1 = " + member1);
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
