package ch27;

/* 람다 표현식 (매개변수 o, 반환 o) */

interface HowLong {
	int len(String s); // 값을 반환하는 메소드
}

class Lambda_OneParamAndReturn {
	public static void main(String[] args) {
    	HowLong h1 = s -> s.length();  // return문 생략
        System.out.println(h1.len("Happy"));
    }
}