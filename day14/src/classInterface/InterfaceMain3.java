package classInterface;
//12. 인터페이스의 다중 상속
//객체가 여러 역할을 수행해야할 때
//모듈화와 확정성을 고려할 때
//재사용성과 중복 방지

interface InterfaceAA {
	void methodA();
}

interface InterfaceBB {
	void methodB();
}

interface InterfaceCC extends InterfaceAA, InterfaceBB {
	void methodC();
}

class ClassAA implements InterfaceCC {
//	InterfaceAA와 InterfaceBB를 상속받은 InterfaceCC를 구현하기 때문에 오버라이딩이 필요한 메소드는 3개
	@Override
	public void methodA() {
		
	}

	@Override
	public void methodB() {
		
	}

	@Override
	public void methodC() {
		
	}
}

public class InterfaceMain3 {
	public static void main(String[] args) {
		
	}
}
