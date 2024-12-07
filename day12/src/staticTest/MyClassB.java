package staticTest;
//3. 정적 변수와 정적메소드
public class MyClassB {
	public static void main(String[] args) {
//		1. 인스턴스 변수 출력
//		System.out.println(MyClassA.instanceVar);	// 인스턴스 변수는 객체 생성전까지 접근 불가
		MyClassA a = new MyClassA();
		MyClassA aa = new MyClassA();
		System.out.println("인스턴스변수 : " + a.instanceVar);
		
//		2. 정적 변수 출력 → 객체 생성으로 접근 가능하나 권장 x
//		클래스명.정적변수명으로 접근 ⇒ 공통된 저장공간 사용
		System.out.println("정적변수 : " + a.staticVar);
		System.out.println("인스턴스변수 : " + MyClassA.staticVar);

//		static 변수는 객체를 따로 생성해서 값을 넣더라도 하나의 method 저장공간만을 사용하므로
//		a.staticVar나 aa.staticVar나 같은 값이 나오게됨 / 즉, 수정된 20이 출력됨
		a.staticVar = 10;
		System.out.println(a.staticVar);	// 10
		aa.staticVar = 20;
		System.out.println(aa.staticVar);	// 20
		System.out.println(a.staticVar);	// 20
		
//		3. 다른 클래스에서 인스턴스 메소드 호출
		a.instanceMethod1();

//		4. 다른 클래스에서 static 메소드 호출
		MyClassA.staticMethod1();
	
	}
}
