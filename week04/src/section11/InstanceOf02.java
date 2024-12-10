package section11;

//에제 17.
class Animal2 {
	void cry() {}
}

class Pig2 extends Animal2 {	// Animal 클래스를 상속받은 자식 클래스
//	상속받아 메소드 오버라이딩
	@Override
	void cry() {
		System.out.println("꿀꿀");
	}
}

class Cow2 extends Animal2 {	// Animal 클래스를 상속받은 자식 클래스
//	상속받아 메소드 오버라이딩
	@Override
	void cry() {
		System.out.println("음메");
	}
}

class Farm2 {
	void sound(Animal2 animal) {	// 공통된 부모 메소드를 매개변수로 받기
		animal.cry();	// 메소드 호출, 만약 오버라이딩된 메소드가 있다면 전달받은 타입에 맞는 오버라이딩 메소드가 호출됨
	}
}

public class InstanceOf02 {
	public static void main(String[] args) {
		Farm2 f = new Farm2();	// 메소드를 사용하기 위해 객체화
		Pig2 p = new Pig2();	// 객체화
		Cow2 c = new Cow2();	// 객체화
		f.sound(p);				// 업캐스팅하여 호출한 메소드 인수에 객체 전달해줌
		f.sound(c);				// 업캐스팅하여 호출한 메소드 인수에 객체 전달해줌
	}
}
