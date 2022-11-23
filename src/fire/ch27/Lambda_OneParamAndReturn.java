package src.fire.ch27;

/* ���� ǥ���� (�Ű����� o, ��ȯ o) */

interface HowLong {
	int len(String s); // ���� ��ȯ�ϴ� �޼ҵ�
}

class Lambda_OneParamAndReturn {
	public static void main(String[] args) {
    	HowLong h1 = s -> s.length();  // return�� ����
        System.out.println(h1.len("Happy"));
    }
}
