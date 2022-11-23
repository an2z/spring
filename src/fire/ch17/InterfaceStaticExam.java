package src.fire.ch17;

/* �������̽��� static�޼ҵ� */

interface Printable5 {
	static void printLine(String str) { // static �޼ҵ�
		System.out.println(str);
	}
	
	default void print(String doc) {
		printLine(doc); // �������̽��� static �޼ҵ� ȣ��
	}
}

class Printer5 implements Printable5 { } // �������̽� Printale5���� �����ؾ� �� �޼ҵ尡 ���� ���� ����

class InterfaceStaticExam {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		Printable5 p = new Printer5();
		p.print(myDoc);
				
		Printable5.printLine("end fo line"); // �������̽��� static �޼ҵ� ���� ȣ��
	}
}
