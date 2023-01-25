package tobyspring.helloboot;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class HellobootApplication {

	public static void main(String[] args) {
		GenericWebApplicationContext applicationContext = new GenericWebApplicationContext(); // 스프링 컨테이너
		applicationContext.registerBean(HelloController.class); // 빈 등록
		applicationContext.registerBean(SimpleHelloService.class);
		applicationContext.refresh();

		ServletWebServerFactory serverFactory = new TomcatServletWebServerFactory();
		WebServer webServer = serverFactory.getWebServer(servletContext -> {
			servletContext.addServlet("dispatcherServlet", new DispatcherServlet(applicationContext))
				.addMapping("/*");
		});
		webServer.start();
	}

}
