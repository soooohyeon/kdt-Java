package section10;

//예제 07.
class Computer {	// 부모 클래스 선언
//	필드 없의 메소드만 2개 선언
	void powerOn() {
		System.out.println("삑-- 컴퓨터가 켜졌습니다.");
	}
	
	void powerOff() {
		System.out.println("컴퓨터가 꺼졌습니다.");
	}
}

//예제 08.
class Samsong extends Computer {	// 자식 클래스 선언 후 부모 클래스 상속 받음
//	부모 클래스 중 powerOn() 메소드를 선언부를 변경하지 않고 실현부만 수정하여 오버라이딩함
	@Override
	void powerOn() {
//		예제 10.
		super.powerOn();	// 부모의 참조값을 담아둔 참조변수라는 의미의 키워드 / 즉, 부모클래스에 선언해둔 메소드 호출
		System.out.println("아이 러브 삼송");
	}
}

public class InheritanceTest03 {
	public static void main(String[] args) {
//		예제 09.
		Samsong s = new Samsong();	// 자식 타입 객체화
		s.powerOn();				// 오버라이딩한 메소드 출력
		s.powerOff();				// 부모 클래스의 선언한 메소드 그대로 출력
		
		Computer c = new Computer();	// 부모 타입 객체화
		c.powerOn();					// 부모 클래스의 선언한 메소드 그대로 출력
		c.powerOff();					// 부모 클래스의 선언한 메소드 그대로 출력
	}
}
