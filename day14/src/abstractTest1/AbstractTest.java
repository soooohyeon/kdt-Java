package abstractTest1;
//4. 일반 클래스와 추상클래스 객체화
public class AbstractTest {
	public static void main(String[] args) {
//		일반 클래스인 ClassA는 객체화 바로 가능
		ClassA a = new ClassA();
		System.out.println(a);
		
//		추상 클래스인 ClassB는 객체화 불가 - 미완성 클래스
//		ClassB b = new ClassB();	// 추상클래스는 객체화 불가
		
//		추상 클래스인 ClassB를 상속받은 ClassC는 객체화 가능
		ClassC c = new ClassC();
		System.out.println(c);		// ClassB 추상클래스를 상속받은 자식클래스
		ClassB b = new ClassC();	// 업캐스팅
		System.out.println(b);	
		b.method1();	// 오버라이딩된 메소드 사용
		
//		다운캐스팅하여 자식클래스의 메소드 사용
		((ClassC)b).printNumber();
		
		
	}
}
