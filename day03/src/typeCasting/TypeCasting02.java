package typeCasting;
// 12번 : 자동형변환
public class TypeCasting02 {
	public static void main(String[] args) {
//		1) 작은 자료형에서 큰 자료형으로 변환
//		int → long
		int intVal = 100;
		long result1 = intVal;
		System.out.println(result1);
		
//		int → float
		float result2 = intVal;
		System.out.println(result2);
		
//		int → double
		double result3 = intVal;
		System.out.println(result3);
		
//		float(4byte) → double(8byte)
		double result4 = result2;
		System.out.println(result4);
		
//		2) 연산시 자동 형변환
//		정수 + 실수
		int intVal2 = 10;
		double doubleVal2 = 3.14;
		double result5 = intVal2 + doubleVal2;
//		float보다 double의 자료형이 더 크기 때문에 double에만 붙여주거나 또는 계산식 전체를 감싸줘야함
//		float result5 = intVal2 + (float)doubleVal2 또는 (float)(intVal2 + doubleVal2);
		System.out.println(result5);
		
//		3) 문자형('a')에서 정수형으로 변환 : 아스키코드
//		외울필요 없음, 인터넷에 아스키코드로 검색하면 됨
		char letter1 = 'a';	// a : 97
		int asciival1 = letter1;
		System.out.println(letter1);
		System.out.println(asciival1);
		
		char letter2 = 'A';	// A : 65
		int asciiVal2 = letter2;
		System.out.println(letter2);
		System.out.println(asciiVal2);
		
		char letter3 = '가';	// 가 : 44032
		int asciiVal3 = letter3;
		System.out.println(letter3);
		System.out.println(asciiVal3);
	}
}
