package staticTest;
//2. 정적 메소드와 인스턴스 메모리
public class StaticTest01 {
	public static void main(String[] args) {
//		정적 메소드르르 호출할 때는 클래스명.메소드명으로 호출
//		클래스명. 했을 때 메소드 아이콘에 s 붙은 것 확인 : static 사용된 것 표시됨
		StaticTest01.staticMethod();
		
//		같은 클래스에 있는 static 메소드는 메소드명으로도 호출 가능
		staticMethod();
		
//		인스턴스 메소드를 호출하기 위해 객체 생성
		StaticTest01 st = new StaticTest01();
//		정적 메소드를 호출하지만 권장 x
		st.staticMethod();

		
//		인스턴스 메소드 호출
		st.instanceMethod1();
		st.instanceMethod2();
		
	}
	
//	인스턴스 메소드1
	void instanceMethod1() {
		System.out.println("인스턴스 메소드 1 실행");
		
//		메소드 중괄호 영역안에서 다른 메소드 호출 가능
		instanceMethod2();
//		static 메소드는 항상 준비된 상태이기때문에 인스턴스 메소드에서 static 메소드 호출 가능
		staticMethod();
	}
	
//	인스턴스 메소드 2
	void instanceMethod2() {
		System.out.println("인스턴스 메소드 2 실행");
	}
	
//	정적 메소드
	static void staticMethod() {
		System.out.println("정적 메소드 실행");
//		인스턴스 메소드는 객체를 생성해야지만 사용 가능하기 때문에 정적 메소드 내에서 인스턴스 메소드 호출 불가
//		static 메소드는 static 메소드 끼리만 호출 가능
//		instanceMethod1();
	}
	
}
