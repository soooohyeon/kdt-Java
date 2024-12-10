package section11;

//예제 15.
class Animal {}
class Pig extends Animal {}
class Cow extends Animal {}

class Farm {
//	메소드
//	클래스 타입마다 넣어주게되면 메소드를 타입마다 선언해줘야함, 해서 공통되는 부모클래스 타입으로 매개변수 설정해줌
//	각각의 자식객체는 부모 타입도 포함되어 있음, 업캐스팅으로 타입이 부모 클래스 타입으로 변했다 하더라도 자식 클래스 타입도 여전히 가지고 있음
	void sound(Animal animal) {
		if (animal instanceof Pig) {	// animal의 타입이 Pig 클래스라면
			System.out.println("꿀꿀");
		} else {						// animal의 타입이 Pig 클래스가 아니라면 (Cow라면)
			System.out.println("음메");
		}
	}
}

public class InstanceOf01 {
	public static void main(String[] args) {
		Farm f = new Farm();	// 메소드를 사용하기 위해 객체화
		Pig p = new Pig();		// 객체화
		Cow c = new Cow();		// 객체화
		f.sound(p);				// 업캐스팅하여 호출한 메소드 인수에 객체 전달해줌
		f.sound(c);				// 업캐스팅하여 호출한 메소드 인수에 객체 전달해줌
	}
}
