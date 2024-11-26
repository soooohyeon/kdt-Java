package variable;
// 1번
public class Variable01 {
	public static void main(String[] args) {
//		변수 선언
//		자료형 변수명;
		int number1;	// 정수형 타입의 값을 저장 가능한 number1 변수 생성
		boolean isTrue;	// 논리형 타입의 값을 저장할 수 있는 isTrue 변수 생성
//		자료형이 달라도 변수명은 중복 불가
		double number2;	// 실수형 타입의 값을 저장 가능한 number2 변수 생성
		
//		변수의 값 
//		변수명 = 값;
		
//		변수는 선언 후 반드시 갑을 저장해야함 (변수의 초기화)
		number1 = 10;	// 10이라는 정수형 값을 number1 변수에 대입(저장)
//		double타입의 변수에 정수형 값을 입력하더라도 실수형으로 출력됨
		number2 = 10.5;	// 10.5라는 실수형 값을 number2 변수에 대입(저장)
		isTrue = true;	// true라는 논리형 값을 isTrue 변수에 대입(저장)
		
		System.out.println(10);			// 10이라는 값을 콘솔창에 출력
		System.out.println(number1);	// number1 변수에 저장된 10이라는 정수형 값이 콘솔창에 출력함
		System.out.println(number2);	// number2 변수에 저장된 10.5라는 실수형 값이 콘솔창에 출력함
		System.out.println(isTrue);		// isTrue 변수에 저장된 true라는 논리형 값을 콘솔창에 출력함
		
//		선언과 동시에 초기화(처음으로 값을 저장함을 의미)
//		자료형 변수명 = 값;
		int number3 = 100;	// 정수형 number3 변수를 생성하고 정수형 100이라는 정수형 값 대입(저장)
							// ⇒ 정수를 저장할 수 있는 변수 number3를 선언하고 100이라는 정수형값으로 초기화함
		System.out.println(100);
		System.out.println(number3);
	}
}
