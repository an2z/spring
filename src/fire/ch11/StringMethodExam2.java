package src.fire.ch11;

/* String Ŭ������ �޼ҵ� */
class StringMethodExam2 {
	public static void main(String[] args) {
		String st1 = "Lexicographically";
		String st2 = "lexicographically";
		int cmp;
		
		/* equals (���ڿ� �����) */
		if (st1.equals(st2))
			System.out.println("�� ���ڿ��� �����ϴ�.");
		else
			System.out.println("�� ���ڿ��� �ٸ��ϴ�");
		
		/* compareTo */
		cmp = st2.compareTo(st1); // ������ ���� ��
		if (cmp == 0)
			System.out.println("�� ���ڿ��� �����ϴ�.");
		else if (cmp < 0)
			System.out.println("������ �տ� ��ġ�ϴ� ���ڿ�: " + st1);
		else
			System.out.println("������ �ڿ� ��ġ�ϴ� ���ڿ�: " + st2);
		
		/* compareToIgnoreCase */
		if (st1.compareToIgnoreCase(st2) == 0)  // ��ҹ��� ���� ���� ������ ���� ��
			System.out.println("�� ���ڿ��� �����ϴ�.");
		else
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
	}

}
