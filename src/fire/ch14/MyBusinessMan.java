package src.fire.ch14;

class Man {	
	// �ν��Ͻ� ����
	String name;
	
	// �ν��Ͻ� �޼ҵ�
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
	
}


/* ���
 * ����� ����� �Ǵ�(����Ŭ����, �θ�Ŭ����) -> Man
 * ����� �ϴ� Ŭ����(����Ŭ����, �ڽ�Ŭ����) -> BusinessMan
 * ���� Ŭ������ �����ڿ��� ���� Ŭ������ ����� �ʱ�ȭ�� �̷����� �Ѵ�.
 */
class BusinessMan extends Man {
	// �ν��Ͻ� ����
	String company;   // ȸ��
	String position;  // ����
	
	// ������
	public BusinessMan(String name, String company, String position) {
		// ���� Ŭ���� Man�� ��� �ʱ�ȭ
		this.name = name;
		
		// Ŭ���� BusinessMan�� ��� �ʱ�ȭ
		this.company = company;
		this.position = position;
	}
	
	// �ν��Ͻ� �޼ҵ�
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();  // ��Ӱ����̹Ƿ� ���� Ŭ���� ����� �̸������� ���� ����
	}
	
}


class MyBusinessMan {	
	public static void main(String[] args) {
		BusinessMan man = new BusinessMan("jolly", "���� ���۴�", "Intern"); // ����Ŭ���� �ν��Ͻ� ����
		man.tellYourInfo();
	}

}
