package interfaceTest1;
//7. 인터페이스 객체화 불가능, 구현한 클래스로 객체화 진행
public class InterMain {
	public static void main(String[] args) {
//		인터페이스 객체화 불가능 → 추상메소드를 구현하는 클래스로 객체화
//		Inter i = new Inter();
		
		ClassA a = new ClassA();
		System.out.println(a);
		a.method1();
		System.out.println(a.VAR1);
//		a.VAR1 = 100;	// 상수로 수정 불가
		
		Inter i1 = new ClassA();	// 상속과 마찬가지로 업캐스팅
		i1.method1();				// 오버라이딩된 메소드로 사용됨
	}
}
