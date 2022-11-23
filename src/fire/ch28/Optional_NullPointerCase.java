package src.fire.ch28;

/* null ���ɼ��� ����ϴ� �ڵ��� �ۼ� */

class Friend { // ģ�� ����
	String name; // ģ�� �̸�
	Company cmp; // ģ�� ȸ�� (null�ϼ� ����)

	public Friend(String n, Company c) {
		name = n;
		cmp = c;
	}

	public String getName() { return name; }
	public Company getCmp() { return cmp; }
}

class Company { // ģ�� ������ ���ϴ� ȸ�� ����
	String cName; // ȸ�� �̸�
	ContInfo cInfo; // ȸ�� ���� (null�ϼ� ����)

	public Company(String cn, ContInfo ci) {
		cName = cn;
		cInfo = ci;
	}

	public String getCName() { return cName; }
	public ContInfo getCInfo() { return cInfo; }
}

class ContInfo { // ȸ�� ������ ���ϴ� ȸ�� ����ó
	String phone; // ȸ�� ��ȣ (null�ϼ� ����)
	String adrs; // ȸ�� �ּ� (null�ϼ� ����)

	public ContInfo(String ph, String ad) {
		phone = ph;
		adrs = ad;
	}

	public String getPhone() { return phone; }
	public String getAdrs() { return adrs; }
}

class Optional_NullPointerCase {
	public static void showCompAddr(Friend f) { // ģ���� �ٴϴ� ȸ�� �ּ� ���
		String addr = null;

		if (f != null) { // ���ڷ� ���޵� ���� null �� ���� ������
			Company com = f.getCmp();
			if (com != null) { // ȸ�� ������ ���� ���� ������
				ContInfo info = com.getCInfo();
				if (info != null) // ȸ�� ����ó ������ ���� ���� ������
					addr = info.getAdrs();
			}
		}

		if (addr != null) // �ּ� ������ ���� ���Ҽ��� ������
			System.out.println(addr);
		else
			System.out.println("ȸ�� �ּ� ������ �����ϴ�.");
	}

	public static void main(String[] args) {
		ContInfo ci = new ContInfo("321-444-577", "Republic of Korea");
		Company cp = new Company("���� ���۴�", ci);
		Friend frn = new Friend("wuga", cp);
		showCompAddr(frn); // ģ���� �ٴϴ� ȸ���� �ּ� ���
	}
}
