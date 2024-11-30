package section02;
//3. 자료형 타입 - 실수형 ② : 정밀도 확인
public class Type04 {
	public static void main(String[] args) {
		double pieDouble = 3.141592653589793;	// 실수형 double 타입 변수 선언 및 초기화
		float pieFloat = 3.141592653589793f;	// 실수형 float 타입 변수 선언 및 초기화
		
		System.out.println("double : " + pieDouble);	// () 안 데이터 출력하고 줄바꿈함, 소수점 15번째까지 출력
		System.out.println("float : " + pieFloat);		// () 안 데이터 출력하고 줄바꿈함, 소수점 7번째까지 출력
//		double과 float은 정밀도 차이로 기본적으로 double을 사용함.
	}
}
