package classInterface;
//9. 클래스 단일 상속

class Parent {
	void display() {
		System.out.println("부모 클래스");
	}
}

//class Parent2 {
//	void display2() {
//		System.out.println("부모 클래스2");
//	}
//}

class Child extends Parent {
	void display2() {
		System.out.println("자식 클래스");
	}
}

public class ClassMain {
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
		c.display2();
	}
}