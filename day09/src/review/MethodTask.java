package review;

public class MethodTask {
//	1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
//	매개변수o, 리턴값o
//	메소드명 : changeSign
	
//	1) 기능생각			> 음수는 양수, 양수는 음수
//	2) 리턴타입 생각		> void
//	3) 메소드명			> changeSign
//	4) 매개변수			> 정수형 타입 1개
//	5) 구현부 실행할 문장 생각	> 매개변수 * -1
//	6) return 매개변수 * -1;
//	7) 리턴타입 변경		> int
	int changeSign (int num) {
//		(1)
//		int result = num * -1;
//		return result;
		
//		(2)
		return num * -1;
	}
	
//	2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
//	매개변수 o, 리턴값 o
//	메소드명 : printName

//	1) 기능생각		> 전달된 정수만큼 이름 출력
//	2) 리턴타입		> void
//	3) 메소드명		> printName
//	4) 매개변수		> 문자열, 정수형 총 2개
//	5) 실행할 문장		> 전달된 정수만큼
//		→ for (int i = 1; i <= num; i++) {
//		  	sysout(name);
//		  }
//	6) 리턴값 생각		> "정수 : " + num + ", 이름 : " + name;
	
	String printName (String name, int num) {
		for (int i = 1; i <= num; i++) {
			System.out.println(name);
		}
		return "정수 : " + num + ", 이름 : " + name;
	}
	
//	3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
//	매개변수o, 리턴값o
//	메소드명 : changeNumber
	
//	1) 리턴타입		> int
//	2) 메소드명		> changeNumber
//	3) 매개변수		> 정수형 1개
//	4) 실행할 문장		> return 삼항연산자
	
	int changeNumber (int num) {
		return num > 10 ? 100 : 1;
	}
	
//	4. 5개의 정수중 평균을 반환하는 메소드
//	매개변수o(배열), 리턴값o
//	메소드명 getAvg
	
//	1) 리턴타입		> void
//	2) 메소드명		> getAvg
//	3) 매개변수		> int[] ar
//	4) 실행할 문장		> 
//		총합 구할 변수
//		반복문 (for-each문)
//		{ 총합 구할 변수 += 반복문 변수 }
//	5) 리턴값 생각		> return (double)총합 변수 / ar.length;
//	6) 리턴타입 변경	> void에서 double
	
	double getAvg (int[] ar) {
		int total = 0;
		for (int num : ar) {
			total += num;
		}
		return (double)total / ar.length;
	}
	
//	5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
//	매개변수o(배열),리턴값 x
//	메소드명 printMinMax

//	1) 리턴타입		> void
//	2) 메소드명		> printMinMax
//	3) 매개변수		> int[] ar
//	4) 실행할 문장		> 최소갑스 최대값을 0번째 인덱스로 저장하고 반복문을 통해 0번재 인덱스와 비교
//		작은 값이 최소값, 큰 값이 최대값
//		최소값과 최대값 출력
	
	void printMinMax (int[] ar) {
//		방법(1)
//		int min = ar[0], max = ar[0];
//		방법(2) 상수 이용(정수형의 최대값을 최소값변수에 대입, 정수형의 최소값을 최대값변수에 대입)
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
//			조건문 사용시 삼항연산자로 작성가능지 확인 후 줄일 수 있음 줄일 것 = 코드 간결화
			min = min > ar[i] ? ar[i] : min;
			max = max < ar[i] ? ar[i] : max;
		}
		System.out.println("최소값 : " + min + ", 최대값 : " + max);
	}
	
//	6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//	BaNanA -> bAnANa
//	메소드명 : changeCase
//	매개변수와 리턴값 자유 => 단, 형변환 이용할 것

//	1) 리턴타입		> void
//	2) 메소드명		> changeCase
//	3) 매개변수		> 문자열 1개
//	4) 실행할 문장		> 
//		문자형 변수1 선언 및 초기화
//		문자열 변수2 선언
//		for (int i = 0; i < 매개변수.length(); i++) {
//			변수1 = 매개변수.charAt(i);
//			if (변수1 >= 97 && 변수1 <= 122) {
//				변수2 +=  (char)(변수1 - 32);
//			} else if (변수1 >= 65 && 변수1 <= 90) {
//				변수2 +=  (char)(변수1 + 32);
//			} esle { 변수2 = "잘못된 값"; } }
//	5) 리턴값 생각		> return 변수2
//	6) 리턴 타입 수정	> String
	
	String changeCase(String str) {
		char c = ' ';
//		문자열 누적으로 계산될때는 ""로 초기화, null도 하나의 값으로 인식
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c >= 97 && c <= 122) {
				result += (char) (c - 32);
			} else if (c >= 65 && c <= 90) {
				result += (char) (c + 32);
			} else {
				result = "잘못된 값입니다";
			}
		}
		return result;
	}
	
//	7. 아이디와 비밀번호를 입력받아 로그인하기
//	매개변수 o, 리턴값 o(boolean 타입)
//	메소드명 : login
//	main메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
//	둘 중 하나라도 틀리면 잘못입력했습니다 출력

//	1) 리턴타입		> boolean
//	2) 메소드명		> login
//	3) 매개변수		> 문자열 타입 2개
//	4) 실행할 문장		> 
//		if (아이디.equals("admin") && 비밀번호.equals("1234")) {
//			return true;
//		} else { return false; }
	boolean login(String id, String pw) {
		if (id.equals("admin") && pw.equals("1234")) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		MethodTask mt = new MethodTask();
		
//		1. 매개변수 o, 리턴 x / 호출 ⇒ sysout(객체명.메소드명(인수));
		System.out.println("1-1번 답 : " + mt.changeSign(7));
		System.out.println("1-2번 답 : " + mt.changeSign(-3));
		
//		2. 매개변수 2개, 리턴 o / 호출 ⇒ sysout(객체명.메소드명(문자열, 정수));
		System.out.println("2번 " + mt.printName("홍길동", 7));
		
//		3. 매개변수 1개, 리턴 o / 호출 ⇒ int 변수 = 객체명.메소드명(정수);
		int number = mt.changeNumber(10);
		System.out.println("3번 답 : " + number);
		
//		4. 매개변수 1개(배열), 리턴 o / 호출 ⇒ double 변수 = 객체명.메소드명(배열);
		int[] ar = {1, 2, 3, 4, 5};
		double avg = mt.getAvg(ar);
		System.out.println("4번 답 : " + avg);
//		System.out.println("4번 답 : " + mt.getAvg({1, 2, 3, 4, 5}));		// 배열값만 집어넣은 것일 뿐 배열을 생성한 것이 아님
		System.out.println("4번 답 : " + mt.getAvg(new int[]{1, 2, 3, 4, 5}));
		
//		5. 매개변수 1개(배열), 리턴 x / 호출 ⇒ 객체명.메소드명(배열);
		System.out.println("-- 5번 답 --");
		mt.printMinMax(ar);
		mt.printMinMax(new int[] {10, 20, -5, 1, 7});
		
//		6. 매개변수 1개(문자열), 리턴 o / 호출 ⇒ sysout(객체명.메소드명(배열));
		System.out.println("6번 답 : " + mt.changeCase("BanANa"));
		
//		7.
		System.out.println("-----7번-----");
		System.out.println(mt.login("admin", "1234"));
		if (mt.login("admin", "1234")) {
			System.out.println("관리자님 환영합니다");
		} else {
			System.out.println("잘못입력했습니다");
		}
	}
}
