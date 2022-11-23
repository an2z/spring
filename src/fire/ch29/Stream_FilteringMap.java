package src.fire.ch29;

/* ��Ʈ���� �߰� ����(���͸� �� ����) */

import java.util.ArrayList;
import java.util.List;

class ToyPriceInfo {      // �峭�� �� �� ���� ����
	private String model; // �𵨸�
	private int price;    // ����
		
	public ToyPriceInfo(String m, int p) {
		model = m;
		price = p;
	}	
	public int getPrice() {
		return price;
	}
}

class Stream_FilteringMap {
	public static void main(String[] args) {
		List<ToyPriceInfo> ls = new ArrayList<>();
		ls.add(new ToyPriceInfo("�Ǵ�_45", 200));
		ls.add(new ToyPriceInfo("�����_2", 350));
		ls.add(new ToyPriceInfo("Ÿ��_779", 550));
		
		int sum = ls.stream()
				    .filter(p -> p.getPrice() < 500) // ������ 500 �̸��� �͸� ���
				    .mapToInt(t -> t.getPrice()) // ������ �������� ����
				    .sum(); // ���� ����
		System.out.println("sum = " + sum);
	}
}
