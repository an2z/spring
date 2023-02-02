package tobyspring.helloboot;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT) // 톰캣 서버를 정해진 포트로 띄워서 테스트 실행
class HelloApiTest {
	@Test
	void helloApi() {
		// http localhost:8080/hello?name=Spring
		TestRestTemplate rest = new TestRestTemplate();

		ResponseEntity<String> response =
			rest.getForEntity("http://localhost:9090/app/hello?name={name}", String.class, "Spring");

		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getHeaders().getFirst(HttpHeaders.CONTENT_TYPE)).startsWith(MediaType.TEXT_PLAIN_VALUE);
		assertThat(response.getBody()).isEqualTo("*Hello Spring*");
	}

	@Test
	void failsHelloApi() {
		TestRestTemplate rest = new TestRestTemplate();

		ResponseEntity<String> response =
			rest.getForEntity("http://localhost:9090/app/hello?name=", String.class);

		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
