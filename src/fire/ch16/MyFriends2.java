package src.fire.ch16;

/* �θư��� ���α׷� (��� ��) */

class Friend {
	protected String name;
	protected String phone;
	
	public Friend(String na, String ph) {
		name = na;
		phone = ph;
	}
	
	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ��ȣ: " + phone);
	}
}

class UnivFriend2 extends Friend {
	private String major;
	
	public UnivFriend2(String na, String ph, String ma) {
		super(na, ph); // ����Ŭ���� ������ ȣ��
		major = ma;
	}
	
	public void showInfo() { // �޼ҵ� �������̵�
		super.showInfo();
		System.out.println("����: " + major);
	}
}

class CompFriend2 extends Friend {
	private String department;
	
	public CompFriend2(String na, String ph, String de) {
		super(na, ph); // ����Ŭ���� ������ ȣ��
		department = de;		
	}
	
	public void showInfo() { // �޼ҵ� �������̵�
		super.showInfo();
		System.out.println("�μ�: " + department);
	}	
}


class MyFriends2 {
	public static void main(String[] args) {
		Friend[] f = new Friend[5];
		int cnt = 0;
		
		f[cnt++] = new UnivFriend2("Lee", "010-222-333", "java");
		f[cnt++] = new UnivFriend2("Kim", "010-444-555", "python");
		f[cnt++] = new CompFriend2("Lim", "010-555-666", "R&D 1");
		f[cnt++] = new CompFriend2("Park", "010-777-888", "R&D 2");
		
		// ��� ��â ���� ���� ��ü ���
		for (int i=0; i<cnt; i++) {
			f[i].showInfo(); // �������̵� �� �޼ҵ尡 ȣ���
			System.out.println();
		}
	}

}
