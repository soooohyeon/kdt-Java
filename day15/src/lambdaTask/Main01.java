package lambdaTask;

public class Main01 {
	public static void main(String[] args) {
//		1. 2개의 정수를 매개변수로 받아서 곱한 결과를 반환하는 메소드(람다식 이용)
		
//		익명 클래스 이용해서 오버라이딩
		FunctionalInter01 f1 = new FunctionalInter01() {
			@Override
			public String combineString(String msg1, String msg2) {
				return msg1 + msg2;
			}
		};

//		람다식(익명 메소드) 사용해서 오버라이딩
		FunctionalInter01 f2 = (msg1, msg2) -> msg1 + msg2;
		
		
//		메소드 호출
		System.out.println(f1.combineString("월요일 ", "좋아"));
		System.out.println(f2.combineString("람다식", " 해보자"));
	}
}
