package teamTask;

import java.util.Scanner;

// 1. 업다운 (초기 숫자 상수로 정하고 숫자 3회 입력)
public class Task01 {
	public static void main(String[] args) {
//		문제 1) 정수를 입력받고 입력받은 정수랑 정답과 크기 비교
//				- 입력 기회 3번
//				- 입력받은 정수가 정답보다 더 클 경우 "입력받은 숫자보다 더 작습니다" 출력
//				- 입력받은 정수가 정답보다 더 작을 경우 "입력받은 숫자보다 더 큽니다" 출력
//				- 정답일 경우 "정답입니다" 출력 후 프로그램 종료
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
		
		Scanner sc = new Scanner(System.in);

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
		sc.close();
	}
}
