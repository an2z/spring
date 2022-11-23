package src.fire.ch11;

/* String Ŭ������ �޼ҵ� */
class StringMethodExam1 {
	public static void main(String[] args) {
		/* concat (���ڿ� ����) */
		String st1 = "coffee";
		String st2 = "Bread";
		
		String st3 = st1.concat(st2);
		System.out.println(st3);
		
		String st4 = "Fresh".concat(st3);
		System.out.println(st4);
		
		
		/* substring (���ڿ� �Ϻ� ����) */
		String st = "abcdefg";
		st.substring(2);  // �ε��� 2��° ������ ���ڿ� ����
		st.substring(2,4);  // �ε��� 2~3��° ������ ���ڿ� ����
		
		System.out.println(st.substring(2));
		System.out.println(st.substring(2,4));		
	}

}
