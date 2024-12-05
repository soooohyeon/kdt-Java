package classBasic02;
//5. 클래스의 특징 (객체 생성의 틀)
public class Car {
//	필드
	String model;
	String color;	// 색상
	int speed;		// 속도
	
//	메소드
//	속도를 증가시키는 메소드
	void accelerate(int value) {
		speed += value;
	}
	
//	주행을 멈추는 메소드
	void stop() {
		speed = 0;
	}
}
