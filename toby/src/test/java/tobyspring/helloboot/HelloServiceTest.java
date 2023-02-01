package tobyspring.helloboot;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloServiceTest {
	private static HelloRepository helloRepositoryStub = new HelloRepository() {
		@Override
		public Hello findHello(String name) {
			return null;
		}

		@Override
		public void increaseCount(String name) {

		}
	};
	
	@Test
	void simpleHelloService() {
		SimpleHelloService helloService = new SimpleHelloService(helloRepositoryStub);
		String result = helloService.sayHello("Test");
		assertThat(result).isEqualTo("Hello Test");
	}

	@Test
	void helloDecorator() {
		HelloDecorator decorator = new HelloDecorator(name -> name);
		String result = decorator.sayHello("Test");
		assertThat(result).isEqualTo("*Test*");
	}
}
