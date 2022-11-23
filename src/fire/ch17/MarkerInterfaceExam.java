package src.fire.ch17;

/* ��Ŀ �������̽�
 * Ŭ������ Ư���� ǥ�ø� �صα� ���� �������� ���� �� �������̽��� ��Ŀ �������̽��� ��.
 * �������� ��Ŀ �������̽��� Upper�� �빮�ڷ� ����϶�� ǥ���̸�,
 * Lower�� �ҹ��ڷ� ����϶�� ǥ���̴�.
 */

interface Upper{} // ��Ŀ �������̽�
interface Lower{} // ��Ŀ �������̽�

interface Printable7 {
	String getContents();
}

class Report implements Printable7, Upper {
	String cons;
	
	
	Report(String cons) { // ������
		this.cons = cons;
	}
	
	@Override
	public String getContents() {
		return cons;
	}
}

class Printer7 {
	public void printContents(Printable7 doc) {
		if(doc instanceof Upper) // doc �����ν��Ͻ��� Upper�� �����Ѵٸ�
			System.out.println((doc.getContents().toUpperCase())); // ���ڿ��� ��� ���ڸ� �빮�ڷ� �ٲ�
		else if(doc instanceof Lower) // doc �����ν��Ͻ��� Lower�� �����Ѵٸ�
			System.out.println((doc.getContents().toLowerCase())); // ���ڿ��� ��� ���ڸ� �ҹ��ڷ� �ٲ�
		else
			System.out.println(doc.getContents());
	}
}

class MarkerInterfaceExam {
	public static void main(String[] args) {
		Printer7 p = new Printer7();
		Report doc = new Report("Simple Funny News~");
		p.printContents(doc);
	}
}
