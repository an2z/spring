package ch04;

class OperatorsExam {
	public static void main(String[] args) {
		/* 대입연산자, 산술연산자 */
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));  // 덧셈
		System.out.println("num1 - num2 = " + (num1 - num2));  // 뺄셈
		System.out.println("num1 * num2 = " + (num1 * num2));  // 곱셈
		System.out.println("num1 / num2 = " + (num1 / num2));  // 나눗셈 (몫)
		System.out.println("num1 % num2 = " + (num1 % num2));  // 나눗셈 (나머지)
		
		// 참고
		System.out.println("num1 + num2 = " + num1 + num2);  // 소괄호를 빼면 문자의 덧셈이 진행
		System.out.println("num1 / num2 = " + (7.0 / 3.0));  // 실수형 나눗셈 -> double형 나눗셈이 진행
		
		
		/* 복합 대입연산자 */
		short num = 10;
		num = (short)(num + 77L);  // 형 변환 안하면 오류 발생
		int rate = 3;
		rate = (int)(rate * 3.5);  // 형 변환 안하면 오류 발생
		
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77L;   // 형 변환 필요없음
		rate = 3;
		rate *= 3.5;  // 형 변환 필요없음
		
		System.out.println(num);
		System.out.println(rate);
		
		
		/* 관계 연산자 */
		System.out.println("3 >= 2 : " + (3 >= 2));
		System.out.println("3 <= 2 : " + (3 <= 2));
		System.out.println("7.0 == 7 : " + (7.0 == 7));
		System.out.println("7.0 != 7 : " + (7.0 != 7));
		
		
		/* 논리 연산자 */
		int num3 = 11;
		int num4 = 22;
		boolean result;
		
		result = (1 < num3) && (num3 <100);                   // 논리 AND
		System.out.println("1 초과 100 미만인가? " + result);
		
		result = ((num4 % 2) == 0) || ((num4 % 3) == 0);      // 논리 OR
		System.out.println("2 또는 3의 배수인가? " + result);
		
		result = !(num3 != 0);                                // 논리 NOT
		System.out.println("0 인가? " + result);
		
		
		/* 논리 연산자 SCE 부작용 */
		int num5 = 0;
		int num6 = 0;
		boolean result2;
		
		result2 = ((num5 += 10) < 0) && ((num6 += 10) > 0);
		System.out.println("result2 = " + result2);
		System.out.println("num5 = " + num5);
		System.out.println("num6 = " + num6);  // num6 += 10 생략됨
		
		result2 = ((num5 += 10) > 0) || ((num6 += 10) > 0);
		System.out.println("resutl2 = " + result2);
		System.out.println("num5 = " + num5);
		System.out.println("num6 = " + num6);  // num6 += 10 생략됨
		
		// 코드 수정
		num5 += 10;
		num6 += 10;
		
		result2 = (num5 < 0) && (num6 > 0);
		System.out.println("result2 = " + result2);
		System.out.println("num5 = " + num5);
		System.out.println("num6 = " + num6);
		
		result2 = (num5 > 0) || (num6 > 0);
		System.out.println("result2 = " + result2);
		System.out.println("num5 = " + num5);
		System.out.println("num6 = " + num6);
		
		
		/* 부호 연산자 */
		short num7 = 5;
		System.out.println(+num7);    // 양의 부호
		System.out.println(-num7);    // 음의 부호
		
		short num8 = (short)(-num7);  // 형 변환 안하면 오휴 발생
		System.out.println(num8);
		
		
		/* 증가,감소 연산자 */
		// prefix
		int num9 = 7;		
		System.out.println(++num9);  // 값이 증가되고 출력
		System.out.println(--num9);  // 값이 감소되고 출력
		
		// postfix
		int num10 = 5;
		System.out.print(num10++);   // 출력 후에 값이 증가
		System.out.print(num10++);
		System.out.print(num10 + "\n");
		
		System.out.print(num10--);   // 출력 후에 값이 감소
		System.out.print(num10--);
		System.out.print(num10 + "\n");
	}

}
