package section11;

//Plus 학습 코너.
class Parent2 {
//	메소드
	public void display() {
		System.out.println("부모 클래스의 display()메소드 입니다.");
	}
}

class Child2 extends Parent2 {
//	메소드 - 상속받은 Parent2의 메소드 오버라이딩
	public void display() {
		System.out.println("자식 클래스의 display()메소드 입니다.");
	}

//	위 메소드와 매개변수의 개수를 다르게한 오버로딩
	public void display(String str) {
		System.out.println(str);
	}
}

public class PlusTest {
	public static void main(String[] args) {
		Child2 ch = new Child2();	// 객체화
		ch.display();				// 자식 클래스에 오버라이딩한 메소드 호출
		ch.display("오버로딩된 dispaly() 메소드입니다.");	// 자식 클래스에 매개변수 추가해서 오버로딩한 메소드 호출
	}
}
