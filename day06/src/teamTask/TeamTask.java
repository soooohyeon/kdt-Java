package teamTask;

import java.util.Scanner;

public class TeamTask {
	public static void main(String[] args) {
//		Scanner 클래스 import
		Scanner sc = new Scanner(System.in);
		
//		=====(I팀 ↓↓↓↓↓)===================================================
//		문제 1) 정수를 입력받고 입력받은 정수랑 정답과 크기 비교
//		- 입력 기회 3번
//		- 입력받은 정수가 정답보다 더 클 경우 "입력받은 숫자보다 더 작습니다" 출력
//		- 입력받은 정수가 정답보다 더 작을 경우 "입력받은 숫자보다 더 큽니다" 출력
//		- 정답일 경우 "정답입니다" 출력 후 프로그램 종료
//		** 로직
//		1) Scanner 클래스 import
//		2) 상수로 된 정답 변수 선언
//		3) 입력받을 답변 변수와 시도 횟수를 적립할 변수 선언 및 초기화
//		4) while문 (시도 횟수 < 3) { → 시도 횟수 = 0;으로 초기화
//		5) 출력 메세지와 입력받은 정수 변수에 담기
//		6) 대소 비교해서 결과 다르게 출력 (if-esle if- 사용)
//			6-1) 정답이 아닌 경우에만 시도 횟수 1회 누적
//			6-2) 정답인 경우 프로그램 종료
//		7) 프로그램 종료 메세지 출력
//		8) 버퍼 비우기
		
		int suggest = 0;		// 입력받을 변수
		final int ANSWER = 30;	// 정답
		int count = 0;			// 시도횟수
		
		while (count < 3) { // count가 2보다 작을때 실행되는 반복문 0, 1, 2
			System.out.println("숫자를 맞추세요"); // 출력메소드
			suggest = sc.nextInt(); // 입력메소드
		
			if (suggest > ANSWER) {				// 제시한 답안이 정답보다 클 때
				System.out.println(suggest + "보다 작습니다.");
				count++; // 횟수 누적
			} else if (suggest < ANSWER) {		// 제시한 답안이 정답보다 작을때
				System.out.println(suggest + "보다 큽니다.");
				count++; // 횟수 누적
			} else {
				System.out.println("정답입니다!");	// 정답일 때
				break; // 프로그램 종료
			}
		}
		
		System.out.println("프로그램이 종료되었습니다.");
		sc.nextLine();

//		==============================================================
//		문제 2) OX퀴즈
//		- 1번 정답시 '정답입니다' 출력 후 2번 문제 출력, 오답시 '오답입니다' 출력 후 프로그램 종료
//		- 2번 정답시 '정답입니다' 출력 후 프로그램 종료, 오답시 '오답입니다' 출력 후 프로그램 종료
//		문제2-1) 독사가 자기 혀를 깨물면 죽는다?				정답 : X
//		문제2-2) 아기화장품은 순해서 어른들이 사용해도 괜찮다?		정답 : O
//		** 로직
//		1) Scanner 클래스 import
//		2) 입력받을 문자열 변수 생성
//		3) 출력메세지 (1번 문제 출력, 답변 입력 메세지)
//		4) 답변 입력받고 변수에 담기
//		5) if (답변 정답 여부) {
//			5-1) 출력메세지 (오답입니다), 프로그램 종료
//			5-2) 출력메세지 (정답입니다, 1번 문제 출력, 답변 입력 메세지 출력하고 입력받은 답변 변수에 저장)
//		6) 5-2) 통과시 if (2번 문제 정답 여부) {
//			6-1) 출력메세지 (오답입니다), 프로그램 종료
//			6-2) 출력메세지 (정답입니다, 축하), 프로그램 종료
//		}

		String answer = "";
		System.out.println("OX 퀴즈가 시작됩니다. 맞으면 다음문제로 넘어가고 틀리면 종료됩니다.\n");
		System.out.println("1번문제 : 독사가 자기 혀를 깨물면 죽는다?");
		answer = sc.nextLine();
		
//		1번 정답 여부 판별
		if (answer.equals("O") || answer.equals("o")) {
			System.out.printf("틀렸습니다 (문제종료)");
		} else if (answer.equals("X") || answer.equals("x")) { 
			System.out.printf("맞습니다 (2번문제 넘어갑니다)\n"
		+ "\n2번문제 : 아기화장품은 순해서 어른들이 사용해도 괜찮다?");
	
			answer = sc.nextLine(); 
//			2번 정답 여부 판별
			if (answer.equals("X") || answer.equals("x")) {
				System.out.println("\n축하드립니다. 모든 문제를 맞줬습니다. \nOX퀴즈가 종료됩니다.");
			} else if (answer.equals("O") || answer.equals("o")) {
				System.out.println("틀렸습니다 (문제종료)");
	
			}
		}
		sc.nextLine();
		
//		=====(JAV탕 팀 ↓↓↓↓↓)===================================================
//		문제 1) 입력한 갯수만큼 늘어나는 반칸 다이아 만들기
//			      *
//			     * * 
//			    * * *
//			     * *
//			      *
//		** 로직
//		1) 이중 for문 사용 (위로 향하는 삼각형은 행 : 6, 열 : 6 / 아래로 향하는 삼각형 행 : 5, 열 : 5)
//			1-1) 여백은 행이 내려갈수록 감소, *은 행이 내려갈수록 증가
//			1-2)	여백은 행이 내려갈수록 증가, *이 행이 내려갈수록 감소
//		** 다이아몬드 형식 출력 프로그램 먼저 작성 후 입력한 개수만큼 증가하는 다이아 출력 프로그램으로 수정
//		2) 입력받을 정수 변수 선언 및 초기화
//		3) 출력 메세지 및 입력받은 정수 변수에 담기
//		4) 1번에서 작성한 for문 조건식을 입력받은 값을 담은 변수로 수정
//		5) 버퍼 비우기

//		별의 최대 개수를 담을 변수
		int starCount = 0;
		
		System.out.print("입력한 개수를 기준으로 다이아 모형이 출력됩니다"
				+ "\n정수를 입력해주세요 : ");
		starCount = sc.nextInt();
		sc.nextLine();
//		위로 향하는 삼각형 출력
		for (int i = 1; i <= starCount; i++) {
			for (int j = starCount-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < i+1; k++) {
				System.out.print("* ");	
			}
			System.out.println();
		}
		
//		아래로 향하는 삼각형 출력
		for (int l = 1; l < starCount; l++) {
			for (int m = 0; m < l; m++) {
				System.out.print(" ");
			}
			for (int n = starCount-1; n >= 0+l; n--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
//		==============================================================
//		문제 2) 자판기 :	금액을 입력하고 선택지 선택(1. 콜라 2500원/2. 사이다 2000원/3.커피 4000원/4.잔액반환(종료))
//						구매 가능시 : 구매 가능한 개수와 거스름돈 출력
//						구매 불가시 : 잔액 부족 표시 출력
//		** 로직
//		1) 정수 변수선언 (콜라, 사이다, 커피, 입력받은 금액, 거스름돈)
//		2) while문 출력
//		3) switch문 (답변 선택 / 잔액반환 받으면 종료) {
//			3-1) 구매 가능시 메세지 출력 (음료수가 나왔습니다, 구매 가능한 음료수 개수)
//				잔액 / 음료수 = 구매 가능 개수 확인해서 출력
//				소지금액 - 사용한 금액 = 잔액 출력
//				  --> 반복문으로 다시 돌아가서 반복 (= 선택지 출력)
//			3-2) 잔액 부족시 잔액반환 누르고 종료
//					> 잔액 출력 (0000원이 반환되었습니다)
//					> 잔액 반환 (= 프로그램 종료)
//			3-3) 그 외 번호 입력시 '잘못된 입력입니다' 출력
//		4) 버퍼 비우기 (잔액이 0이 되면 반복 종료) {
//		+) 잔액보다 선택한 음료수가 많아야 구매가능한 조건 추가
//			→ if (balance >= 음료수) > 구매 가능
//			→ if (balance < 음료수) > 구매 불가 문구 출력
//		+) 금액 입력이 0원 일때 프로그램 종료 → 금액 입력 후 if (balance == 0) 추가
//		+) 구매 후 0원 일때 프로그램 종료 → 각 선택지에서 구매가능 개수 계산 후 if (balance == 0) 추가
		
		int money = 0, balance = 0, choice = 0, drinkCount = 0;
		final int COFFEE = 4000;
		final int COKE = 2500;
		final int CIDER = 2000;
		boolean isLoop = true;
		
		System.out.print("금액을 입력해주세요 : ");
		balance = sc.nextInt();
		while (isLoop) {
			if(balance == 0) {
				System.out.println("잘못 입력하셨습니다\n프로그램이 종료됩니다");
				isLoop = false;
				break;
			}
			System.out.println("메뉴 출력 1~4번까지\r\n"
					+ "      1 콜라 : 2500\r\n"
					+ "      2 사이다 : 2000\r\n"
					+ "      3 커피 : 4000\r\n"
					+ "      4 잔액반환");
			System.out.print("\n메뉴 입력해주세요 : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:   // 콜라
				if (balance < COKE) {
					System.out.println("잔액이 부족합니다");
					break;
				} else {
					drinkCount = balance / COKE;
					System.out.println("구매 가능한 음료 개수는 " + drinkCount + "개 입니다");
					balance = balance-(drinkCount*COKE);
					System.out.println("잔액은 " + balance + "원 입니다");
					if(balance == 0) {
						System.out.println("프로그램이 종료됩니다");
						isLoop = false;
					}
					break;
				}
			case 2:   // 사이다
				if (balance < CIDER) {
					System.out.println("잔액이 부족합니다");
					break;
				} else {
					drinkCount = balance / CIDER;
					System.out.println("구매 가능한 음료 개수는 " + drinkCount + "개 입니다");
					balance = balance-(drinkCount*CIDER);
					System.out.println("잔액은 " + balance + "원 입니다");
					if(balance == 0) {
						System.out.println("프로그램이 종료됩니다");
						isLoop = false;
					}
					break;
				}
			case 3:   // 커피
				if (balance < COFFEE) {
					System.out.println("잔액이 부족합니다");
					break;
				} else {
					drinkCount = balance / COFFEE;
					System.out.println("구매 가능한 음료 개수는 " + drinkCount + "개 입니다");
					balance = balance-(drinkCount*COFFEE);
					System.out.println("잔액은 " + balance + "원 입니다");
					if(balance == 0) {
						System.out.println("프로그램이 종료됩니다");
						isLoop = false;
					}
					break;
				}
			case 4:   // 반환
				System.out.println("잔액은 " + balance + "원 입니다");
				System.out.println(balance + "원 반환되었습니다.");
				isLoop = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다\n");
				break;
			}
			
		}
		sc.nextLine();

//		=====(공백(0100) 팀 ↓↓↓↓↓)===================================================
//		문제 1. 사용자가 입력한 숫자까지 구구단을 출력하는 프로그램
//			구구단은 1단부터 9단까지다.
//			사용자가 4를 입력할 경우 1단부터 4단까지 아래와 같은 형식으로 출력한다. 단은 \t로 구분한다.
//			(이중 for 문 사용, if 사용 X)
//				[입출력예시]
//				구구단을 어디까지 출력할까요? : 4
//				1 * 1 = 1   2 * 1 = 2   3 * 1 = 3   4 * 1 = 4   
//				1 * 2 = 2   2 * 2 = 4   3 * 2 = 6   4 * 2 = 8   
//				1 * 3 = 3   2 * 3 = 6   3 * 3 = 9   4 * 3 = 12   
//				1 * 4 = 4   2 * 4 = 8   3 * 4 = 12   4 * 4 = 16   
//				1 * 5 = 5   2 * 5 = 10   3 * 5 = 15   4 * 5 = 20   
//				1 * 6 = 6   2 * 6 = 12   3 * 6 = 18   4 * 6 = 24   
//				1 * 7 = 7   2 * 7 = 14   3 * 7 = 21   4 * 7 = 28   
//				1 * 8 = 8   2 * 8 = 16   3 * 8 = 24   4 * 8 = 32   
//				1 * 9 = 9   2 * 9 = 18   3 * 9 = 27   4 * 9 = 36

//		** 로직
//		1) 입력받을 정수 변수 선언 및 초기화
//		2) 출력메세지 및 입력받은 정수 변수에 담기
//		3) 버퍼비우기
//		4) 단 개수 : 입력받은 변수 사용해서 for문 생성 조건식 : 입력받은 변수보다 작을 때 true
//		5) 단 * 1 ~ 9 출력 / for문 () { sysout(바깥 for문 변수 * 안쪽 for문 변수) }

		int dan = 0;
		System.out.print("구구단을 어디까지 출력할까요? : ");
		dan = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= dan; j++) {
				System.out.print(j + " * " + i + " = " + (i*j) + "   ");
			}
			System.out.println();
		}

//		==============================================================
//		문제 2. UP&DOWN 게임
//			게임의 정답은 정해놓는다.
//			사용자에게 1 ~ 50까지의 정수를 입력 받고, 입력 받은 값이 정답보다 크면 "DOWN!"을 출력한다
//			정답보다 작으면 "UP"을 출력한다.
//			정답이 아닐 경우 "값을 다시 입력해 주세요 : " 를 출력한 후, 값을 다시 입력 받는다.
//			정답을 맞히면 "정답입니다 *번 째에 맞혔습니다!"를 출력하고 프로그램을 종료한다.
//			단, 1 ~ 50까지의 정수 범위를 벗어나면 "1 ~ 50까지의 숫자만 입력해주세요 : " 를 출력한다.
//		** 로직
//		1) 정답인 상수 변수, 정수변수(입력한 답, 누적 횟수) 변수 선언 및 초기화
//		2) while문 (true) {
//		3)	출력메세지 + 입력받은 답 변수에 담기
//		4)	결과 출력
//			4-1) ** 1 ~ 50 외 입력시 경고 메세지(1 ~ 50까지의 숫자만 입력) 출력 }
//			4-2) 오답 : 정답보다 클 때 : DOWN, 정답보다 작을 때 : UP 출력 후 다시 입력받기
//			4-3) 정답 : 메세지(정답, 0번 만에 맞혔습니다) 출력 후 프로그램 종료
//		5) 버퍼 비우기
//		+) 바로 정답 맞혔을때만 다른 메세지("축하드립니다! 바로 맞혔습니다~!!") 출력
		
		final int UP_DOWN_ANSWER = 25;
		int userAnswer = 0, inputCount = 0;
		while (true) {
			System.out.println("1 ~ 50까지의 정수 입력 : ");
			userAnswer = sc.nextInt();
			
			if (userAnswer > UP_DOWN_ANSWER && userAnswer <= 50) {	// 정답보다 클 때
				System.out.println("Down");
				inputCount++;
			} else if (userAnswer < UP_DOWN_ANSWER && userAnswer >= 0) {	// 정답보다 작을 때
				System.out.println("UP");
				inputCount++;
			} else if (userAnswer == UP_DOWN_ANSWER) {	// 정답일 때
				inputCount++;
				if (inputCount == 1) {	// 시작하자마자 맞혔을 때
					System.out.println("축하드립니다! 바로 맞혔습니다~!!");
					break;
				} else {	// 시도 횟수가 2회 이상일 때
					System.out.println("정답!!\n" + inputCount + "번 만에 맞혔습니다!");
					break;
				}
			} else {	// 그외 숫자 입력시
				inputCount++;
				System.out.println("1 ~ 50까지의 숫자만 입력해주세요");
			}
		}
		sc.nextLine();

//		=====(JAVA요 팀 ↓↓↓↓↓)===================================================
//		문제 1. 점심 선택 및 가격 확인
//			사용자로부터 점심 메뉴를 입력받아 해당 메뉴와 가격을 출력하기
//			   - 점심 메뉴 4가지에서만 가능하다
//			      짜장 (5000원), 돈까스 (8000원), 피자 (25000원), 햄버거 (6000원)
//			   - 올바른 메뉴를 입력할 때까지 반복합니다.
//			   - 잘못된 메뉴를 입력하면 다시 입력받습니다.
//		** 로직
//		1) 답변을 받을 변수와 메뉴 메세지를 출력할 문자열 변수 선언 및 초기화
//		2) while (true) {
//		3) 메뉴 출력하기
//		4) 메뉴 문자열로 입력받고 값 변수에 담기
//		5) if (메뉴.equals("짜장")) → 논리연산자 or 사용해서 그 외 메뉴들 같이 조건에 넣기
//			5-1) 정답시 메세지("주문 완료") 출력 후 프로그램 종료
//			5-2) 오답시 메세지("다시 입력") 출력 후 다시 입력 받기
//		6) 버퍼 비우기
		
		String menuChoice = "", munuMsg = "==== MENU ====\n"
				+ "짜장 5000원\n돈까스 8000원\n피자 25000원\n햄버거6000원\n==============\n"
				+ "메뉴를 선택하세요 : ";
		
		while (true) {
			System.out.print(munuMsg);
			menuChoice = sc.next();
			if (menuChoice.equals("짜장") || menuChoice.equals("돈까스") || menuChoice.equals("피자") || menuChoice.equals("햄버거")) {
				System.out.println("주문이 완료되었습니다.");
				break;
			} else {
				System.out.println("없는 메뉴입니다.\n");
			}
		}
		sc.nextLine();
		
//		==============================================================
//		문제 2 : 문자의 아스키코드 값 확인
//			사용자로부터 문자를 입력받아 아스키코드 값을 확인하고 입력받은 문자를 아스키코드 값으로 변환한다
//			사용자가 입력한 문자와 그 아스키코드를 출력하는데 반복문을 사용하여 여러번 입력받도록 한다
//			'A'를 입력하면 종료하고 종료 메시지를 출력한다
//		** 로직
//		1) 문자를 입력받을 변수 선언 및 초기화
//		2) while (true) {
//		3) 출력 메세지 및 문자 입력받고 변수에 값 담기
//		4) 아스키코드값 출력 (문자 → 정수로 형변환)
//			** 'A' 입력시 종료 메세지 출력 및 프로그램 종료
		
		String ascii = "";
		while (true) {
			System.out.print("문자 입력 (A 입력시 프로그램 종료) : ");
			ascii = sc.nextLine();
			if ((ascii.charAt(0)) == 'A') {
				System.out.println("프로그램이 종료됩니다");
				break;
			} else {
				System.out.println("아스키코드 값 : " + (int)(ascii.charAt(0)) + "\n");
			}
		}
		
//		=====(보안ER 팀 ↓↓↓↓↓)===================================================
//		문제 1. 문자 추출 사각형 생성
//			문자열(3문자 이상)을 받아온다
//			문자열에서 3번재 위치한 문자로 5*5 크기의 사각형을 출력한다
//			[출력 예시]
//				문자열을 입력해 주세요 : hello
//	            l l l l l 
//	            l l l l l 
//	            l l l l l 
//	            l l l l l 
//	            l l l l l
//		** 로직
//		1) 입력받을 문자열 변수와 3번째 위치한 문자를 담을 문자형 변수 선언 및 초기화
//		2) 출력메세지 및 입력받은 문자열 변수에 담기
//		3) 3번째 위치한 문자 변수에 담기
//		4) 이중 for문 이용한 결과 출력
		
		String text1 = "", box1 = "";
		System.out.print("문자 입력 : ");
		text1 = sc.nextLine();
		box1 = text1.charAt(2) + " ";
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(box1);
			}
			System.out.println();
		}
		
//		==============================================================
//		문제 1-2. (심화)문자 추출 사각형 생성
//			문자열(3문자 이상)을 받아온다
//			문자열에서 3번재 위치한 문자로 5*5 크기의 가운데가 비어있는 사각형을 출력한다
//			[출력 예시]
//	            문자열을 입력해 주세요 : hello
//	            l l l l l 
//	            l       l 
//	            l       l 
//	            l       l
//	            l l l l l
//		** 로직
//		1) 입력받을 문자열 변수와 3번째 위치한 문자를 담을 문자형 변수 선언 및 초기화
//		2) 출력메세지 및 입력받은 문자열 변수에 담기
//		3) 3번째 위치한 문자 변수에 담기
//		4) 이중 for문 이용한 결과 출력
//			4-1) 2, 3, 4번째 줄은 맨 처음과 끝만 출력하고 가운데는 빈칸으로 출력
//			4-2) 1, 5번째 줄은 전체 출력
//			4-3) 안쪽 for문 반복돌고 나면 줄바꿈
		
		String text2 = "", box2 = "";
		System.out.print("문자 입력 : ");
		text2 = sc.nextLine();
		box2 = text2.charAt(2) + " ";
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if ((i >= 2 && i <= 4)) {
					if (j >= 2 && j <= 4) {
						System.out.print("  ");  // i와 j가 모두 2~4일때는 공백 출력
					} else {
						System.out.print(box2);  // j가 1, 5 일때 box2변수에 담긴 값 출력
					}
				} else {
					System.out.print(box2);
				}
			}
			System.out.println();
		}
		
//		==============================================================
//		문제 2. 평균 성적, 평균 학점 계산
//			사용자로부터 3과목의 점수를 각각 입력받고
//			주어진 표에 맞게 계산하여 평균 학점과 평균 성적을 계산하시오
//			<표>
//			  점수  ㅣ  등급  ㅣ  학점
//		    ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		     95-100ㅣ   A+  ㅣ  (4.5)
//		     90-94 ㅣ   A   ㅣ  (4.0)
//		     85-89 ㅣ   B+  ㅣ  (3.5)
//		     80-84 ㅣ   B   ㅣ   (3)
//		     75-79 ㅣ   C+  ㅣ  (2.5)
//		     75미만 ㅣ   F   ㅣ   (0)
//
//		     [출력 예시1]
//		    	3과목의 성적을 입력해 주세요 : 90 89 98
//		    	평균 학점 : 4.0
//		    	평균 성적 : A
//
//		    [출력 예시2]
//		    	3과목의 성적을 입력해 주세요 : 74 74 74
//		    	평균 학점 : 0.0
//		    	평균 성적 : F 
//		** 로직
//		1. 성적 3개의 점수를 담을 변수와, 3개의 점수 총합, 평균점수를 담을 변수 선언 및 초기화
//		2. 입력받은 3개의 점수의 평균 점수를 변수에 담기
//			+) 입력받은 과목 중 1개라도 0 미만, 100 초과 입력시 재입력
//		3. if문 사용해서 각 점수에 맞는 결과 출력
//		4. Scanner 클래스 종료
		
		int score1 = 0, score2 = 0, score3 = 0, total = 0, avg = 0;
		
		
		while (true) {
			System.out.print("3 과목의 성적 입력 : ");
			score1 = sc.nextInt();
			score2 = sc.nextInt();
			score3 = sc.nextInt();
			if (score1 >= 0 && score1 <= 100 && score2 >= 0 && score2 <= 100 && score3 >= 0 && score3 <= 100) { 
				break;
			} else {
				System.out.println("잘못 입력하셨습니다\n다시입력하세요\n");
			}
		}
		total = score1 + score2 + score3;
		avg = total / 3;
		
		if (avg <= 100 && avg >= 95) {
			System.out.println("평균 학점 : 4.5");
			System.out.println("평균 성적 : A+");
		} else if (avg <= 94 && avg >= 90) {
			System.out.println("평균 학점 : 4");
			System.out.println("평균 성적 : A");
		} else if (avg <= 89 && avg >= 85) {
			System.out.println("평균 학점 : 3.5");
			System.out.println("평균 성적 : B+");
		} else if (avg <= 84 && avg >= 80) {
			System.out.println("평균 학점 : 3.0");
			System.out.println("평균 성적 : B");
		} else if (avg <= 79 && avg >= 75) {
			System.out.println("평균 학점 : 2.5");
			System.out.println("평균 성적 : C+");
		} else {
			System.out.println("평균 학점 : 0.0");
			System.out.println("평균 성적 : F");
		}
		sc.close();
		
	}
}
