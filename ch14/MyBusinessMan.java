package ch14;

class Man {	
	// 인스턴스 변수
	String name;
	
	// 인스턴스 메소드
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
	
}


/* 상속
 * 상속의 대상이 되는(상위클래스, 부모클래스) -> Man
 * 상속을 하는 클래스(하위클래스, 자식클래스) -> BusinessMan
 * 하위 클래스의 생성자에서 상위 클래스의 멤버의 초기화도 이뤄져야 한다.
 */
class BusinessMan extends Man {
	// 인스턴스 변수
	String company;   // 회사
	String position;  // 직급
	
	// 생성자
	public BusinessMan(String name, String company, String position) {
		// 상위 클래스 Man의 멤버 초기화
		this.name = name;
		
		// 클래스 BusinessMan의 멤버 초기화
		this.company = company;
		this.position = position;
	}
	
	// 인스턴스 메소드
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();  // 상속관계이므로 상위 클래스 멤버에 이름만으로 접근 가능
	}
	
}


class MyBusinessMan {	
	public static void main(String[] args) {
		BusinessMan man = new BusinessMan("jolly", "자취 컴퍼니", "Intern"); // 하위클래스 인스턴스 생성
		man.tellYourInfo();
	}

}
