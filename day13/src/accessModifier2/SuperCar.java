package accessModifier2;
//2. final 
public class SuperCar extends Car {
	// Car 클래스에 final 키워드가 있다면 상속 불가
	@Override
	void speedUp() {
		setSpeed(getSpeed() + 20);	// private 필드 접근은 getter, setter 메소드를 통해 처리
		System.out.println("슈퍼카가 가속합니다. 현재 속도 : " + getSpeed());
	}
}
