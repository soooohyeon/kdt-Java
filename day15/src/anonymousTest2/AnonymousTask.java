package anonymousTest2;

//Calculator 인터페이스
//추상메소드2
//- 2개의 매개변수를 받아 더한 값을 반환하는 메소드
//- 2개의 매개변수를 받아 곱한 값을 반환하는 메소드

interface Calculator {
	int add (int num1, int num2);
	int multiply (int num1, int num2);
}

public class AnonymousTask {
	public static void main(String[] args) {
//		익명클래스로 객체 생성 후 메소드 호출
		Calculator cal = new Calculator() {
			
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
			
			@Override
			public int multiply(int num1, int num2) {
				return num1 * num2;
			}
		};
		
		System.out.println("합 : " + cal.add(7, 4));
		System.out.println("곱 : " + cal.multiply(3, 5));
		
	}
}
