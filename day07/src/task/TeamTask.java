package task;

import java.util.Scanner;

public class TeamTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TeamTask tt = new TeamTask();
//		Q.1 좀비 바이러스 발생

		/*
		 * System.out.print("최초 좀비의 수는 몇명이었나요? ");
		 * int zombie = sc.nextInt();
		 * System.out.println("6시간 후의 좀비의 수는 : " + tt.calculatorZombie(zombie) +
		 * " 입니다.");
		 */

//		Q.2 귀여운 척 금지

		/*
		 * int flag = 0; int count = 3;
		 * System.out.println("~냥 , ~용, ~쪄, ~냠 이 포함된 문장을 절대 입력하지마세요.");
		 * 
		 * while (count >= 0) { String cutePhrase = sc.nextLine(); flag =
		 * tt.iAmCute(cutePhrase); if (flag == 1 && count > 0) {
		 * System.out.print("당신은 귀엽습니다 ><"); count--; } else if (flag == 0) {
		 * System.out.println("잘하고 있습니다, 앞으로도 그렇게 사용해주세요"); } else if (count == 0) {
		 * System.out.print(" 그 만 "); break; } }
		 */
	}

//	Q.1 좀비 바이러스가 발생했습니다.
//	6시간 뒤에 좀비가 몇 마리가 될지 계산하는 메소드를 만드세요.
//	좀비의 수는 1시간후에는 2배> 2시간 후에는 4배 > 3시간 후에는 8배> ... 가 됩니다.
//		조건1. 좀비 변수 명 : zombie, 시간 변수 : hour
//		조건2. 좀비의 수는 입력메소드로 입력 받아야합니다
//		조건3. 리턴값o, 매개변수 o
//		출력 결과)	"6시간 후의 좀비의 수는 : N 입니다."
	
	int calculatorZombie(int zombie) {
		int zombieTotal = zombie;
		for (int i = 1; i <= 6; i++) {
			zombieTotal *= zombie;
		}
		return zombieTotal;
	}

//	Q.2 귀여운 척 금지
//	귀여운 척하는 사람의 말투를 고쳐줍시다.
//	조건에 부합하는 메소드를 작성해서 문장를 교정하세요.
//
//	조건 1. 입력받은 문자열 중에 ~냥 , ~냠, ~용 이라는 글자가있다면
//	   그 문자를 2번 연속 출력하게 문장을 바꿉니다.		
//	조건 2. 그 후 "당신은 귀엽습니다" 문장을 다음줄에 출력 합니다.
//	조건 3. 만약, ~냥 , ~냠, ~용 이 포함되지 않았다면 "잘하고 있습니다, 앞으로도 그렇게 사용해주세요" 출력
//	- ~냥 , ~냠, ~용 이 들어간 문장이 총 3번 이상 입력되었으면,
//	아래와 같은 문장을 출력시키고 프로그램을 종료시킵니다.
//	조건 4. 메소드 명은 iAmCute로 선언해야합니다.
//	결과) 입력 :	안녕하세용
//				안녕하세용용
//				당신은 귀엽습니다 > <
//				안녕하세용용
//				당신은 귀엽습니다 > <
//				안녕하세용용
//				당신은 귀엽습니다 > <
//	
//				안녕하세용용
//				그 만
	
	int iAmCute(String cutePhrase) {
		String foo = "";
		String result = "";
		int flag = 0;

		for (int i = 0; i < cutePhrase.length(); i++) {
			foo = cutePhrase.charAt(i) + "";
			if (foo.equals("냥") || foo.equals("용") || foo.equals("냠") || foo.equals("쪄")) {
				result += (foo + foo);
				flag = 1;
			} else {
				result += foo;
			}
		}
		System.out.println(result);
		return flag;
	}

}
