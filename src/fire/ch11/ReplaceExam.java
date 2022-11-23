package src.fire.ch11;

public class ReplaceExam {

	public static void main(String[] args) {
		String resi = "990925-1012999";
		
		/* replace �޼ҵ� */
		System.out.println(resi.replace('-', ' '));
//		System.out.println(resi.replace('-', ''));  // ���ڴ� �ϳ��̻� �����ؾ��ϱ� ������ �����߻�
		
		/* replaceALL �޼ҵ� */
		System.out.println(resi.replaceAll("-", " "));
		System.out.println(resi.replaceAll("-", ""));
	}

}
