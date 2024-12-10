package classInterface;
//10. 인터페이스 다중 구현

interface InterfaceA {
	void methodA();
}

interface InterfaceB {
	void methodB();
}

class ClassC implements InterfaceA, InterfaceB {
//	각각의 인터페이스의 동일한 메소드명을 가진 추상메소드를 선언하더라도 구현된 메소드가 1개 이기 때문에 다중 구현 가능
	@Override
	public void methodA() {	
		System.out.println("InterfaceA의 메소드 구현");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceB의 메소드 구현");
	}
}

public class InterfaceMain {
	public static void main(String[] args) {
		
	}
}
