package exceptionTest2;
//7. 사용자 정의 에외 클래스
public class MyException extends Exception {	// 예외명 + Exception 해서 예외 클래스 생성
	public MyException() {
		super("음수 입력 불가!!");
	}
}
