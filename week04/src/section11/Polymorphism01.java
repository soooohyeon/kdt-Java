package section11;

//예제 09.
class Computer {
//	메소드만 선언
	void powerOn() {
		System.out.println("삑- 컴퓨터가 켜졌습니다.");
	}
	void powerOff() {
		System.out.println("컴퓨터가 종료됩니다.");
	}
}

//예제 10.
class Samsong extends Computer {	// Computer 클래스를 상속 받은 자식클래스
//	오버라이딩된 메소드
	@Override
	void powerOn() {
		super.powerOn();	// 부모 클래스의 메소드 호출
		System.out.println("아이 러브 삼송");
	}
}

//예제 11.
class ComputerRoom {
//	필드
//	Samsong computer1;	// 자식클래스를 필드로 선언
//	Samsong computer2;
	Computer computer1;	// 클래스 타입마다 필드를 생성하면 코드가 늘어나게됨
	Computer computer2;	// 해서 공통되는 부모 클래스로 수정해줌
	
//	메소드
	void allPowerOn() {
		computer1.powerOn();	// computer1은 Samsong 클래스로 Samsong 클래스 메소드 호출
		computer2.powerOn();
	}
	
	void allPowerOff() {
		computer1.powerOff();
		computer2.powerOff();
	}
}

//예제 13.
class LZ extends Computer {	// Computer 클래스 상속받음
//	부모 클래스의 메소드 오버라이딩
	@Override
	void powerOn() {
		super.powerOn();	// 부모 클래스의 메소드 호출
		System.out.println("사랑해요 LZ");
	}
	
}
public class Polymorphism01 {
	public static void main(String[] args) {
//		예제 12.
		ComputerRoom cr = new ComputerRoom();	// 객체화
		cr.computer1 = new Samsong();			// 업캐스팅, 필드에 자식 클래스 객체화 해줌
		cr.computer2 = new Samsong();			// 업캐스팅, 필드에 자식 클래스 객체화 해줌
		
		cr.allPowerOn();						// 메소드 호출
		cr.allPowerOff();
		
//		에제 14.
		ComputerRoom cr2 = new ComputerRoom();	// 객체화
		cr2.computer1 = new LZ();			// 업캐스팅, 필드에 자식 클래스 객체화 해줌
		cr2.computer2 = new LZ();			// 업캐스팅, 필드에 자식 클래스 객체화 해줌
		
		cr2.allPowerOn();						// 메소드 호출
		cr2.allPowerOff();
	}
}
