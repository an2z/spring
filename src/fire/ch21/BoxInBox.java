package src.fire.ch21;

/* ���׸� Ŭ������ �⺻���� 
 * �Ű�����ȭ Ÿ���� Ÿ�� ���ڷ� ���� �����ϴ�. 
 */ 

class Box6<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

public class BoxInBox {
	public static void main(String[] args) {
		Box6<String> sBox = new Box6<>();
		sBox.set("I am so happy");
		
		Box6<Box6<String>> wBox = new Box6<>();
		wBox.set(sBox);
		
		Box6<Box6<Box6<String>>> zBox = new Box6<>();
		zBox.set(wBox);
		
		System.out.println(zBox.get().get().get());
	}
}
