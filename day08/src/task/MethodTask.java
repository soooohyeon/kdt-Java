package task;
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
	
//	6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//		매개변수와 리턴값 자유 → 단, 형변환 이용할 것
//		메소드명 : changeCase
//		[출력 예시]
//			BaNanA → bAnANa
	
	
//	7. 아이디와 비밀번호를 입력받아 로그인하기
//		매개변수 o, 리턴값 o(boolean 타입)
//	   	메소드명 : login
//	   	main메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
//	      	둘 중 하나라도 틀리면 잘못입력했습니다 출력
	
	public static void main(String[] args) {
//		구현한 메소드를 사용하기위해 지정해줌
		MethodTask mt = new MethodTask();
		
//		1.
		System.out.println(mt.changeSign(-1));
		System.out.println(mt.changeSign(7));
		
//		2.
		System.out.println(mt.printName("홍길동", 5));
		
//		3.
		System.out.println(mt.changeNumber(7));
		System.out.println(mt.changeNumber(38));
		
//		4.
		
	}
}
