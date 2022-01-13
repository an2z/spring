package ch21;

/* 제네릭 클래스의 기본문법 
 * 매개변수화 타입을 타입 인자로 전달 가능하다. 
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