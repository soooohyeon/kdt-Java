package section02;
//2. 변수 - 변수 선언과 초기화 ②
public class Variable03 {
	public static void main(String[] args) {
		String myCity = "Seoul";	// 문자열 타입 변수 선언과 초기화 동시에 진행
									// 문자열 타입의 myCity 변수에 Seoul 이라는 값 대입
		System.out.println("I am from " + myCity);	// () 안 데이터 출력하고 줄바꿈함
		// "I am from " + "Seoul" = 문자열과 같이 작성된 + 기호는 덧셈 연산 기호가 아닌 문자열 연결해주는 기호
	}
}
