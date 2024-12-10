package abstractTest1;
//3. 추상 클래스를 상속받은 일반 클래스
public class ClassC extends ClassB {
//	추상 클래스의 추상 메소드를 오버라이딩
	@Override
	void method1() {
		System.out.println("추상클래스를 상속받은 일반 클래스 - 메소드 재정의");
	}
	
	void printNumber() {
		System.out.println("숫자 출력");
	}
}
