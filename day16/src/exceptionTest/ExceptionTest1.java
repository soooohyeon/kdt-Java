package exceptionTest;
//1. Exception basic
public class ExceptionTest1 {
	public static void main(String[] args) {
		System.out.println("시작");
		
		int result = 10 / 0;
//		java.lang.ArithmeticException: / by zero
		System.out.println(result);	// 실행 예외 - 0으로 나눌 수 없음
		
		System.out.println("종료");
	}
}
