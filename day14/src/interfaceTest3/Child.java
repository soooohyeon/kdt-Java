package interfaceTest3;

public class Child implements ParentA, ParentB {
//	ParentA, ParentB 둘 중 하나만 구현을 받으면 모호성이 발생하지 않아 오버라이딩이 필요 없음
//	그러나 ParentA, ParentB 다중 구현을 받으며 동일한 default로 구현된 메소드가 있기 때문에 모호성이 발생함
//	해서 오버라이딩을 통해 ParentA.super.greet()등 메소드를 지정해줘야함

//	child 클래스가 두 인터페이스를 모두 사용할 때 어떤 인터페이스에 있는 greet()를 사용할 지 모호성 발생
//	=> child 클래스에서 greet()메소드를 반드시 재정의해줘야함
//	ParentA.super.greet()는 ParentA 인터페이스의 default greet 메소드 호출
	
	@Override
	public void greet() {
		ParentA.super.greet();	// ParentA super : 인터페이스의 참조값을 의미
	}

}
