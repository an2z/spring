package jpql;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            /**
             * getResultList() 주의점
             * 결과가 없을 경우 -> NoResultException
             * 둘 이상일 경우 -> NonUniqueResultException
             */
            TypedQuery<Member> query = em.createQuery("select m from Member m", Member.class);
            Member result = query.getSingleResult();
            System.out.println("result = " + result); // NoResultException

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
