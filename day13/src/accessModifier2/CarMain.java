package accessModifier2;
//2. final 
public class CarMain {
	public static void main(String[] args) {
		Car c = new Car();
		c.setSpeed(100);	// 외부 클래스에서 접근은 getter, setter 메소드로 접근
		System.out.println(c.getSpeed());
		
		SuperCar sc = new SuperCar();
		sc.speedUp();	// 자식클래스의 객체는 오버라이딩된 메소드 호출됨
		sc.stop();
	}
}
