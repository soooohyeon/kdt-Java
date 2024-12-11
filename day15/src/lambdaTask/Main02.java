package lambdaTask;

public class Main02 {
	public static void main(String[] args) {
//		2. 두 수의 곱을 구하는 프로그램을 만든다.
		
//		익명 클래스 사용하여 오버라이딩
		MultipleInter m1 = new MultipleInter() {
			@Override
			public int multiply(int num1, int num2) {
				
				return num1 * num2;
			}
		};

		System.out.println("두 수를 합한 곱(익명클래스) : " + m1.multiply(4, 8));
//		람다식(익명 메소드)을 사용하여 구현한 정적 메소드 호출
		System.out.println("두 수를 합한 곱(람다식-true) : " + calculator(true).multiply(2, 7));
		System.out.println("두 수를 합한 곱(람다식-false) : " + calculator(false).multiply(2, 7));
	}
	
	
//	(2) Main.java(클래스)에 다음과 같은 static 메소드를 선언한다.
//	- MultipleInter 타입을 반환한다.
//	- 이름은 calculator
//	- 매개변수는 boolean타입을 받는다.
//	매개변수로 true가 들어오면 두수의 곱을 반환하는 람다식을 만들고
//	false가 들어오면 0을 반환하는 람다식을 만든다.
//	작성된 람다식을 MultipleInter 타입의 변수에 저장하여 반환하는 메소드를 만든다.
	
//		람다식(익명 메소드) 사용하여 오버라이딩 메소드를 사용한 정적 메소드 선언
	static MultipleInter calculator(boolean flag) {
		MultipleInter m2 = flag ? (num1, num2) -> num1 * num2 : (num1, num2) -> 0;
		return m2;
	}
}
