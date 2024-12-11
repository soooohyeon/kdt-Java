package lambda;
//람다식 = 익명메소드
public class LambdaTest2 {
//	매개변수 x, 리턴값 x
	void printHello() {
		System.out.println("안녕..");
	}
	
//	void printHello() { System.out.println("안녕.."); }
	
//	1. 이름을 없애고 '->' 추가
//	void () -> { System.out.println("안녕.."); }
	
//	2. 반환타입 추론 가능하므로 생략
//	() -> { System.out.println("안녕.."); }
//	** 뒤에 return이 있다면 해당 리턴값으로 추론 가능
	
//	3. 명령문이 1줄이면 중괄호와 세미콜론(;) 생략 가능(선택)
//	() -> System.out.println("안녕..")
	
	
//	매개변수 o, 리턴값 o
	int addTen(int num) {
		return num + 10;
	}
	
//	int addTen(int num) { return num + 10; }

//	1. 이름을 없애고 '->' 추가
//	int (int num) -> { return num + 10; }

//	2. 반환타입 추론 가능하므로 생략
//	(int num) -> { return num + 10; }
	
//	3. 매개변수 타입은 추론이 가능하므로 생략 가능 (선택)
//		** 매개변수 타입을 생략할 때 매개변수가 1개라면 () 생략 가능 (선택)
//	num -> { return num + 10; }
	
//	4. 명령문이 1줄이면 중괄호와 세미콜론(;) 생략 가능(선택)
//		** 중괄호와 세미콜론을 생략했다면 return도 생략해야함
//	num -> num + 10
//	** body부분의 결과가 값이라면 자동으로 리턴됨
//	   단, body의 명령문이 1개여야만 함
//	-> 뒤 부분을 body 라고 명칭
	
	
//	매개변수 2개, 리턴 o, body에 명령문 2개
	int addNumber(int num1, int num2) {
		System.out.println("num1의 값 : " + num1 + ", num2의 값 : " + num2);
		return num1 + num2;
	}
	
//	1. 이름을 없애고 -> 추가
//	int (int num1, int num2) -> { System.out.println("num1의 값 : " + num1 + ", num2의 값 : " + num2); return num1 + num2; }
	
//	2. 반환타입 추론 가능하므로 생략
//	(int num1, int num2) -> { System.out.println("num1의 값 : " + num1 + ", num2의 값 : " + num2); return num1 + num2; }
	
//	3. 매개변수 타입은 추론 가능하므로 생략 가능 (선택)
//	   ** 매개변수가 2개 이상이라면 () 생략 불가
//	(num1, num2) -> { System.out.println("num1의 값 : " + num1 + ", num2의 값 : " + num2); return num1 + num2; }
	
//	4. 명령문이 2개 이상이면 {}와 ; 생략 불가
//	   ** 반환할 값이 존재한다면 return 사용해야함
//	(num1, num2) -> { System.out.println("num1의 값 : " + num1 + ", num2의 값 : " + num2);
//					  return num1 + num2; };
}
