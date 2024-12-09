package ex02;

import java.util.Scanner;

//박수현
public class Main {
	public static void main(String[] args) {
//		학생 5명의 점수(1개)를 입력받아 아래 조건을 수행하는 프로그램
//		총합 계산
//		평균 계산
//		최고 점수와 해당 인덱스 출력
		
//		점수는 배열에 저장하여 출력
//		나중에 학생수를 사용자가 입력할 수 있도록 변경할 예정
		
//		** 로직
//		1) 배열 선언 및 생성
//		2) 총합과 평균, 최고점수, 인덱스 변수 선언 및 초기화
//		3) for (배열길이만큼 반복) {	출력 메세지 및 점수 입력 받기 }
//		4) for-each문 사용해서 총합 구하기
//		5) 평균 = 총합 / 배열 길이
//		6) 최고점수 = 배열[0];
//		7) for (배열길이만큼 반복)
//			if (최고점수 < 배열[i]) {
//				최고점수 = 배열[i];
//				인덱스 = i; }
//		8) 결과 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 입력 : ");
		int student = sc.nextInt();
		
		int[] scores = new int [student];	// 입력받은 학생 수로 배열 선언
		int total = 0, max = 0, idx = 0;
		double avg = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.print("학생" + i + " 점수 입력 : ");
			scores[i] = sc.nextInt();
		}
		sc.close();
		for (int score : scores) {
			total += score;
		}
		avg = (double)total / scores.length;
		
		max = scores[0];
		idx = 0;
		for (int i = 1; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
				idx = i;
			}
		}
		System.out.println("총합 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("학생" + idx + "의 " + max + "점이 최고점입니다.");
	}
}
