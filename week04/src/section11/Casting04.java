package section11;

//예제 06
class Bike {
//	필드
	String riderName;
	int wheel = 2;	// 초기값을 2로 설정해둠
	
//	생성자
	public Bike(String riderName) {
		this.riderName = riderName;
	}
	
//	메소드
	void info() {
		System.out.println(riderName + "의 자전거는 " + wheel + "발 자전거입니다.");
	}
	
	void ride() {
		System.out.println("씽씽");
	}
}

//예제 07.
class FourWheelBike extends Bike {
//	부모 클래스에 생성해둔 매개변수를 1개로 받는 생성자
	public FourWheelBike(String riderName) {
		super(riderName);
	}

//	부모 클래스의 메소드인 info()를 오버라이딩
	@Override
	void info() {
		super.info();	// 부모 메소드 호출
	}
	
//	자식 클래스에 추가로 선언해둔 메소드
	void addWheel() {
		if (wheel == 2) {	// 해당 객체의 wheel의 값이 2라면
			wheel = 4;
			System.out.println(riderName + "의 자전거에 보조 바퀴를 부착하였습니다.");
		} else {			// wheel의 값이 2가 아니라면
			System.out.println(riderName + "의 자전거에 이미 보조 바퀴가 부착되어 있습니다.");
		}
	}
}

public class Casting04 {
	public static void main(String[] args) {
//		예제 08.
		Bike b = new FourWheelBike("윤기");	// 자식 클래스의 참조값을 부모클래스의 참조변수에 저장, 업캐스팅
		b.info();		// 부모클래스 메소드도 사용 가능하나 자식클래스에 오버라이딩한 메소드 통해서 호출됨
		b.ride();		// 부모 클래스 메소드 사용 가능
//		b.addWheel();	// 오류 발생, 자식 클래스에 선언해둔 메소드로 사용 불가, 사용하려면 다시 자식 클래스로 변환해줘야함
		
		System.out.println();
		
		FourWheelBike fwb = (FourWheelBike) b;	// 이미 업캐스팅된 자식클래스를 부모클래스에서 다시 자식클래스로 다운캐스팅 해줌
		fwb.addWheel();		// 자식클래스에 선언해둔 메소드 실행
		fwb.info();			// 자식 클래스에 오버라이딩해둔 메소드 통해 실행
		fwb.ride();			// 오버라이딩하지 않았으므로 부모클래스에 선언해둔 메소드 실행
	}
}
