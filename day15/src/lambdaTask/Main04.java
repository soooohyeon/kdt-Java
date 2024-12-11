package lambdaTask;

public class Main04 {
	public static void main(String[] args) {
//		+) 함수형 인터페이스(ChangeInter)와 람다식(Main)을 활용하여 다음과 같은 프로그램을 만든다.
//			1. 문자열을 전달받는다.
//			funny java
//			2. 다음과 같이 변환하여 반환한다.
//			FuNnY JaVa
//			각 단어를 대문자, 소문자로 번갈아서 변환한다.
//			- 띄어쓰기가 나오면 다시 대문자로 시작한다.
		
		Main04 m = new Main04();	// 객체화
//		m 메소드 안에 인터페이스 익명메소드로 구현해둔 오버라이딩 메소드 호출
		System.out.println(m.changeMsg().changeChar("funny java"));
		System.out.println(m.changeMsg().changeChar("anonymous method test"));
	}
//	메소드 로직
//	- 기능 : 알파벳 대소문자 번갈아서 변환하는 메소드
//			띄어쓰기가 나오면 다시 대문자로 시작
//	- 리턴타입 : ChangeInter 인터페이스
//	- 메소드명 : changeMsg
//	코드
//	각 문자를 담을 변수, 결과변수와 띄어쓰기시 다시 대문자로 시작하기 위한 flag 변수 선언 및 초기화
//	for (매개변수 길이만큼 반복) {
//		문자 변수 = 매개변수.chatAt(i);
//		if (flag || 문자 변수 == 32) {
//			결과 변수 += 문자 변수-32;	→ 대문자로 변환해서 담기→
//			flag = false;
//		} else {
//			결과 변수 += 문자 변수;	→ 문자 그대로 담기
//			flag = true; } }
//		return 결과변수; };
//	return ChangeInter 객체
	
	ChangeInter changeMsg() {
		ChangeInter c = msg -> {
			String result = "";
			boolean flag = false;
			for (int i = 0; i < msg.length(); i++) {
				char alpha = msg.charAt(i);
				if (flag || alpha == 32) {
					result += alpha;
					flag = false;
				} else {
//					(1)
//					result += (char)(alpha - 32);
//					(2) String 문자열 클래스 메소드 사용
					result += (alpha + "").toUpperCase();
					flag = true;
				}
			}
			return result;
		};
		return c;
	}
	
}
