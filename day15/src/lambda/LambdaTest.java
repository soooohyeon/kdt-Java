package lambda;
//식과 문의 차이
public class LambdaTest {
	public static void main(String[] args) {
//		식 (Expression), 문 (Statement)
		
//		문 (Statement) : 조건문, 반복문, 기타제어문
//		문은 값이 아니기 때문에 변수에 저장할 수 없고 매개변수로 넘겨줄 수 있음
//		JAVA에서 실행 가능한 최소한의 코드 블록
//		if문, switch문, for문, ...
//		하나 이상의 식 포함 가능
//		명령을 전달할 때 사용
		
//		식(Expression) : 조건식, 초기식, 즘감식
//		식은 결과가 값!!
//		JAVA에서 값을 계산하고 결과를 반환하는 구문
//		1 + 2, "Hello World", ...
//		** 리턴타입이 있는 메소드도 하나의 식이 될 수 있음
//		문(Statement)으로도 사용 가능
		
		
		int a = 3; // 전체는 문, 3이라는 값 자체는 식
		System.out.println(a);	// 출력'문'
		int b = a = 5; // 전체는 대입'문' or 선언'문'
//		→ a = 5 // 하나의 반환'식' : 값
		
//		문은 결과를 반환하지 않음
//		식은 계산을하고 결과인 '값'을 반환함
		
	}
}
