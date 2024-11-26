package typeCasting;
// 11번 : 강제 형변환
public class TypeCasting01 {
	public static void main(String[] args) {
//		형변환 연산자인 (자료형)을 사용하여 강제 형변환함
//		큰 자료형 → 작은 자료형 일 때 사용하며 데이터 손실이 발생할 수도 있음
//		컴파일러는 명시적인 강제 변환이 없으면 오류 발생
		
//		1) 실수 → 정수
		double num1 = 3.141592;
		int result1 = (int)num1;
		System.out.println("실수형 num1의 값: " + num1 + ", 형변환된 값 : " + result1);

//		2) 큰 범위 정수 → 작은 범위 정수
		long num2 = 10000L;			// 8byte
		int result2 = (int)num2;	// 4byte
		System.out.println("long타입 num2의 값 : " + num2 + ", int타입으로 형변환된 값 : " + result2);

//		3) 범위 초과
		long num3 = 2147483648L;
		int result3 = (int)num3;
		System.out.println("long타입 num3의 값 : " + num3 + ", 값의 왜곡된 값 : " + result3);
//		음수가 나타나는 이유
//		Overflow 원리
//		int의 범위는 32bit 자료형, 값의 범위가 -2,147,483,648 ~ 2,147,483,647
//		long에서 int 변환
//		2,147,483,648은 int 범위를 초과하므로 상위 비트(초과된 비트)가 잘리게 됨
//		잘린 값은 2의 보수 형식으로 계산되며 음수 값으로 변환됨
//		1000 0000 0000 0000 0000 0000 0000 0000 (32비트)
		
//		값 왜곡은 작은 자료형으로 형 변환 시 발생할 수 있는 문제이고 강제 형변호나은 값의 범위를 초과하지 않을 때만 사용해야함
//		필요한 경우에는 변환하기 전에 범위를 확인해야함
	}
}
