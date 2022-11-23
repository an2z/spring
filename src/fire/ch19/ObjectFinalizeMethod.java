package src.fire.ch19;

/* objectŬ������ �޼ҵ� (finalize)
 * �ƹ��� �������� �ʴ� �ν��Ͻ��� ������ �÷��ǿ� ���� �Ҹ�Ǳ� �� �ڵ����� ȣ��Ǵ� �޼ҵ�
 * �ν��Ͻ� �Ҹ� �� �ݵ�� �����ؾ� �� �ڵ尡 �ִٸ� �� �޼ҵ带 �������̵� �ؼ� ���� �� �� ����
 */

class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	// finalize �޼ҵ� �������̵�
	@Override	
	protected void finalize() throws Throwable {	
		super.finalize();  // ���� Ŭ������ finalize �޼ҵ� ȣ��
		System.out.println("�Ҹ� : " + name);
	}
}

class ObjectFinalizeMethod {
	public static void main(String[] args) {
		Person p1 = new Person("anne");
		Person p2 = new Person("wuga");
		p1 = null;	// ��������� ������ �÷����� ������� ����
		p2 = null;	// ��������� ������ �÷����� ������� ����
		
		/* finalize �޼ҵ��� ȣ���� ������� �����ϰ� �ϴ� �޼ҵ� ȣ�� 
		 * ����ӽ��� �ſ� �ո����� ������� ������ �÷����� �����ϹǷ�,
		 * Ư���� ��Ȳ�� �ƴ϶�� ������ �÷��� ���ۿ� ������ ��ġ�� ȣ���� �ﰡ�ϴ� ���� ���� 
		 */
		System.gc();				// ������ �÷����� ������ ��û (����� �ƴ� ��û)
		System.runFinalization();	// �Ҹ��� ������ �ν��Ͻ��� finalize �޼ҵ� ȣ���� ��û (����� �ƴ� ��û)
		
		System.out.println("���α׷� ����");
	}
}
