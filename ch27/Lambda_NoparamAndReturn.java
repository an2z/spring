package ch27;

import java.util.Random;

/* 람다 표현식 (매개변수 x, 반환 o) 
 * 매개변수가 없다면 매개변수 정보를 담는 소괄호 안을 비워준다.
 */

interface Generator {
	int rand(); // 매개변수가 없는 추상메소드
}

class Lambda_NoparamAndReturn {
	public static void main(String[] args) {
    	Generator gen = () -> { // 빈 소괄호 명시
        	Random rand = new Random();
            return rand.nextInt(50);
        };
    System.out.println(gen.rand());
    }
}