package classInterface;
//13. 상속과 구현은 별개

class Parent2 {
	void parentMethod() {
		System.out.println("부모 클래스의 메소드");
	}
}

interface InterfaceAAA {
	void methodA();
}

interface InterfaceBBB {
	void methodB();
}

class Child2 extends Parent2 implements InterfaceAAA, InterfaceBBB {
//	상속과 구현에는 우선순위가 존재, 상속이 먼저 되어야함
//	상속받은 메소드는 강제성을 띄지 않음 (이미 구현되었기 때문)
	
	@Override
	public void methodB() {
		
	}

	@Override
	public void methodA() {
		
	}
	
}

public class ExtendsImpl {
	public static void main(String[] args) {
		
	}
}
