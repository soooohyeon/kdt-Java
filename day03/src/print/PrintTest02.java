package print;
// 8번
public class PrintTest02 {
	public static void main(String[] args) {
//		정수형
		int num1 = 200;
		System.out.printf("10진수 : %d\n", 100);	// 10진수 값 출력
		System.out.printf("10진수 : %d\n", num1);	// 10진수 값 출력
		System.out.printf("8진수 : %o\n", 8);		// 8진수 10 값 출력
//		377 / 8 = 47···1, 47 / 8 = 5···7 → 순서대로 571·
		System.out.printf("8진수 : %o\n", 377);	// 8진수 571 값 출력
		System.out.printf("16진수 : %x\n", 0xff);	// 16진수의 ff 값 출력
		System.out.printf("16진수 : %x\n", 15);	// 10 → a, 15 → f
//		26 / 16 = 1···10, 10 = a → 순서대로 1a
		System.out.printf("16진수 : %x\n", 26);	// 1a 출력
		
//		실수형
//		소수점 이하 6자리까지 정확히 나옴, 7자리 이상되면 7번째 자리에서 반올림
		System.out.printf("실수형 : %f\n", 3.1415926535);
		System.out.printf("실수형 소수점 2자리까지 : %.2f\n", 3.1415926535);
		
//		문자형
		System.out.printf("문자형 : %c\n", 'a');
		System.out.printf("문자형 : %c\n", 'A');
		
//		문자열
//		논리형도 문자열로 사용
		System.out.printf("문자열 : %s\n", "hello");
		String data = "Hello, Java";
		System.out.printf("문자열 : %s\n", data);
//		문자열에서 .n 형태로 쓰게 되면 해당 자리수까지만 문자열이 출력됨
		System.out.printf("문자열 : %.5s\n", data);
		
//		복합 사용
		int age = 20;
		String name = "김철수";
		double date = 11.25;
		boolean isStudy = true;
		System.out.printf("이름 : %s, 나이 : %d, 오늘 날짜 : %.2f, 공부 중 여부 : %s", name, age, date, isStudy);
	}
}
