package exceptionTask;

public class AccountException extends Exception {
//	사용자 예외 정의 클래스
//	AccountException extends Exception
	public AccountException (String msg) {
//		예외문구를 매개변수로 전달받아서 매개변수있는 생성자 생성
		super(msg);
	}
}
