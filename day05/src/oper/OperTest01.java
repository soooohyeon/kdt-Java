package oper;

import java.util.Scanner;

// 2번 : 삼항연산자
public class OperTest01 {
	public static void main(String[] args) {
//		다음 중 음식이 아닌 것은?
//		1. 피자
//		2. 케이크
//		3. 불고기
//		4. Java
//		삼항 연산자를 사용하여 입력받은 값과 정답 비교하고 정답입니다 or 오답입니다 출력하기
		
		String quizMsg = "다음 중 음식이 아닌것은?\n"
				+ "1. 피자\n"
				+ "2. 케이크\n"
				+ "3. 불고기\n"
				+ "4. Java\n"
				+ "번호를 입력하세요 : ";
		
//		1) Scanner 클래스 import
		Scanner sc = new Scanner(System.in);
//		2) 정답 입력을 담을 변수, 정답을 입력 받을 상수, 결과를 비교하고 메세지를 담을 변수 선언 및 초기화
		int answer = 0;
		final int QUIZ_ANSWER = 4;
		String answerMsg = "";
//		3) 문체 출력 후 정답을 입력받고 변수에 담기
		System.out.print(quizMsg);
		answer = sc.nextInt();
//		4) 결과 비교하고 결과 출력하기 (오류 잡아내기 : 정답 번호 외에 다른 번호 입력시 '잘못된 입력'이라는 문구 출력)
		answerMsg = answer == QUIZ_ANSWER ? "정답입니다" : 1 <= answer && answer <= 4 ? "오답입니다" : "잘못 입력하셨습니다";
		System.out.println(answerMsg);
//		5) sc.close()
		sc.close();
		
	}
}
