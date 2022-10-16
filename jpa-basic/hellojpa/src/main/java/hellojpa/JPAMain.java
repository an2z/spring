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
            // 단일 테이블 전략시 조인 없이 심플한 쿼리가 나감
            em.find(Movie.class, movie.getId());

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
