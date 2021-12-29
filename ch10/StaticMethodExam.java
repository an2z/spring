package ch10;

/* 클래스 메소드 */
class StaticMethodExam00 {
	private int num = 0;
	
	static void showInt(int n) { System.out.println(n); }        // 클래스 메소드 (static 메소드)
	static void showDouble(double n) { System.out.println(n); }  // 클래스 메소드
	
	void setNum(int n) { num = n; }   // 인스턴스 메소드
	void showNum() {  // 인스턴스 메소드
		showInt(num);   // 클래스 내부에서 클래스 메소드 호출
	}  
}


public class StaticMethodExam {
	public static void main(String[] args) {
		StaticMethodExam00.showInt(20);  // 클래스 외부에서 인스턴스 이름을 통한 클래스 메소드 호출
		
		StaticMethodExam00 np = new StaticMethodExam00();  // 인스턴스 생성
		np.showDouble(3.15);  // 클래스 외부에서 인스턴스 이름을 통한 클래스 메소드 호출
		np.setNum(75);
		np.showNum();	
	}
}
