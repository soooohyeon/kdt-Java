package exceptionTest;
//2. Exception basic 예외 처리
public class ExceptionTest2 {
	public static void main(String[] args) {
		ExceptionTest2 et = new ExceptionTest2();
		et.printLength("JAVA");
		
//		java.lang.Error
//		et.printLength(0.5);	// 매개변수 타입 에러
		
//		java.lang.NullPointerException → NPE, null로 인한 예외
		et.printLength(null);
	}
	public void printLength(String data) {
		int result = data.length();
		System.out.println("글자 수 : " + result);
	}
}
