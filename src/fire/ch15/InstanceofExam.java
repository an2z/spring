package src.fire.ch15;

class Cake3 {
}
class CheeseCake3 extends Cake3 {
}
class StrawberryCheeseCake3 extends CheeseCake3 {	
}


class InstanceofExam {
	public static void main(String[] args) {
		Cake3 cake = new StrawberryCheeseCake3();
		
		/* instanseof ������
		 * ���������� �����ϴ� �ν��Ͻ��� Ŭ������ �����ϴ� �ν��Ͻ��� ����ϴ� Ŭ������ ���� ������
		 * true or false�� ��ȯ 
		 */
		if (cake instanceof Cake3) {
			System.out.println("���� �ν��Ͻ� or");
			System.out.println("���� ����ϴ� �ν��Ͻ� \n");
		}
		
		if (cake instanceof CheeseCake3) {
			System.out.println("ġ������ �ν��Ͻ� or");
			System.out.println("ġ������ ����ϴ� �ν��Ͻ� \n");
		}
		
		if (cake instanceof StrawberryCheeseCake3) {
			System.out.println("����ġ������ �ν��Ͻ� or");
			System.out.println("����ġ������ ����ϴ� �ν��Ͻ�");
		}

	}
}
