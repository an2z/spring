package mvc.springmvc.basic.request;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class RequestParamController {
	/**
	 * HttpServletRequest 사용
	 * 반환 타입이 없으면서 응답에 값을 직접 집어넣으면, view 조회 X
	 */
	@RequestMapping("/request-param-v1")
	public void requestParamV1(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username = request.getParameter("username");
		int age = Integer.parseInt(request.getParameter("age"));
		log.info("username = {}, age = {}", username, age);

		response.getWriter().write("ok");
	}

	/**
	 * @RequestParam 사용
	 * 파라미터 이름으로 바인딩
	 * @ResponseBody 추가
	 * View 조회를 무시하고, HTTP message body에 직접 내용 입력 -> @RestController 동일한 기능
	 */
	@ResponseBody
	@RequestMapping("/request-param-v2")
	public String requestParamV2(@RequestParam("username") String memberName,
								 @RequestParam("age") int memberAge) {
		log.info("username = {}, age = {}", memberName, memberAge);
		return "ok";
	}

	/**
	 * HTTP 파라미터 이름이 변수 이름과 같으면 @RequestParam(name="xx") 생략 가능
	 */
	@ResponseBody
	@RequestMapping("/request-param-v3")
	public String requestParamV3(@RequestParam String username,
								 @RequestParam int age) {
		log.info("username = {}, age = {}", username, age);
		return "ok";
	}

	/**
	 * String, int 등의 단순 타입이면 @RequestParam 생략 가능
	 */
	@ResponseBody
	@RequestMapping("/request-param-v4")
	public String requestParamV4(String username, int age) {
		log.info("username = {}, age = {}", username, age);
		return "ok";
	}

	/**
	 * @RequestParam(required = true) : 필수 파라미터, 없으면 400 에러
	 * @RequestParam(required = false) : 없으면 null
	 * int 타입은 null 불가하기 때문에 Integer 래퍼클래스를 사용
	 */
	@ResponseBody
	@RequestMapping("/request-param-required")
	public String requestParamRequired(@RequestParam(required = true) String username,
									   @RequestParam(required = false) Integer age) {
		log.info("username = {}, age = {}", username, age);
		return "ok";
	}

	/**
	 * @RequestParam(defaultValue = "")
	 * 값이 없을 때 기본값 지정
	 */
	@ResponseBody
	@RequestMapping("/request-param-default")
	public String requestParamDefault(@RequestParam(required = true, defaultValue = "guest") String username,
									  @RequestParam(required = false, defaultValue = "-1") int age) {
		log.info("username = {}, age = {}", username, age);
		return "ok";
	}

	/**
	 * @RequestParam Map : 파라미터의 값이 1개
	 * @RequestParam MultiValueMap : 파라미터의 값이 N개
	 */
	@ResponseBody
	@RequestMapping("/request-param-map")
	public String requestParamMap(@RequestParam Map<String, Object> paramMap) {
		log.info("username = {}, age = {}", paramMap.get("username"), paramMap.get("age"));
		return "ok";
	}
}
