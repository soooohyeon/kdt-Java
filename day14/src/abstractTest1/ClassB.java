package abstractTest1;
//2. 추상 클래스 
public abstract class ClassB {
//	추상 메소드 - 구현되지 않은 메소드
//	추상 메소드가 하나라도 있다면 추상클래스로 선언할 것
	abstract void method1();
	
//	일반 메소드
	void method2() {
		System.out.println("추상 클래스의 method2() 호출");
	}
}
