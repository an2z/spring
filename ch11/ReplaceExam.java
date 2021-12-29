package ch11;

public class ReplaceExam {

	public static void main(String[] args) {
		String resi = "990925-1012999";
		
		/* replace 메소드 */
		System.out.println(resi.replace('-', ' '));
//		System.out.println(resi.replace('-', ''));  // 문자는 하나이상 존재해야하기 때문에 에러발생
		
		/* replaceALL 메소드 */
		System.out.println(resi.replaceAll("-", " "));
		System.out.println(resi.replaceAll("-", ""));
	}

}
