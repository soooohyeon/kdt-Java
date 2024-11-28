package teamTask;

import java.util.Scanner; // import 값 가져오기

public class Task02 {
	public static void main(String[] args) {
//		문제2) OX퀴즈
//			- 1번 정답시 '정답입니다' 출력 후 2번 문제 출력, 오답시 '오답입니다' 출력 후 프로그램 종료
//			- 2번 정답시 '정답입니다' 출력 후 프로그램 종료, 오답시 '오답입니다' 출력 후 프로그램 종료
//			문제2-1) 독사가 자기 혀를 깨물면 죽는다?		정답 : X
//			문제2-2) 아기화장품은 순해서 어른들이 사용해도 괜찮다?		정답 : O
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

		Scanner sc = new Scanner(System.in);
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
		sc.close();

	}
}