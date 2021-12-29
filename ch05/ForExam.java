package ch05;

class ForExam {
	public static void main(String[] args) {
		/* 반복문 (while문) */
		int num = 0;
		
		while (num < 5) {
			System.out.println("while 반복: " + num);
			num++;
		}
		
		
		/* 반복문 (do ~ while문) */
		num = 0;
		
		do {
			System.out.println("do while 반복: " + num);
			num++;
		} while (num < 5);
		
		
		/* 반복문 (for문) */
		for (int i = 0; i < 5; i++)
			System.out.println("for 반복: " + i);
		
		
		/* break문 */
		int a = 1;
		boolean search = false;
		
		// 처음 만나는 5의 배수 이자 7의 배수인 수를 찾는 반복문
		while (a < 100) {
			if (((a % 5) == 0) && ((a % 7) == 0)) {
				search = true;
				break;
			}
			a++;
		}
		if (search)
			System.out.println("찾는 정수: " + a);
		
		
		/* continue문 */
		int b = 0;
		int count = 0;
		
		while (b++ < 100) {
			if(((b % 5) != 0) || ((b % 7) != 0))
				continue;  // 5와 7의 배수가 아니라면 나머지 생략하고 위로 이동
			count++;                // 5와 7의 배수인 경우만 실행
			System.out.println(b);  // 5와 7의 배수인 경우만 실행
		}
		System.out.println("count: " + count);

		
		/* for문 중첩 */
		for (int k = 0; k < 3; k++) {
			System.out.println("--------------------");
			for (int j = 0; j < 3; j++) {
				System.out.print("[" + k + ", " + j + "] ");
			}
			System.out.print('\n');
		}
		
		// 구구단
		for (int m = 2; m < 10; m++) {
			for (int c = 1; c < 10; c++)
				System.out.println(m + "x" + c + "=" + (m * c)); 
		}
		
	}
}
