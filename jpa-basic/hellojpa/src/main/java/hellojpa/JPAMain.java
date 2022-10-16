package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin(); // 트랜잭션 시작

        try {
            // 저장
            Movie movie = new Movie();
            movie.setDirector("A");
            movie.setActor("B");
            movie.setName("영화");
            movie.setPrice(10000);

            em.persist(movie);

            em.flush();
            em.clear();

            // 조회
            // 구현 클래스마다 테이블 전략시 부모 클래스로 조회 할 경우 매우 복잡한 쿼리가 나감
            em.find(Item.class, movie.getId());

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
