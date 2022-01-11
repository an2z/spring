package ch20;

class AutoBoxingUnboxing2 {
	public static void main(String[] args) {
		Integer num = 10;	// 오토 박싱 진행
		
		/* 오토 박싱, 오토 언박싱 동시 진행 */
		num++;	// new Integer(num.intValue()+1);
		System.out.println(num);
		
		/* 오토 박싱, 오토 언박싱 동시 진행 */
		num += 3;	// new Integer(num.intValue()+3);
		System.out.println(num);
		
		int r = num + 5;		// 오토 언박싱 진행
		Integer rObj = num - 5; // 오토 박싱, 언박싱 진행
		System.out.println(r);
		System.out.println(rObj);
	}
}
