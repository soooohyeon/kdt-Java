package section10;

//예제 21.
class Car {	// 부모 클래스 생성
//	메소드만 선언하므로 초기화할 필요가 없어 생성자 따로 생성 x
	void ride() {
		System.out.println("달립니다.");
	}
}

//예제 22.
class Bus extends Car {	// Car 클래스를 상속 받는 자식 클래스 선언
	int peopleNum;	// 부모 클래스와는 별개인 필드를 가짐

//	생성자를 따로 지정해줌
	public Bus(int peopleNum) {
		this.peopleNum = peopleNum;
	}
	
//	부모 클래스와는 별개인 메소드 추가 생성
	void takePerson() {
		System.out.println("승객이 버스에 탔습니다.");
		peopleNum++;	// 초기화한 승객수에서 실행할 때마다 +1 누적됨
		System.out.println("지금까지 탑승한 승객은 " + peopleNum + "명 입니다.");	// 누적된 승객 수 출력
	}
}

//예제 23.
class SchoolBus extends Bus {	// 자식 클래스인 Bus를 상속받는 자식 클래스 / 즉 Bus 클래스는 부모 클래스이자 자식 클래스

//	부모 클래스인 Bus클래스에서 매개변수가 있는 생성자를 생성했기 때문에 자식클래스에도 생성자 따로 생성 (없으면 오류 발생)
	public SchoolBus(int peopleNum) {
		super(peopleNum);	// super()는 부모의 생성자를 의미
	}

//	부모인 Bus의 메소드 오버라이딩
	@Override
	void takePerson() {
		super.takePerson();	// 부모의 메소드 같이 호출
		System.out.println("학생들이 자리에 모두 착석하고 출발합니다.");
	}

//	부모인 Bus도 상속을 받았기 때문에 Bus가 부모인 Car의 메소드도 같이 가지고 있음
//	해서 Bus를 상속받은 SchoolBus도 ride() 메소드를 가지고 있으며 해당 메소드 오버라이딩 가능
	@Override
	void ride() {
		System.out.println("시속 50km/h로 천천히 달립니다.");
	}
}

public class InheitanceTwo {
	public static void main(String[] args) {
//		예제 24.
		SchoolBus sb = new SchoolBus(10);	// SchoolBus 객체화 / 매개변수가 있는 생성자를 따로 생성해뒀기 때문에 타입에 맞는 값을 지정해줘야함
		
//		SchoolBus는 부모인 Bus의 메소드와 Bus의 부모인 Car 메소드를 전부 사용 가능하며
//		해서 각 메소드를 오버라이딩(재정의) 해둠
//		호출 시 각 오버라이딩 된 메소드가 호출
		sb.takePerson();
		sb.ride();
	}
}
