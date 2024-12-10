package interfaceTest1;
//6. 인터페이스 선언
public interface Inter {
//	상수, 추상메소드만 가능
//	static 정적, 메모리에 처음부터 끝까지 남아있음
//	public 모든 곳에서 접근 가능
//	public final static int VAR1 = 10;
	int VAR1 = 10;	// 변수 선언시 상수를 의미하는 public final static가 생략되어있음
	
//	public abstract void method1();
	void method1();	// 메소드 선언시 추상메소드를 의미하는 public abstract가 생략되어있음
	void method2();	// 메소드 선언시 추상메소드를 의미하는 public abstract가 생략되어있음
}
