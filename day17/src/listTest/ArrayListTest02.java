package listTest;
//7. 컬렉션 프레임워크 : ArrayList, 제네릭

class MyClass<T> {
//	필드
	T data;
	
//	생성자
	public MyClass(T data) {
		super();
		this.data = data;
	}

//	메소드
	void printData() {
		System.out.println(data);
	}
}

public class ArrayListTest02 {
	public static void main(String[] args) {
		MyClass mc0 = new MyClass(1);		// 타입을 지정하지 않았기 때문에 생성자의 ()안은 Object 타입
		MyClass<Double> mc1 = new MyClass<>(1.0);
		System.out.println(mc1);
		mc1.printData();
		
		MyClass<String> mc2 = new MyClass<>("hello");
		System.out.println(mc2);
		mc2.printData();
		
	}
}
