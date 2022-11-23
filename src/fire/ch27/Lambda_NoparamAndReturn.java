package src.fire.ch27;

import java.util.Random;

/* ���� ǥ���� (�Ű����� x, ��ȯ o) 
 * �Ű������� ���ٸ� �Ű����� ������ ��� �Ұ�ȣ ���� ����ش�.
 */

interface Generator {
	int rand(); // �Ű������� ���� �߻�޼ҵ�
}

class Lambda_NoparamAndReturn {
	public static void main(String[] args) {
    	Generator gen = () -> { // �� �Ұ�ȣ ���
        	Random rand = new Random();
            return rand.nextInt(50);
        };
    System.out.println(gen.rand());
    }
}
