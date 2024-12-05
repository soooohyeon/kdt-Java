package methodTask;

import java.util.Scanner;

//JAV탕팀 메소드 문제
public class Task02 {
//	문제 1. 메소드로 계산기 만들기
//		사칙연산 실행
//		조건
//		1차원 2칸짜리 배열 생성
//		사용자로부터 입력 받고(int형) 배열에 저장(for문으로 저장)
//		메소드4개(더하기, 빼기, 곱하기, 나누기)
//		리턴타입 O, 매개변수 O (매개변수는 배열로 전달)
//		-> 더하기 메소드(for-each문 사용)
//		-> 빼기 메소드(큰값 - 작은값)
//		-> 곱하기 메소드(원하시는 대로)
//		-> 나누기 메소드(실수형으로 형변환. 0번 인덱스/1번 인덱스, 0으론 나눌 수 없음.)
//	** 로직
//	메소드 01. 더하기
//		1) 리턴타입 더한 결과 변수로 int
//		2) 메소드명 : add
//		3) 매개변수 : int[] numbers
//		4) 실행할 코드
//			결과 변수 선언 및 초기화
//			for(int num : numbers) {
//				결과 += num; }
//			return 결과;
	int add (int[] numbers) {
		int result = 0;
		for (int num : numbers) {
			result += num;
		}
		return result;
	}
	
//	메소드 02. 빼기
//		1) 리턴타입 두값을 뺸 결과 변수로 int
//		2) 메소드명 : minus
//		3) 매개변수 : int[] numbers
//		4) 실행할 코드
//			결과변수 선언 및 초기화
//			결과 = 0번째 > 1번째 ? 0번째 - 1번째 : 1번째 - 0번쨰;
//			return 결과;
	int minus (int[] numbers) {
		int result = 0;
		result = numbers[0] > numbers[1] ? (numbers[0] - numbers[1]) : (numbers[1] - numbers[0]);
		return result;
	}
	
//	메소드 03. 곱하기
//		1) 리턴타입 두값을 곱한 결과 변수로 int
//		2) 메소드명 : multiply
//		3) 매개변수 : int[] numbers
//		4) 실행할 코드
//			return 0번째 * 1번째;
	int multiply (int[] numbers) {
		return numbers[0] * numbers[1];
	}
	
//	메소드 04. 나누기
//	1) 리턴타입 두값을 나눈 결과 변수로 double
//	2) 메소드명 : divide
//	3) 매개변수 : int[] numbers
//	4) 실행할 코드
//		실수형 결과 변수 선언 및 초기화
//		실수형 배열 생성 및 선언
//		for(매개변수길이만큼 반복) {
//			실수형배열[i] = 매개변수 배열[i];
//		}
//		if (배열[0] == 0 || 배열[1] == 0) {
//			return 0.0;
//		} else {
//			결과 = 배열[0] > 배열[1] ? 배열[0] / 배열[1] : 배열[1] / 배열[0];
//		}
//		return 결과;
	double divide (int[] numbers) {
		double[] numD = new double[2];
		double result = 0.0;
		for (int i = 0; i < numbers.length; i++) {
			numD[i] = numbers[i];
		}
		if (numD[0] == 0 || numD[1] == 0) {
			return 0.0;
		} else {
			result = numD[0] > numD[1] ? numD[0] / numD[1] : numD[1] / numD[0];
		}
		return result;
	}
	
//	====================================================================
	
//	문제 2.메소드를 활용한 연령대별 버스카드 프로그램
//		연령대를 입력받고(입력)
//		연령대를 판별한다(어린이, 청소년, 성인)(메소드1)
//		버스카드에 일정 금액 돈을 충전한다(입력)
//		버스카드를 사용(메소드2){  // int요금과 String연령대가 들어간다(매개변수 2개)
//		   연령대별 요금을 설정한다(final 변수)
//		   잔액 소진할 때까지 버스카드 사용(반복문)
//		   버스카드를 사용하는동안 "버스 탑승 완료." 출력
//		   "버스를 탑니다. 잔액 : " 출력
//		   잔액이 부족해지면 "잔액이 부족합니다." 출력하고 프로그램 종료(탈출)
//		   }
//	** 로직
//	메소드 2개로 생성 → 연령대 판별, 버스카드 사용
//	* 연령대 판별 - 입력받은 연령대가 어디에 속하는지 판별
//	1) 리턴타입 : String
//	2) 메소드명 : selectAgeGroup
//	3) 매개변수 : int 나이
//	4) 실행할 문장
//		if (나이 >= 19 ) { return "성인"; }
//		else if (14 <= 나이 < 19 ) { return "청소년"; }
//		else if (8 <= 나이 < 14 ) { return "어린이"; }
//		else { return = 0; } // 메인메소드에서 입력오류 메세지 출력
	String selectAgeGroup (int age) {
		if (age >= 19) {
			return "성인";
		} else if (14 <= age && age < 19 ) {
			return "청소년";
		} else {
			return "어린이";
		} 
	}
//	* 버스카드 사용 메소드 - 입력받은 충전요금에서 탑승 가능 여부 판별하고 메세지 출력
//	1) 우선 리턴타입 void
//	2) 메소드명 : useTmoney
//	3) 매개변수 : int 충전한 요금, String 연령대
//	4) 실행할 문장
//		상수로 각 연령대별 요금 설정 : 성인 1400, 청소년 900원, 어린이 500원
//		잔액 변수 = 0;
//		while () {
//			if (ageGroup.equals(각 연령대별)) {	 잔액 = 전달받은 충전요금 % 상수 연령대별 요금; }
//			...
//			메세지 출력(버스 탑승완료);
//			메세지 출력(버스를 탑니다 : 잔액변수);
//		}
//			메세지 출력(잔액 부족);

	void useTmoney (int money, String ageGroup) {
		final int ADULT = 1400;
		final int TEEN = 900;
		final int KID = 500;
		int fee = 0;
		fee = ageGroup.equals("성인") ? ADULT : ageGroup.equals("청소년") ? TEEN : KID;
		while (true) {
			money -= fee;
			System.out.println("버스 탑승 완료");
			System.out.println("버스를 탑승 후 잔액 : " + money);
			if (money < fee) {
				System.out.println("잔액이 부족합니다");
				break;
			}
		}
	}
	
//	====================================================================
	
//	문제03. 메소드 회원가입 (메소드로 코드 분리하기)
//		회원가입(입력 : 아이디, 닉네임, 비번, 비번확인)
//		→ 배열로 임의로 아이디와 닉네임 만들기(배열은 1차원 배열, 값은 각 3개)
//		→ 회원가입 시 배열에 있는 아이디를 사용한다고 하면 중복된다고 알려주기
//		→ 닉네임도 겹치면 알려주기
//		→ 비번은 두번 입력 받아 두개의 비번이 동일해야 하며, 아스키코드로 암호화
//		→ 겹치는거 없고, 비번도 다 맞으면 "회원가입 성공" 후 끝
//		→ 최종출력 "userName님 환영합니다, 아이디는 userId, 비밀번호는 암호화된 {아스키코드값} 입니다"
//		└ 배열, 메소드, for문, if문, 형변환
//	** 로직
//	메소드 구분 : 아이디 중복 검사, 닉네임 중복 검사, 비밀번호 일치, 비밀번호 형변환
//	** 아이디 중복 검사 메소드
//	1) 리턴타입 : 우선 void
//	2) 메소드명 : checkId
//	3) 매개변수 : String id
//	4) 실행할 코드
//		결과 변수 선언 및 초기화
//		String 기존ID배열 = {값3개};
//		for (기존ID배열 길이만큼 반복) {
//			결과 = id.equals(기존ID[i]) ? flag : true; 
//			if (flag가 false라면) return flag; }
//	5) 논리형으로 결과 리턴 (중복체크 통과면 true)
	boolean checkId(String id) {
		boolean flag = true;
		String[] memberId = {"abc", "JAVA" , "CrayOnSin"};
			for (int i = 0; i < memberId.length; i++) {
				flag = id.equals(memberId[i]) ? false : flag;
				if (flag == false) {
					return flag;
				}
			}
			return flag;
	}
//	** 닉네임 중복 검사 메소드
//	1) 리턴타입 : 우선 void
//	2) 메소드명 : checkNickName
//	3) 매개변수 : String nickName
//	4) 실행할 코드 (위 아이디 중복체크와 로직 같음)
//		결과 변수 선언 및 초기화
//		String 기존nickName배열 = {값3개};
//		for (기존nickName배열 길이만큼 반복) {
//			결과 = nickName.equals(기존nickName[i]) ? false : flag; }
//			if (flag가 false라면) return flag; }
//	5) 논리형으로 결과 리턴 (중복체크 통과면 true)
	boolean checkNickName(String nickName) {
		boolean flag = true;
		String[] memberNickName = {"JAVA좋아", "코딩연습" , "공부해라"};
			for (int i = 0; i < memberNickName.length; i++) {
				flag = nickName.equals(memberNickName[i]) ? false : flag;
				if (flag == false) {
					return flag;
				}
			}
		return flag;
	}
//	** 비밀번호 일치 여부 확인 메소드
//	1) 리턴타입 : 우선 void
//	2) 메소드명 : checkPw
//	3) 매개변수 : String pw, rePw
//	4) 실행할 코드
//		결과 변수 선언 및 초기화
//		결과 = pw.equals(rePw) ? flag : true;
//	5) 논리형으로 결과 리턴 (중복체크 통과면 true)
	boolean checkPw(String pw , String rePw) {
		return pw.equals(rePw) ? true : false;
	}
//	** 비밀번호 아스키코드로 암호화
//	1) 리턴타입 : 우선 void
//	2) 메소드명 : castingPw
//	3) 매개변수 : String pw
//	4) 실행할 코드
//		결과 변수 선언 및 초기화
//		for (문자열길이 만큼 반복) {
//			결과 += ((int)문자열.charAt(i) + ""); }
//		sysout (암호화된 비밀번호)
//	5) 암호화된 문자형 결과 리턴
	String castingPw (String pw) {
		String result = "";
		for (int i = 0; i < pw.length(); i++) {
			result += ((int)pw.charAt(i) + "");
		}
		return result;
	}
	
//	====================================================================
		

	public static void main(String[] args) {
//		문제 01. 메소드로 계산기 만들기
//		** 로직
//		1) Scanner 클랙스 import
//		2) 메소드 사용을 위한 클래스 객체화
//		3) 입력받을 정수형 2칸짜리 배열 생성 및 선언
//		4) for (배열 길이 만큼 반복) {
//			출력메세지
//			배열[i] = sc.nextInt(); }
//		5) 결과 출력 (덧셈, 뺼셈, 곱셈, 나눗셈)
//			5-1) 덧셈 : "덧셈 결과는 00입니다" 출력 (메소드 사용)
//			5-1) 뺼셈 : "뺄셈 결과는 00입니다" 출력 (메소드 사용)
//			5-1) 곱셈 : "곱셈 결과는 00입니다" 출력 (메소드 사용)
//			5-1) 나눗셈
//				나눗셈 메소드 값 == 0.0 ? "0으로는 나눌 수 없습니다" 출력 : "나눗셈 결과는 00입니다" 출력;
//		Task02 t = new Task02();
//		Scanner sc = new Scanner(System.in);
//		int[] numbers = new int[2];
//		String result = "";
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.printf("정수%d 입력 : ", i+1);
//			numbers[i] = sc.nextInt();
//		}
//		
//		result = "덧셈 결과는 " + t.add(numbers) + " 입니다.";
//		System.out.println(result);
//		result = "뺄셈 결과는 " + t.add(numbers) + " 입니다.";
//		System.out.println(result);
//		result = "곱셈 결과는 " + t.add(numbers) + " 입니다.";
//		System.out.println(result);
//		result = t.divide(numbers) == 0.0 ? "0은 나눌 수 없습니다." : "나눗셈 결과는 " + t.divide(numbers) + " 입니다.";
//		System.out.println(result);
		
//		문제 02. 메소드를 활용한 연령대별 버스카드 프로그램
//		** 로직
//		1) Scanner 클랙스 import
//		2) 메소드 사용을 위한 클래스 객체화
//		3) 나이, 요금 변수 선언 및 초기화
//		4) 메세지 출력 및 나이 입력받고 값 저장
//			1 ~ 7 무료 탑승, 0 이하는 잘못된 입력으로 출력
//		5) 나이 판별 메소드 사용해서 값 구하고 교통카드 사용 메소드에 다시 값 사용
//		Task02 t = new Task02();
//		Scanner sc = new Scanner(System.in);

//		int age = 0, money = 0;
//		System.out.print("나이 입력 : ");
//		age = sc.nextInt();
//		if (age < 8 && age > 0) {
//			System.out.println("무료입니다.\n탑승하세요.");
//		} else if (age <= 0) {
//			System.out.println("잘못된 입력입니다.");
//		} else {
//			System.out.print("충전 요금 입력 : ");
//			money = sc.nextInt();
//			t.useTmoney(money, t.selectAgeGroup(age));
//		}
		
//		문제 03. 메소드 회원가입 (메소드로 코드 분리하기)
//		** 로직
//		1) Scanner 클랙스 import
//		2) 메소드 사용을 위한 클래스 객체화
//		3) 입력받을 아이디, 닉네임, 비밀번호 2개 변수 선언
//		4) while 무한 반복
//		5) id 값이 없다면 입력받기
//		6) id 중복검사 (메소드 사용)
//			6-1) id 중복이 있다면 id 변수 비우고 중복 메세지 출력
//			6-2) id 중복이 없다면 닉네임 빈문자열일 때 입력 받고 중복 검사 (메소드 사용)
//			6-3) 닉네임 중복이 있다면 닉넴임 변수 비우고 중복 메세지 출력
//			6-4) 닉네임 중복이 아니라면 비밀번호 2번 입력 받고 일치 검사 (메소드 사용)
//			6-5) 비밀번호가 일치하지 않다면 불일치 메세지 띄우고 비밀번호 변수 비우고 입력받기
//			6-6) 비밀번호가 일치하다면 결과 출력
		Task02 t = new Task02();
		Scanner sc = new Scanner(System.in);
		
		String id = "", nickName = "", pw = "", rePw = "";
		while (true) {
			if (id.equals("")) {	// 아이디 중복 통과 후 닉네임 중복시 되돌아 오는 것 방지
				System.out.print("아이디 입력 : ");
				id = sc.next();
			}
			if (t.checkId(id)) {	// 아이디 중복 통과
				if (nickName.equals("")) { 	// 닉네임 중복 통과 후 비밀번호 불일치시 되돌아 오는 것 방지
					System.out.print("닉네임 입력 : ");
					nickName = sc.next();
				}
				if (t.checkNickName(nickName)) {	// 닉네임 중복 통과
					System.out.print("비밀번호 입력 : ");
					pw = sc.next();
					System.out.print("비밀번호 재입력 : ");
					rePw = sc.next();
					if (t.checkPw(pw, rePw)) {	// 비밀번호 일치
						System.out.println(nickName + "님 환영합니다, 아이디는 " + id 
								+ ", 비밀번호는 암호화된 " + t.castingPw(pw) + "입니다.");
						break;
					} else {	// 비밀번호 불일치
						pw = "";
						rePw = "";
						System.out.println("비밀번호가 일치하지 않습니다.\n");
					}
				} else {	// 닉네임 중복
					nickName = "";
					System.out.println("중복된 닉네임 입니다.\n");
				}
			} else {	// 아이디 중복
				id = "";
				System.out.println("중복된 아이디 입니다.\n");
			}
		}
		sc.close();
	}
	
}
