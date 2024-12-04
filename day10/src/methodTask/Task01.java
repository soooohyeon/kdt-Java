package methodTask;

import java.util.Random;
import java.util.Scanner;

public class Task01 {
//	공백(0100) 팀
	
//	** 문제 1. randomGame
//	게임에 참여할 두 명의 이름을 사용자에게 입력 받는다.
//	랜덤으로 나온 5개 숫자들의 합이 더 큰 사람이 이기는 게임이다.
//	메소드명 : randomGame
//	- randomGame 메서드를 main에서 두 번 호출하여 출력 형식대로 출력하게 만들 것
//	- 매개변수 o 리턴 타입 자유
//	[출력 형식]
//	1등 : 사용자 1, 합계 : 00
//	2등 : 사용자 2, 합계 : 00
//	1~ 10로 범위 지정
//   **Random random = new Random();를 사용
//   random.nextInt(a)+b (:b부터 (a-1)까지의 수를 랜덤으로 뽑음)을 사용
	
//	*** 메소드 로직
//	** 기능 : 이름을 2개 전달받고 랜덤 정수 5개의 총합을 각각 구한 후 비교한 결과값 출력하는 기능
//	1) 리턴 타입 void
//	2) 메소드명 randomGame
//	3) 매개변수 (String name1, String name2)
//	4) 코드 
//		Random random = new Random();를 사용
//		총합 결과 변수 2개 선언 및 초기화
//		
//		for (5번 반복) {
//			결과변수1 += (random.nextInt(10) + 1);
//			결과변수2 += (random.nextInt(10) + 1);
//		}
//		if (결과변수1 > 결과변수2) {
//			출력 (유저1 1등, 유저2 2등);
//		} else if (결과변수1 < 결과변수2) {
//			출력 (유저2 1등, 유저1 2등);
//		} else {
//			출력 (공동 1등); }

	void randomGame (String name1, String name2) {
		Random random = new Random();	// 랜덤 숫자를 받기 위한 클래스
		int result1 = 0, result2 = 0;	// 총합 결과를 담을 변수
		for (int i = 0; i < 6; i++) {
			result1 += (random.nextInt(10)+1);	// 유저 1의 결과
			result2 += (random.nextInt(10)+1);	// 유저 2의 결과
		}
		if (result1 > result2) {
			System.out.println("[1등] " + name1 + ", 합계 : " + result1 + "\n[2등] " + name2 + ", 합계 : " + result2);
		} else if (result1 < result2) {
			System.out.println("[1등] " + name2 + ", 합계 : " + result2 + "\n[2등] " + name1 + ", 합계 : " + result1);
		} else {
			System.out.println("공동 1등입니다.");
		}
	}
	
//	**문제 2. 입력받은 Type 출력**
//    정수, 실수, 문자, 문자열 중 하나를 입력하여 입력받은 Type이 무엇인지 알려주는 프로그램 
//    메서드명: CheckType, Type에 따라 값 출력하는 메서드), 매개변수O, 리턴값 자유
//    출력 형식
//    정수, 실수,| 문자, 문자열 중 하나를 입력하세요:  3.14
//    3.14는 실수입니다.
	
	/*
	 * *** 메소드 로직                                    
	 * ** 기능 : String, char, int, double에 따라 다른 출력물을 출력 하는 기능.
	 * 1) 리턴타입 : void                              
	 * 2) 메소드명 : CheckType                           
	 * 3) 매개변수 : String, char, int, double 각 1개씩 메소드마다 다른 타입의 매개변수를 받기                           
	 * 4) 받은 매개변수에 맞는 메소드에 따라 결과물 출력
	 */
	void CheckType (String text) {
		System.out.println(text + "는 문자열");
	}
	void CheckType (char text) {
		System.out.println(text + "는 문자형");
	}
	void CheckType (int text) {
		System.out.println(text + "는 정수형");
	}
	void CheckType (double text) {
		System.out.println(text + "는 실수형");
	}
	
//	**문제 3. 랜덤다이스 만들기**
//    주사위를 돌려서 같은 수 두 번이 나올 때 까지 던진다. 몇번째에 성공하는지 횟수를 계산해야 하고, 메서드에 이름을 입력하면 그 사람의 결과가 출력된다
//    "연속으로 같은 수 나오기 성공"
//    "김태현님은 총 몇 번 성공하셨습니다" 출력
//    메소드명은 randomDice, 리턴값은 없음, 매개변수는 문자열 변수 사용	
	
//	*** 메소드 로직
//	** 기능 : 주사위 1개를 던져서 연속으로 나오는 숫자가 동일할 때 반복 종료하고 몇 번 반복을 돌렸는지까지 같이 출력
//	1) 리턴 타입 void
//	2) 메소드명 randomDice
//	3) 매개변수 (String name)
//	4) 코드 
//		2가지 결과를 비교할 변수 2개(int dice, diceTemp), 회수를 누적할 변수(int count) 선언 및 초기화
//		Random random = new Random(); → 주사위값을 랜덤으로 받기 위해 클래스 사용→
//		while (true) {
//			dice = (random.nextInt(6) + 1);
//			if (diceTemp == 0) {	// 처음 주사위 던졌을 땐 비교값이 0
//				diceTemp = dice;	→ 이전 주사위 결과와 비교해야 돼서 임시로 저장 
//			} else if (dice != diceTemp) { // 임시 저장한 값과 새 주사위 값이 불일치라면
//				count++;	횟수 증가
//			} else {
//				횟수를 포함한 결과출력;
//				break; }
	void randomDice (String name) {
		int dice = 0, diceTemp = 0, count = 0;
		Random random = new Random();
		while (true) {
			dice = (random.nextInt(6) + 1);
			if (diceTemp == 0) {
				diceTemp = dice;
			} else if (dice != diceTemp) {
				diceTemp = dice;
				count++;
			} else {
				System.out.printf("연속으로 같은 수 나오기 성공\n%s님은 총 %d번 성공하셨습니다", name, count);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
//		1번 문제 메인메소드 로직
//		1. Scanner 클래스 import
//		2. 메소드 사용하기 위해 클래스명 객체화
//		3. 이름 입력 변수 2개 선언 및 초기화
//		4. 출력 메세지 및 입력받은 이름 변수로 저장
//		5. 메소드 사용 (입력받은 이름 2개 인수로 작성)
//		6. 버퍼 비우기
		Scanner sc = new Scanner(System.in);
		Task01 t = new Task01();
		
//		String name1 = "", name2 = "";
//		System.out.print("유저1 이름 입력 : ");
//		name1 = sc.next();
//		System.out.print("유저2 이름 입력 : ");
//		name2 = sc.next();
//		t.randomGame(name1, name2);
//		sc.nextLine();
		
//		==========================================================

//		2번 문제 메인메소드 로직
//		1. Scanner 클래스 import
//		2. 메소드 사용하기 위해 클래스명 객체화
//		3. 출력 메세지 및 텍스트 입력 받고 변수에 저장
//		4. for (매개변수의 문자열만큼 반복) {
//			전달받은 문자열을 각 문자형 변수으로 쪼개서 변수에 저장
//			if (숫자) → 48 ~ 57은 아스키코드로 0 ~ 9, 46은 . / 정수나 실수를 구분하기 위해서
//				if (소수점 포함o)	→ 실수일 때
//					{ 실수형 메소드 실행하고 반복 종료 }
//				else if (소수점 포함x, 문자열 마지막 인덱스까지 반복이 실행)	→ 정수일 때
//						{ 정수 메소드 실행 }
//				else	→  실수여도 적어도 1번째 자리는 정수일거라 continue→
//			else {	→ 그 외에는 전부 문자로 구분해서
//				만약 문자열 길이가 1이라면 문자형 / 1 이상은 문자열
		
//		Scanner sc = new Scanner(System.in);
//		Task01 t = new Task01();
		
		System.out.print("정수, 실수, 문자, 문자열 중 하나를 입력하세요. : ");
		String inputValue = sc.nextLine();
		
//		System.out.println(t.CheckType(inputValue));
		
		for (int i = 0; i < inputValue.length(); i++) {
			char charVar = inputValue.charAt(i);
			
			if((48 <= charVar && charVar <= 57) || charVar == 46) {  // ==> 숫자
				if (charVar == 46) {
					t.CheckType(Double.parseDouble(inputValue));
					break;
				} else if (i == (inputValue.length()-1)) {
					t.CheckType(Integer.parseInt(inputValue));
				}
			} else {  // ==> 문자
				if (inputValue.length() == 1) {
					t.CheckType(inputValue.charAt(0));
				} else {
					t.CheckType(inputValue);
					break;
				}
			}
		}
		
//		==========================================================
		
//		3번 문제 메인메소드 로직
//		1. Scanner 클래스 import
//		2. 메소드 사용하기 위해 클래스명 객체화
//		3. 이름 변수 선언 및 초기화 후 이름 입력받기
//		4. 메소드 사용(이름 인수로 전달)
//		5. 버퍼 비우기
		
////		Scanner sc = new Scanner(System.in);
////		Task01 t = new Task01();
		String name3 = "";
		System.out.print("이름 입력 : ");
		name3 = sc.next();
		t.randomDice(name3);
		sc.close();
	}
}
