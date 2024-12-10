package classInterface;
//11. 인터페이스의 단일 상속

interface ParentInter {
	void method1();
}

interface ChildInter extends ParentInter {
	void method2();
}

class ClassA implements ChildInter {
//	부모 인터페이스의 method1()도 같이 들어있음
	
	@Override
	public void method1() {
		System.out.println("ParentInter의 메소드 구현");
	}
	
	@Override
	public void method2() {
		System.out.println("ChildInter의 메소드 구현");
	}
}

public class InterfaceMain2 {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.method1();
		a.method2();
		
		ChildInter ci = new ClassA();
//		업캐스팅, ParentInter을 상속 받았으므로 method1, method2 2개 다 사용 가능
		ci.method1();
		ci.method2();
		
		ParentInter pi = new ClassA();
//		업캐스팅이나 소속은 ParentInter이므로 method1만 사용가능
		pi.method1();
	}
}
