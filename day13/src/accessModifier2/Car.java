package accessModifier2;
//2. final 
public class Car {
//	final : 최종을 의미하는 키워드
//	final 클래스 : 최종적인 클래스이므로 더 이상 상속 불가 (자식클래스 생성 불가)
//	final 메소드 : 오버라이딩 불가
	
//	필드
	private int speed;
	
//	getter, setter 메소드
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//	메소드
	void speedUp() {
		speed += 10;
		System.out.println("현재 시속 : " + this.speed);
	}
	
	final void stop() {	// 오버라이딩 불가
		System.out.println("브레이크를 밟아 차를 멈춥니다.");
		this.speed = 0;
	}
}
