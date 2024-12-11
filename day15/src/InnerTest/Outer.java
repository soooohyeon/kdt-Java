package InnerTest;
//1. 내부클래스
public class Outer {
//	필드
	int var1;
	String data1 = "Outer";
//	String data1;	// 생성 불가
//	data1 = "Outer";
	
//	Outer 클래스의 기본 생성자
	public Outer() {
		System.out.println("외부 클래스 생성자");
	}
	
//	내부 클래스 Inner 정의
	class Inner {
//		필드, 생성자, 메소드
//		Inner 클래스의 필드
		int var2 = 10;
		String data2 = "Inner";
		
//		Inner 클래스의 기본 생성자
		public Inner() {
			super();	// Object 클래스의 참조값
			System.out.println("내부 클래스 생성자");
		}
		
//		Inner 클래스의 메소드
		void innerMethod() {
			System.out.println("내부 클래스 메소드 호출");
			var1 = 10;		// 내부 클래스에서는 외부 클래스 멤버(필드) 사용 가능
//			this.var1;		// 오류 발생 - var1은 외부클래스의 멤버, this는 현재 Inner 클래스의 객체로 범위가 다름
			System.out.println("내부 클래스의 메소드에서 var1의 값 : " + var1);
			outerMethod();	// 내부 클래스에서는 외부 클래스 멤버(메소드) 사용 가능
		}
	}
	
//	메소드
	void outerMethod() {
		System.out.println("외부 클래스의 메소드 호출");
	}
	
}
