package interfaceTest1;
//8. 인터페이스 구현 클래스
public class ClassA implements Inter {	// 클래스명 뒤에 올 수 있는 키워드는 2개 - extends, implements
//	인터페이스의 추상 메소드 오버라이딩
	@Override
	public void method1() {
		System.out.println("method1 오버라이딩");
	}

	@Override
	public void method2() {
		System.out.println("method2 오버라이딩");
	}	
	
}
