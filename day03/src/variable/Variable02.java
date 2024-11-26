package variable;
// 2번
public class Variable02 {
	public static void main(String[] args) {
//		① 문자부터 시작
//		int 1num = 10;  // 숫자부터 시작시 오류발생
		int nu1m = 10;
		int num1 = 10;

//		② 특수문자 사용 불가 (단, _와 $ 가능)
//		int @#$% = 10;
		int a$b = 10;
//		int a$b% = 10;
		
//		③ 공백 사용 불가 (단, 카멜표기법 / 스네이크 표기법 등을 활용)
//		int num ber = 10;
		int myAge = 25;		// 카멜 표기법 : 첫 단어 소문자로 시작, 단어가 바뀔 때 첫문자를 대문자로 작성 (변수명, 메소드 명 작성시)
		int my_age = 25;	// 스케이크 표기법 : 첫 단어 소문자로 시작, 단어가 바뀔 때 언더바로 연결 (상수 작성시)
	     int MyAge = 25;	// 파스칼 표기법 : 첫단어 대문자로 시작, 단어가 바뀔 때 첫 문자 대문자로 작성(클래스명 작성시)
	      
//		④ 키워드(예약어) 사용 불가
//		int int = 10;
//		int for = 10;

//		⑤ 되도록 소문자로 시작 (대소문자 구분함)
		int ABC = 100;
		int abc = 200;
		System.out.println(ABC);
		System.out.println(abc);
		
//		⑥ 되도록 의미 있는 단어, 문자를 사용
		
		
//		⑦ 도도록 한글을 사용 X
		
		
	}
}
