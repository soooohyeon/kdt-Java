package section02;
// 3. 자료형 타입 - 정수형 ②
public class Type02 {
	public static void main(String[] args) {
		byte num1 = 0110;		// 정수형 byte 타입 변수 num1을 생성하고 값 72 대입
		short num2 = 0107;		// 정수형 short 타입 변수 num2을 생성하고 값 71 대입
		int num3 = 0x46;		// 정수형 int 타입 변수 num3을 생성하고 값 70 대입
		long num4 = 69L;		// 정수형 long 타입 변수 num4을 생성하고 값 69 대입
//		10진수가 아닌 2진수, 8진수, 16진수의 형태로 값을 대입하더라도 기본적인 출력 형태는 10진수
		
		System.out.println(num1);	// num1의 값을 출력하고 줄바꿈함
		System.out.println(num2);	// num2의 값을 출력하고 줄바꿈함
		System.out.println(num3);	// num3의 값을 출력하고 줄바꿈함
		System.out.println(num4);	// num4의 값을 출력하고 줄바꿈함
	}
}
