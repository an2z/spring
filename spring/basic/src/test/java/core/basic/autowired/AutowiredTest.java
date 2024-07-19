package core.basic.autowired;

import core.basic.member.Member;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

class AutowiredTest {
    @Test
    void AutowiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean {
        // Member는 스프링 빈이 아니기 때문에 의존관계 주입 대상이 없는 상태
        @Autowired(required = false)
        public void setNoBean1(Member noBean1) {
            System.out.println("noBean1 = " + noBean1); // 메소드 자체가 호출되지 않음
        }

        @Autowired
        public void setNoBean2(@Nullable Member noBean2) {
            System.out.println("noBean2 = " + noBean2); // null 반환
        }

        @Autowired
        public void setNoBean3(Optional<Member> noBean3) {
            System.out.println("noBea3 = " + noBean3); // Optional.empty 반환
        }
    }
}
