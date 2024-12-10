package interfaceTest4;

public class BasicHeater extends HeaterAdapter {
//	Heater 인터페이스 대신 HeaterAdapter 추상 클래스를 상속받아
//	오버라이딩이 불필요한 turbo()메소드를 재정의하지 않음

	@Override
	public void on() {
		System.out.println("버튼으로 히터를 켭니다.");
	}

	@Override
	public void off() {
		System.out.println("버튼으로 히터를 끕니다.");
	}

}
