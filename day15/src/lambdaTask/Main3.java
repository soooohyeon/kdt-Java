package lambdaTask;

public class Main3 {
	public static void main(String[] args) {
//		3. 두 문자열을 입력받아 첫 번째 문자열을 두 번째 문자열의 길이만큼 잘라내는 프로그램을 만든다.
//		ex)
//		첫 번째 : abcde
//		두 번째 : 가나다
//		결과 : de
		
//		익명클래스 사용해서 메소드 오버라이딩
		SubInter s1 = new SubInter() {
			@Override
			public String cutString(String msg1, String msg2) {
				String result = "";
				
//				(1) 문자열 메소드 substring((해당인데스-1)부터)사용
//				result = msg1.substring(msg2.length());
				
//				(2) for문 사용
				for (int i = msg2.length(); i < msg1.length(); i++) {
					result += (msg1.charAt(i) + "");
				}
				
				return result;
			}
		};
		
		System.out.println(s1.cutString("abcdefg", "aaa"));
		System.out.println();
		
		Main3 m = new Main3();
		String result1 = m.checkAlphabet("F").cutString("안녕하세요", "aa");
		String result2 = m.checkAlphabet("B").cutString("자바공부중입니다", "a");
		String result3 = m.checkAlphabet("c").cutString("asdfasd", "aaaa");
		System.out.println("F 입력시 : " + result1);
		System.out.println("B 입력시 : " + result2);
		System.out.println("다른 문자 입력시 : " + result3);
		
	}
//	(2) Main2.java(클래스)에 다음과 같은 static 메소드를 선언한다.
//    - 매개변수로 문자열을 전달받는다.
//    - 전달받은 문자열이 "F"면 앞에서 자르고 "B"면 뒤에서 자르는 람다식을 만든다.
//    작성된 람다식을 SubInter 타입의 변수에 저장하여 반환하는 메소드를 만든다.
	
//	구현할 메소드 로직
//	1. 결과를 담을 문자열 변수 선언 및 초기화
//	2. 문자열 길이를 담을 변수 선언해서 msg2의 문자열 길이를 담음
//	3. 매개변수가 F일 때 ? msg1.substring() : msg2가 B일 때 ? msg1.substring() : "잘못된 입력입니다"
//	** 문자열 메소드 substring(시작인덱스, 끝인덱스-1까지)사용
//	** 문자열 메소드 substring(해당 인데스 부터)사용
	SubInter checkAlphabet (String alphabet) {
		SubInter s2 = (msg1, msg2) -> {
			int lengthF = msg2.length();
			int lengthB = msg1.length() - msg2.length();
			return alphabet.equals("F") ? msg1.substring(lengthF) : alphabet.equals("B") ? msg1.substring(0, lengthB) : "잘못된 입력입니다";
		};
		return s2;
	}
}
