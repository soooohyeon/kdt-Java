package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// Day05 복습 과제 (로직 구성 및 코드 작성) - 작성 후 메모장으로 보낼 것
public class Task {
	public static void main(String[] args) {
//		Scanner 클래스 import
		Scanner sc = new Scanner(System.in);
		
//      1. 한개의 정수를 입력받아 짝수인지 홀수인지 출력하기
//      입력 : 8
//      출력 : 짝수입니다
//		** 로직
//		1) 입력받을 정수 변수, 결과 변수(삼항연산자 사용) 생성
//		2) 출력메세지 및 정수 입력받고 변수에 담기
//		3-1) 결과 출력 : if-else문 사용(정수 % 2 == 0 → true > 짝수입니다, false > 홀수입니다)
//		3-2) 결과 출력 : 삼항연산자 사용
//		4) 버퍼비우기

//		int num1 = 0;
////		↓ 삼항연산자 이용해서 출력시 사용
//		String result1 = "";
//		System.out.print("정수 입력 : ");
//		num1 = sc.nextInt();
////		3-1) 출력
//		if (num1 % 2 == 0) {
//			System.out.println(num1 + "은 짝수입니다.");
//		} else {
//			System.out.println(num1 + "은 홀수입니다.");
//		}
////		3-2) 출력
//		result1 = num1 % 2 == 0 ? num1 + "은 짝수입니다." : num1 + "은 홀수입니다.";
//		System.out.println(result1);
//		sc.nextLine();

//      2. 한개의 정수를 입력받아 양수, 음수, 0인지 출력하기
//      입력 : -5
//      출력 : 음수입니다
//      	입력 : 100
//      	출력 : 양수입니다
//
//      	입력 : 0
//      	출력 : 0입니다
//		** 로직
//		1) 입력받을 정수 변수, 결과 변수(삼항연산자 사용) 선언 및 초기화
//		2) 출력 메세지 및 정수 입력받고 변수에 저장
//		3-1) 결과 출력 : if-else if-else문 사용 (정수 > 0, 정수 < 0)
//		3-2) 결과 출력 : 삼항연산자 사용 (정수 > 0, 정수 < 0)
//		4) 버퍼 비우기

//		int num2 = 0;
////		↓ 삼항연산자 이용해서 출력시 사용
//		String result2 = "";
//		System.out.print("정수 입력 : ");
//		num2 = sc.nextInt();
////		3-1) 출력
//		if (num2 > 0) {
//			System.out.println("양수입니다.");
//		} else if (num2 < 0) {
//			System.out.println("음수입니다.");
//		} else {
//			System.out.println("0 입니다.");
//		}
////		3-2) 출력
//		result2 = num2 > 0 ? "양수입니다." : num2 < 0 ? "음수입니다." : "0 입니다.";
//		System.out.println(result2);
//		sc.nextLine();
			
//      3. 나이를 입력받아 다음 기준으로 출력하기
//         0~12: 어린이
//         13~19: 청소년
//         20 이상: 성인
//
//      나이입력 : 16
//      청소년입니다
//		** 로직
//		1) 나이를 입력받을 변수 선언 및 초기화
//		2) 출력메세지 및 나이 입력받고 나이 변수에 저장
//		3-1) if-else if-else문 사용해서 결과 출력 (0<=나이 && 나이<=12, 어린이)
//		3-2) if-else if-else문 사용해서 결과 출력 (13<=나이 && 나이<=19, 청소년)
//		3-3) if-else if-else문 사용해서 결과 출력 (0 > 나이, 잘못된 입력)
//		3-4) if-else if-else문 사용해서 결과 출력 (20<=나이, 성인)
//		4) 버퍼 비우기
		
//		int age = 0;
//		System.out.print("나이 입력 : ");
//		age = sc.nextInt();
//		if (0 <= age && age <= 12) {
//			System.out.println("어린이입니다.");
//		} else if (13 <= age && age <= 19) {
//			System.out.println("청소년입니다.");
//		} else if (age < 0){
//			System.out.println("잘못된 입력입니다.");
//		} else {
//			System.out.println("성인입니다.");
//		}
//		sc.nextLine();

//      4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기(단, 삼항연산자만 이용할 것)
//         입력 : 5 1 9
//         출력 : 1 5 9
//		** 로직
//		1) 입력받을 3개의 정수와 대소 비교하고 담을 3개의 정수 선언 및 초기화
//		2) 출력 메세지 및 정수 3개 입력받고 변수에 담기
//		3) 삼항연산자 이용해서 대소 비교 후 결과 값 담기
//		4) 결과 출력
//		5) 버퍼 비우기
		
//		int num3 = 0,  num4 = 0, num5 = 0, minNum = 0, midNum = 0, maxNum = 0, sum = 0;
//		System.out.print("정수 3개 입력 : ");
//		num3 = sc.nextInt();
//		num4 = sc.nextInt();
//		num5 = sc.nextInt();
//		sum = num3 + num4 + num5; // 총 합 구하고 아래 최대값, 최소값을 빼면 중간 값이 나옴
//		minNum = num3 > num4 ? num4 > num5 ? num5 : num4 : num3 > num5 ? num5 : num3;
//		maxNum = num3 > num4 ? num5 > num3 ? num5 : num3 : num5 > num4 ? num5 : num4;
//		midNum = sum - minNum - maxNum;
//		System.out.println("출력 : " + minNum + " " + midNum + " " + maxNum);
//		sc.nextLine();
		
//      4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기
//      입력 : 5 1 9
//      출력 : 1 5 9
//		+) 정수 외 값 입력시 예외처리, 배열, for문 사용
//		++) 사용자가 입력한 값 중 최소, 최대 구하기, 몇 번째 입력한 값인지도 출력
//		1. Scanner 클래스 import
//		2. 입력받은 정수를 담을 배열 선언, 최대/최소 변수 선언 및 초기화
//		3. 출력 메세지 및 입력받은 값 담기 (for문 사용)
//			- 정수 외 값 입력시 예외처리 후 종료
//		4. 최대/최소 변수에 인덱스 0번째 값 담기
//		5. 배열길이 만큼 반복 돌려서 최대보다 크다면 최대에 담고, 최소보다 작다면 최소에 담기
//		6. Arrays 클래스의 sort() 이용해서 정렬
//		7. 빠른 for문 사용해서 결과 출력
//		7. Scanner 클래스 종료
//		int max = 0, min = 0;
//		int[] number = new int[3];
//		try {
//			for (int i = 0; i < number.length; i++) {
//				System.out.print((i + 1) + "번째 정수 입력 : ");
//				number[i] = sc.nextInt();
//			}
//			max = number[0];
//			min = number[0];
//			for (int i = 0; i < number.length; i++) {
//				max = max < number[i] ? number[i] : max;
//				min = min > number[i] ? number[i] : min;
//			}
//			Arrays.sort(number);
//			for (int data : number) {
//				System.out.print(data + " ");
//			}
//			System.out.println();
//			System.out.println("최대 : " + max + "\n최소 : " + min);
//			
//			System.out.println();
//		} catch (InputMismatchException e) {
//			System.out.println(e.toString() + " 에러 입니다.");
//		}
//		sc.close();
		
//		++) 사용자가 입력한 값 중 최소, 최대 구하기, 몇 번째 입력한 값인지도 출력,
//		    정수 외 값이 입력되면 예외 처리하고 (잘못된 입력입니다) 출력, 무한 입력받다가 0 입력시 종료
//		1. Scanner 클래스 import, 객체화
//		2. 입력받은 정수를 담을 List 선언, 최대/최소/번호(2개) 변수 선언 및 초기화
//		3. 출력 메세지 및 입력받은 값 담기 (While문 사용)
//			- 정수 외 값 입력시 예외처리 후 (잘못된 입력입니다) 출력
//			- if (입력값 == 0 && 입력값 개수 >= 2) 이면 break;
//			- else if (입력값 == 0 && 입력값 개수 < 2) 이면 (비교할 값 입력해주세요) 출력
//			- else if (입력값 != 0) 일 때 List에 입력값 담기
//		4. 입력받은 List를 인수로 최대최소 구분하는 메소드 호출해서 배열에 담기
//		5. 결과 출력
//		6. Scanner 클래스 종료
		Task t = new Task();
		ArrayList<Integer> numbers = new ArrayList<>();
		while (true) {
			System.out.print("정수 입력 (0 입력시 종료) : ");
			try {
				int num = sc.nextInt();
				if (num == 0 && numbers.size() >= 2) {
					System.out.println("입력 종료");
					break;
				} else if (num == 0 && numbers.size() < 2) {
					System.out.println("비교할 값을 입력해주세요");
				} else if (num != 0) {
					numbers.add(num);
				}
			} catch (InputMismatchException e) {
				sc = new Scanner(System.in);			// Scanner 버그로 초기화
				System.out.println("잘못된 입력입니다.");
			}
		}
		if (numbers.size() >= 2) {
			int[][] result = t.checkMaxMin(numbers);
			numbers.stream().sorted().forEach(n -> System.out.print(n + " "));
			System.out.println();
			System.out.println((result[0][0] + 1) + "번째 입력한 최대 : " + result[0][1]);
			System.out.println((result[1][0] + 1) + "번째 입력한 최소 : " + result[1][1]);
		}
		
		
//      5. 사용자로부터 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지를 출력하고 그 외에는 입력한 문자열을 출력하기
//		** 로직
//		1) 입력받을 문자열 변수 선언 및 초기화
//		2) 출력메세지 및 입력받을 문자열 변수에 담기
//		3) while (!(문자열.equals("X"))) {
//		4) 입력받은 문자열 출력
//		5) 다시 입력 받을 츌력메세지와 입력 메소드
//		6) while 문 종료시 출력할 종료 메세지
		
//		String message = "";
//		System.out.print("메세지를 입력하세요 : ");
//		message = sc.nextLine();
//		while (!message.equals("X")) {
//			System.out.println(message);
//			System.out.print("메세지를 입력하세요 : ");
//			message = sc.nextLine();
//		}
//		System.out.println("종료되었습니다.");
		
//      6. 사용자가 입력한 숫자에 해당하는 구구단을 출력하기
//      단을 입력하세요 : 3단
//      출력
//      3 x 1 = 3
//      3 x 2 = 6
//      ...
//      3 x 9 = 27
		
//		** 로직
//		1) 입력받을 정수 선언 및 초기화
//		2) 출력 메세지 및 입력받은 정수 값 변수에 담기
//		3) for (int = 1; i <= 9; i++) {
//		4) System.out.println(정수 * i = 값); }
//		5) 버퍼 비우기
		
//		int dan = 0;
//		System.out.print("단을 입력하세요 : ");
//		dan = sc.nextInt();
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(dan + " x " + i + " = " + (dan*i));
//		}
//		sc.nextLine();
		
//      7. ATM 메뉴에서 입금, 출금, 잔액 조회를 구현하세요.
//			[조건]
//			초기 잔액은 10000원으로 설정
//		    메뉴에서 선택에 따라 작업 수행
//		    종료 시 프로그램 종료
//		
//		    String msg =  "\nATM 메뉴의 번호를 선택하세요 : "
//		    		+ "1. 잔액 조회"
//		            + "2. 입금"
//		            + "3. 출금"
//		            + "4. 종료"
//		            + "선택 : ");
//		** 로직
//		1) 잔액, 입금액, 출금액을 담을 변수와 답변을 받을 변수 선언 및 초기화
//		2) 출력 메세지와 입력받은 답변을 변수에 담기
//		3) while문 (!(답변 == 4)) {
//		4) 답변 별 작업 수행 : switch문 사용
//		4-1) 1. 작업조회 : 잔액 변수 출력
//		4-2) 2. 입금 : 잔액 변수 + 입금액
//		4-3) 3. 출금 : if문 사용해서 출금액 보다 잔액이 많거나 같다면 진행, 부족하다면 잔액 부족 출력
//		4-4) default : 잘못 선택 } }
//		5) 종료 메세지 출력
//		6) sc.close();
		
		int balance = 10000, addMoney = 0, minusMoney = 0, choice = 0;
		String msg =  "\nATM 메뉴의 번호를 선택하세요 : "
				+ "1. 잔액 조회 "
		        + "2. 입금 "
		        + "3. 출금 "
		        + "4. 종료\n"
		        + "선택 : ";
//		System.out.print(msg);
//		choice = sc.nextInt();
//		while (!(choice == 4)) {
//			switch (choice) {
//			case 1: {
//				System.out.println("잔액은 " + balance + "원 입니다.");
//				break;
//			}
//			case 2: {
//				System.out.print("입금하실 금액 입력 : ");
//				addMoney = sc.nextInt();
//				balance = balance + addMoney;
//				System.out.println("입금이 완료되었습니다.");
//				System.out.println("현재 잔액은 " + balance + "원 입니다.");
//				break;
//			}
//			case 3: {
//				System.out.print("출금하실 금액 입력 : ");
//				minusMoney = sc.nextInt();
//				if (balance >= minusMoney) {
//					balance = balance - minusMoney;
//					System.out.println("출금이 완료되었습니다.");
//					System.out.println("현재 잔액은 " + balance + "원 입니다.");
//				} else {
//					System.out.println("잔액이 부족합니다.");
//					System.out.println("현재 잔액은 " + balance + "원 입니다.");
//				}
//				break;
//			}
//			default:
//				System.out.println("잘못된 선택입니다.");
//				break;
//			}
//			System.out.print(msg);
//			choice = sc.nextInt();
//		}
//		System.out.println("종료되었습니다.");
//		sc.close();
	}
//	기능 : 최대, 최소 비교
//	리턴타입 : 우선 void
//	메소드명 : checkMaxMin
//	매개변수 : ArrayList
//	리턴값 : int[]
//	1. 최대,최소, 번호를 담을 2차원 배열 선언
//	2. 최대/최소 칸에 인덱스 0번째 값 담기 → Down Casting→
//	3. List길이 만큼 반복
//		- 최대보다 크다면 최대에 담고 최대번호에 i 담기
//		- 최소보다 작다면 최소에 담고 최소번호에 i 담기
//	4. 배열 리턴
	int[][] checkMaxMin (ArrayList numbers) {
		int[][] num = new int[2][2];
		num[0][1] = (int)numbers.get(0);
		num[1][1] = (int)numbers.get(0);

		for (int i = 0; i < numbers.size(); i++) {
			int temp = (int)numbers.get(i);
			if (num[0][1] < temp) {
				num[0][1] = temp;
				num[0][0] = i;
			}
			if (num[1][1] > temp) {
				num[1][1] = temp;
				num[1][0] = i;
			}
		}
		return num;
	}
}


