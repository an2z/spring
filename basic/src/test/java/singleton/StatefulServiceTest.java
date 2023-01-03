package singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class StatefulServiceTest {
    @Test
    @DisplayName("스프링 빈의 상태 유지 시 문제점")
    void statefulServiceSingleton() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        statefulService1.order("userA", 1000); // ThreadA: A 사용자 1000원 주문
        statefulService2.order("userB", 2000); // ThreadB: B 사용자 2000원 주문

        int priceA = statefulService1.getPrice(); // ThreadA: A 사용자 주문 금액 조회
        System.out.println("priceA = " + priceA); // A 사용자의 주문 금액은 1000원이지만, 2000원 출력

        assertThat(priceA).isEqualTo(2000);
    }

    @Configuration
    static class TestConfig {
        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }
}
