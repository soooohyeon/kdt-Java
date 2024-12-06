package staticTest;
//3. 정적 변수와 정적메소드
public class MyClassA {
//	필드 (인스턴스 변수, 스태틱 변수, 상수)
	int instanceVar;	// 인스턴스 변수
	static int staticVar;	// static 변수, 정적 변수, 클래스 변수
	
//	 생성자 → 지정하지 않았기 때문에 컴파일러가 기본 생성자 만들어줌 / 보이지 않을 뿐!!
	
//	메소드 (인스턴스 메소드, static 메소드)
//	인스턴스 변수는 객체를 생성해서 호출되기 전까지 heap 메모리에 올라가 있지 않음
//	인스턴스 메소드 1
	void instanceMethod1 () {
		System.out.println("인스턴스 메소드1 호출");
		instanceVar = 10;
		System.out.println("인스턴스 메소드1에서 인스턴스 변수 값 : " + this.instanceVar);
		staticVar = 10;	// 메소드 메모리에 staticVar라는 저장공간이 할당, static변수는 무조건 저장공간 1개
		System.out.println("인스턴스 메소드1에서 static 변수 값 : " + staticVar);
		instanceMethod2();
		staticMethod1();
	}
	
//	인스턴스 메소드 2
	void instanceMethod2 () {
		System.out.println("인스턴스 메소드2 호출");
	}
	
//	static 메소드는 이미 method 메모리에 올라가 있음
//	static 메소드1
	static void staticMethod1() {
		System.out.println("static 메소드1 호출");
//		instanceMethod2();	// 호출 불가
//		instanceVar = 100;	// 접근 불가
		staticVar = 200;	// 인스턴스 메소드1에서 대입한 10이라는 값에서 200으로 값이 수정됨
		System.out.println("static 메소드1에서 static 변수 값 : " + staticVar);
		staticMethod2();
	}
	
//	static 메소드2
	static void staticMethod2() {
		System.out.println("static 메소드2 호출");
	}
	
}
