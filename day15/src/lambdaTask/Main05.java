package lambdaTask;

public class Main05 {
	public static void main(String[] args) {
//		+)함수형 인터페이스와 람다식을 활용한다.
//			1. 문자열을 넘겨받는다.
//			2. 문자열은 중간 중간 쉼표가 들어가있다.
//			korea, Spain, Germaney, America
//			이 문자열의 쉼표를 느낌표로 바꿔서 출력하는 프로그램을 만들어라	
		Main05 m = new Main05();	// 객체화
//		m 메소드 안에 인터페이스 익명메소드로 구현해둔 오버라이딩 메소드 호출
		System.out.println(m.changeMark().changeChar("korea, Spain, Germaney, America"));
		System.out.println(m.changeMark2().changeChar("korea, Spain, Germaney, America"));
		
	}
//	메소드 로직
//	- 기능 : 알파벳 대소문자 번갈아서 변환하는 메소드
//			띄어쓰기가 나오면 다시 대문자로 시작
//	- 리턴타입 : ChangeInter 인터페이스 그대로 사용
//	- 메소드명 : changeMark 
//	- 코드
//		(1) 문자열 메소드 이용
//		인터페이스 객체명 = 매개변수 -> {
//			.replace() 문자열 메소드 이용
//		}
	ChangeInter changeMark() {
		ChangeInter c = msg -> {
			String replacedMsg = msg.replace(",", "!");
			return replacedMsg;
		};
		return c;
	}
	
//		(2) 아스키코드 이용 (,은 44)
//		인터페이스 객체명 = 매개변수 -> {
//			for (매개변수 길이만큼 반복) {
//				문자형 = 매개변수.charAt(i);
//				결과 += 문자형 == 44 ? "!" : 문자형; }
//			return 결과;
//		};
	ChangeInter changeMark2() {
		ChangeInter c = msg -> {
			String result = "";
			for (int i = 0; i < msg.length(); i++) {
				char charVar = msg.charAt(i);
				result += charVar == 44 ? "!" : charVar + "";
			}
			return result;
		};
		return c;
	}
	
	
	
}
