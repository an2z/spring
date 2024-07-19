package core.basic.scan.filter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;

class ComponentFilterAppConfigTest {
    @Test
    void filterScan() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(ComponentFilterAppConfig.class);

        // BeanA는 스프링 빈에 등록됨
        BeanA beanA = ac.getBean(BeanA.class);
        assertThat(beanA).isNotNull();

        // BeanB는 스프링 빈에 등록되지 않음
        assertThrows(NoSuchBeanDefinitionException.class,
                () -> ac.getBean(BeanB.class));
    }

    @Configuration
    @ComponentScan(
            includeFilters = @Filter(classes = MyIncludeComponent.class), // 컴포넌트 스캔 대상 추가
            excludeFilters = @Filter(classes = MyExcludeComponent.class)  // 컨포넌트 스캔 대상 제외
    )
    static class ComponentFilterAppConfig {

    }
}
