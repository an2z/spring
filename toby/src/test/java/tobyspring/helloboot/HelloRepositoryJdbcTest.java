package tobyspring.helloboot;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@HelloBootTest
class HelloRepositoryJdbcTest {
	@Autowired
	HelloRepository helloRepository;

	@Test
	void findHelloFailed() {
		assertThat(helloRepository.findHello("Toby")).isNull();
	}

	@Test
	void increaseCount() {
		assertThat(helloRepository.countOf("Toby")).isZero();

		helloRepository.increaseCount("Toby");
		assertThat(helloRepository.countOf("Toby")).isEqualTo(1);

		helloRepository.increaseCount("Toby");
		assertThat(helloRepository.countOf("Toby")).isEqualTo(2);
	}
}
