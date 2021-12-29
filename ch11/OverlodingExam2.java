package ch11;

/* 생성자 오버로딩 */
class OverlodingExam2 {
	public static void main(String[] args) {
		// 여권번호가 있는 사람의 정보를 담은 인스턴스 생성
		Person lim = new Person(990522, 112233);

		// 여권번호가 없는 사람의 정보를 담은 인스턴스 생성
		Person kim = new Person(201228);

		System.out.println("lim의 정보");
		lim.showPersonInfo();
		System.out.println("kim의 정보");
		kim.showPersonInfo();
	}

}

class Person {
	private int regiNum; // 주민등록 번호
	private int passNum; // 여권 번호

	/* 생성자1 */
	Person(int rnum, int pnum) {
		regiNum = rnum;
		passNum = pnum;
	}

	/* 생성자2 */
	Person(int rnum) {
		regiNum = rnum;
		passNum = 0;
	}

	/* this를 이용해 오버로딩 된 다른 생성자 호출 */
//	Person(int rnum) {
//		this(rnum, 0);  // rnum과 0을 인자로 받는 생성자1 호출
//	}

	void showPersonInfo() {
		System.out.println("주민등록 번호: " + regiNum);
		System.out.println("여권 번호: " + passNum);
	}

}