package task;

import java.util.Scanner;

//16. 메소드 실습 과제
public class MethodTask {
//	1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
//		매개변수 o, 리턴값 o	
//		메소드명 : changeSign
//	** 로직
//	1) 정수를 리턴하고 정수를 매개변수로 전달받는 메소드 생성
//	2) 리턴 -(입력받은 수);
	
	int changeSign (int num) {
		return -num;
	}
	
//	2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
//		매개변수 o, 리턴값 o	
//		메소드명 : printName
//	** 로직
//	1) 문자열을 리턴하고, 이름과 정수를 매개변수로 전달받는 메소드 생성
//	2) 리턴할 문자열 선언 및 초기화
//	3) for (int i = 1; i <= 전달받은 정수; i++) {
//	4) 		변수 += (전달받은 문자열 + "\n") }
//	5) 리턴 변수;
	
	String printName (String name, int num) {
		String result = "";
		for (int i = 1; i <= num; i++) {
			result += name + "\n";
		}
		return result;
	}
	
//	3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
//		매개변수 o, 리턴값 o	
//		메소드명 : changeNumber
//	** 로직
//	1) 리턴값은 정수, 매개변수는 정수 1개인 메소드 생성
//	2) if (전달받은 정수  <= 10) {
//	3) 		리턴 1; 	
//	4) } else {
//	5)		리턴 100; }
	
	int changeNumber (int num) {
		if (num <= 10) {
			return 1;
		} else {
			return 100;
		}
	}
	
	
//	4. 5개의 정수 중 평균을 반환하는 메소드
//		매개변수 o(배열), 리턴값 o	
//		메소드명 : getAvg
//	** 로직
//	1) 리턴값은 실수, 매개변수는 정수 배열인 메소드 생성
//	2) 실수인 평균 변수와 정수인 합계 변수 선언 및 초기화
//	3) for (배열의 길이만큼 반복) {
//	4) 		합계 변수 = 배열[i]; }
//	5) 평균변수 = (double)합계 / 배열길이;
//	6) 리턴 평균변수;
	
	double getAvg (int[] numbers) {
		int total = 0;
		double avg = 0;
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		avg = (double)total / numbers.length;
		return avg;
	}
	
//	5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
//		매개변수 o(배열), 리턴값 x	
//		메소드명 : printMinMax
//	** 로직
//	1) 리턴값이 없으므로 void, 매개변수는 정수 배열인 메소드 생성
//	2) 최대값, 최소값을 담을 변수 선언 및 배열명[0] 값 담아두기
//	3) for (배열의 길이만큼 반복) {
//	4) 		if (최소값 > 배열[i]) {
//	5) 			최소값 = 배열[i]; }
//	6)		if (최대값 < 배열[i]) {
//	7)			최대갑 = 배열[i]; } }
//	8) sysout(최소값);
//	9) sysout(최대값);
	
	void printMinMax (int[] numbers) {
		int min = numbers[0], max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
	}

//	6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//		매개변수와 리턴값 자유 → 단, 형변환 이용할 것
//		메소드명 : changeCase
//		[출력 예시]
//			BaNanA → bAnANa
//	** 로직
//	*** 대문자 : 65 ~ 90, 소문자 : 97 ~ 122
//	1) 리턴값과 매개변수가 문자열인 매소드 생성
//	2) 결과값을 담을 문자열 변수와 각 문자열의 문자형을 담을 배열 변수 선언 및 초기화
//	3) for (받은 문자열의 길이만큼 반복) {		→ 문자열 길이 구하는 메소드 = 변수명.length()a
//	4) 		문자형 변수 = 받은 문자열.charAt(i); 
//	5)		if (문자형 변수 >= 65 && 문자형 변수 <= 97) {
//	6) 			결과 += (문자형 + 32) + "" 
//	7)		} else if (문자형 변수 >= 97 && 문자형 변수 <= 122) {
//	8) 			결과 += (문자형 - 32) + "" } }
//	9) return 결과;
	
	String changeCase (String message) {
		String result = "";
		char alphabet = ' ';
		for (int i = 0; i < message.length(); i++) {
			alphabet = message.charAt(i);
			if (alphabet >= 65 && alphabet <= 90) {
				result += (char)(alphabet + 32);
			} else if (alphabet >= 97 && alphabet <= 122) {
				result += (char)(alphabet - 32);
			}
		}
		return result;
	}
		
//	7. 아이디와 비밀번호를 입력받아 로그인하기
//		매개변수 o, 리턴값 o(boolean 타입)
//	   	메소드명 : login
//	   	main메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
//	      	둘 중 하나라도 틀리면 잘못입력했습니다 출력
//	**  로직
//	1) 리턴타입이 boolean, 매개변수가 문자열 2개인 메소드 생성
//	2) "admin"과 "1234" 상수 변수로 선언
//	3) if (아이디.eqauls(관리자 id)) {			→ 아이디 일치할 때 비밀번호 검사
//	4) 		if (비밀번호.eqauls(관리자 pw)) {	→ 비밀번호 일치시
//	5) 			returm true;				→ true
//	6) 		} else {						→ 비밀번호 불일치시
//	7)	 		returm false; }				→ false
//	8) 	} else {							→ 아이디 불일치시
//	9) 		returm false; }					→ fasle
	
	boolean login (String id, String pw) {
		final String ADMIN_ID = "admin";
		final String ADMIN_PW = "1234";
		if (id.equals(ADMIN_ID)) {
			if (pw.equals(ADMIN_PW)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
//		구현한 메소드를 사용하기위해 지정해줌
		MethodTask mt = new MethodTask();
		
//		1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
		System.out.println(mt.changeSign(-1));
		System.out.println(mt.changeSign(7));
		
//		2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
		System.out.print(mt.printName("홍길동", 5));
		
//		3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
		System.out.println(mt.changeNumber(7));
		System.out.println(mt.changeNumber(38));
		
//		4. 5개의 정수중 평균을 반환하는 메소드
		int numbers1[] = {4, 7, 2, 9, 5};
		System.out.println("배열의 평균 : " + mt.getAvg(numbers1));
		
//		5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
		int numbers2[] = {4, 7, 2, 9, 5, 10, -1};
		mt.printMinMax(numbers2);
		
//		6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
		System.out.println(mt.changeCase("BaNAnA"));
		System.out.println(mt.changeCase("hElLO JavA"));
		
//		7. 아이디와 비밀번호를 입력받아 로그인하기
//		** 로직
//		*** boolean형으로 값을 받기 떄문에 if문 사용
//		1) Scanner 클래스 import
//		2) 아이디와 비밀번호 생성 및 초기화
//		3) 아이디와 비밀번호 입력받고 변수에 담기
//		4) 논리형 타입 변수 선언 및 login 메소드 담기
//		5) if (변수) {
//		6) 		'관리자님 환영합니다' 출력;
//		7) } else {
//		8) 		'잘못 입력하셨습니다' 출력; }
//		9) Scanner 클래스 종료
		
		Scanner sc = new Scanner(System.in);
		String userId = null, userPw = null;
		System.out.print("아이디를 입력하세요 : ");
		userId = sc.next();
		System.out.print("비밀번호를 입력하세요 : ");
		userPw = sc.next();
		boolean isTrue = mt.login(userId, userPw);
		if (isTrue) {
			System.out.println("관리자님, 환영합니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		sc.close();
	}
}
