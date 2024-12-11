package InnerTest;
//2. 내부 클래스와 외부 클래스 객체화
public class Main {
	public static void main(String[] args) {
//		외부 클래스 객체화
		Outer outer = new Outer();	// 생성자에 작성해둔 출력메세지 출력
		System.out.println("외부 클래스의 참조값 : " + outer);
		System.out.println("외부 클래스의 필드 : " + outer.var1);	// 초기화된 값 0 출력
		
//		내부 클래스 객체화
//		내부 클래스는 외부 클래스의 인스턴스(주소값)를 통해 생성해야함
//		Inner inner = new Inner();	// 외부 클래스 내부에 있는 내부 클래스로 참조값을 몰라 객체 생성 불가
//		위에서 생성해둔 외부 클래스의 객체(주소값)을 이용하여 내부 객체화
		Outer.Inner inner = outer.new Inner();
		System.out.println("내부 클래스의 참조값 : " + inner);	// 참조값에 $ 포함시 내부 클래스
		System.out.println("내부 클래스의 데이터 : " + inner.var2);
		inner.innerMethod();
		
		
		Outer.Inner inner2 = new Outer().new Inner();
		
	}
}
