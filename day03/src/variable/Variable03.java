package variable;
// 4번
public class Variable03 {
	public static void main(String[] args) {
//		정수형 int : 4byte, 범위 : -2,147,483,648 ~ 2,147,483,647 (32비트 정수)
//		정수형 long : 8byte, 범위 : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (64비트 정수)
		int intVal = -2147483648;
		System.out.println(intVal);
//		int intMinVal = -2147483649;  // 저장공간을 벗어났기 때문에 오류 발생
//		int intMaxVal = 2147483648;  // 저장공간을 벗어났기 때문에 오류 발생
		long longVal = 2147483648L;
		System.out.println(longVal);
		
//		실수형 double : 8byte, 소수점 15자리 이하 → 더 높은 정밀도와 넒은 범위의 실수를 표현
//		실수형 float : 4byte, 소수점 6~7자리 이하 → 메모리를 더 적게 사용하지만 정밀도가 낮아 계산 오차 발생 가능성 있음
		double doubleVal = 3.141592653589793;
		System.out.println(doubleVal);
		float floatVal = 3.1415926f;
		System.out.println(floatVal);
		
//		계산 오차 확인
		double doubleSum = 0.1 + 0.2;
		float floatSum = 0.1f + 0.2f;
		System.out.println(doubleSum);
		System.out.println(floatSum);
		
//		논리형 boolean : 1byte, true / false
		boolean isJava = true;
		System.out.println("JAVA 공부중이신가요? " + isJava);
//		문자열 뒤 +는 문자열 연결
		
//		문자형 char : '' 작은 따옴표로 표현
		char grade = 'A';
		System.out.println("Java 학점 : " + grade);
		
//		문자열 String : "" 큰 따옴표로 표현
		String myName = "홍길동";
		System.out.println("제 이름은 " + myName + "입니다.");
	}
}
