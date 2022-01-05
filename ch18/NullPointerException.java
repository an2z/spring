package ch18;

/* 예외 클래스 (NullPointerException)
 * null이 저장된 참조변수를 대상으로 메소드를 호출할 때 발생하는 오류상황을 의미
 */

class NullPointerException {
	public static void main(String[] args) {
		String str = null;
		System.out.println(str);  // null 출력
		int len = str.length();   // 예외 발생
	}
}
