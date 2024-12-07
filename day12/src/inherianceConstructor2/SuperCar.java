package inherianceConstructor2;

public class SuperCar extends Car {
//	필드
	boolean booster;
	
//	메소드
	void boosterOn() {
		System.out.println("부스터 가동");
	}
	void boosterOff() {
		System.out.println("부스터 중지");
	}
	
//	생성자
	public SuperCar() {
		super();
	}
	public SuperCar(boolean booster) {
//		부모클래스의 생성자에 따라 super의 인수의 개수가 달라질 수 있음
//		super(); 는 부모클래스의 생성자를 연결해둔 것
		super(); 
		this.booster = booster;
	}
	public SuperCar(String brand, String color, int price, boolean booster) {
		super(brand, color, price); 
		this.booster = booster;
	}
}
