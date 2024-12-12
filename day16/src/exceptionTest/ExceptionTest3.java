package exceptionTest;
//3. Exception basic : 예외 메소드 사용
public class ExceptionTest3 {
	public static void main(String[] args) {
		ExceptionTest3 et = new ExceptionTest3();
		System.out.println("프로그램 시작");
		et.printLength("JAVA");
		et.printLength(null);
		System.out.println("프로그램 종료");
	}
	public void printLength(String data) {
		try {
			int result = data.length();
//		data의 값의 null이 들어오면 NullPointerException 발생
			System.out.println("글자 수 : " + result);
		} catch (NullPointerException e) {	// NullPointerException의 객체 e
//			System.out.println("null 값은 입력 불가능");
			
//			예외 정보를 얻는 방법 3가지
//			1. e.toString, e ⇒ 예외 종류(클래스)와 발생한 이유 반환
//			System.out.println(e);
////			java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
////			기존의 참조변수와 같이 참조값이 출력된는게 아닌 클래스 위치와 에러 이유가 나옴
//			
//			System.out.println(e.toString());
			
//			2. e.getMessage() ⇒ 예외가 발생한 이유만 반환
//			System.out.println(e.getMessage());
			
//			3. e.printStackTrace(); ⇒ 예외가 어디서 발생했는지 추적한 내용까지 출력
//			e.printStackTrace(); // ⇒ 평소 예외 발생시 해당 코드가 실행되고 있음을 알 수 있음
		} catch (Exception e) {
//			try에서 어떤 오류가 발생될지 전부 예상하기 힘듬
//			예상치 못한 오류를 잡기위해 부모클래스인 Exception타입의 매개변수 사용
//			모든 예외 클래스의 조상은 Exception
//			즉, 어떤 예외가 발생하더라도 Exception타입의 참조변수에 저장가능 (⇒ 업캐스팅)
			System.out.println("오류 발생");
		}
	}
}
