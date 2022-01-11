package ch20;

/* 박싱, 언박싱
 * 박싱 : 기본 자료형 값을 인스턴스로 감싸는 것
 * 언박싱 : 저장된 인스턴스에서 값을 꺼내는 것
 * 박싱은 인스턴스의 생성을 통해, 언박싱은 래퍼 클래스에 정의된 메소드의 호출을 통해 이뤄짐
 */

class BoxingUnboxing {
	public static void main(String[] args) {
		Integer iObj = new Integer(10);	// 박싱
		Double dObj = new Double(3.14);	// 박싱
		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println();
		
		int i = iObj.intValue();		// 언박싱
		double d = dObj.doubleValue();	// 언박싱
		System.out.println(i);
		System.out.println(d);
		System.out.println();
		
		// 래퍼 인스턴스 값의 증가 방법
		iObj = new Integer(iObj.intValue() + 10);
		dObj = new Double(dObj.doubleValue() + 1.2);
		System.out.println(iObj);
		System.out.println(dObj);
	}
}
