package src.fire.ch16;

/* �θư��� ���α׷� (��� ��) */

class UnivFriend { // ���� ��â
	private String name;
	private String phone;
	private String major; // ����

	public UnivFriend(String name, String phone, String major) {
		this.name = name;
		this.phone = phone;
		this.major = major;
	}
	
	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ��ȣ: " + phone);
		System.out.println("����: " + major);
	}
}

class CompFriend { // ���� ����
	private String name;
	private String phone;
	private String department;
	
	public CompFriend(String name, String phone, String department) {
		this.name = name;
		this.phone = phone;
		this.department = department; // �μ�
	}
	
	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ��ȣ: " + phone);
		System.out.println("�μ�: " + department);
	}
}

class MyFriends {
	public static void main(String[] args) {
		// ���� ��â ������ ���� �迭�� ����
		UnivFriend[] uf = new UnivFriend[5];
		int ucnt = 0;
		
		// ���� ���� ������ ���� �迭�� ����
		CompFriend[] cf = new CompFriend[5];
		int ccnt = 0;
		
		// ���� ��â ���� ����
		uf[ucnt++] = new UnivFriend("Lee", "010-222-333", "java");
		uf[ucnt++] = new UnivFriend("Kim", "010-444-555", "python");

		// ���� ���� ���� ����
		cf[ccnt++] = new CompFriend("Lim", "010-555-666", "R&D 1");
		cf[ccnt++] = new CompFriend("Park", "010-777-888", "R&D 2");
		
		// ��� ��â �� ������ ���� ��ü ���
		for (int i=0; i<ucnt; i++) {
			uf[i].showInfo();
			System.out.println();
		}
		for (int i=0; i<ccnt; i++) {
			cf[i].showInfo();
			System.out.println();
		}
	}
}
