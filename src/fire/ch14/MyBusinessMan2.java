package src.fire.ch14;

class Man2 {
	// �ν��Ͻ� ����
	String name;
	
	// ������ (����Ŭ����)
	public Man2(String name) {
		this.name = name;
	}
	
	// �ν��Ͻ� �޼ҵ�
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}

/* ���� Ŭ������ ������ ȣ��
 * super Ű���带 ����ؼ� ��������� ����Ŭ������ ȣ��.
 * ��� ���迡 �־ �ν��Ͻ� ������ �� Ŭ������ �����ڸ� ���� �ʱ�ȭ�ϴ� ���� ����.
 */
class BusinessMan2 extends Man2 {
	// �ν��Ͻ� ����
	String company;
	String position;
	
	// ������ (����Ŭ����)
	public BusinessMan2(String name, String company, String position) {
		super(name); // ���� Ŭ������ ������ ȣ��
		this.company = company;
		this.position = position;		
	}
	
	// �ν��Ͻ� �޼ҵ�
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}
}


class MyBusinessMan2 {
	public static void main(String[] args) {
		BusinessMan2 man = new BusinessMan2("jolly", "����", "Intern");
		man.tellYourInfo();
	}
}
