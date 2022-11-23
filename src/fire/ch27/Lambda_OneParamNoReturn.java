package src.fire.ch27;

/* ���� ǥ���� (�Ű����� o, ��ȯ x) */

interface Printable {
	void print(String s); // �Ű����� �ϳ�, ��ȯ�� void
}

class Lambda_OneParamNoReturn {
	public static void main(String[] args) {
        Printable p;
        
        // ���� ���� ǥ��
        p = (String s) -> { System.out.println(s); }; 
        p.print("Lambda exp one.");
		
        // �߰�ȣ ���� (������ �ϳ��� ���)
        p = (String s) -> System.out.println(s);
        p.print("Lambda exp two.");
        
        // �Ű����� Ÿ�� ����
        p = (s) -> System.out.println(s);
        p.print("Lambda exp three.");
        
        // �Ű����� �Ұ�ȣ ���� (�Ű������� �ϳ��� ���)
        p = s -> System.out.println(s);
        p.print("Lambda exp four.");
    }
}
