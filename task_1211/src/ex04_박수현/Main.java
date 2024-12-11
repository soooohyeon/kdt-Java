package ex04_박수현;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		(3) Main 클래스
//	    메인 메소드 구현
//	    Student 객체를 생성하여 이름과 점수를 입력받는다(입력받을 점수는 0~100 범위 내, 입력클래스 사용)
//	    각 학생의 총점과 평균을 출력한다
//		1. Scanner 클래스 import
//		2. 입력받을 이름과 과목 3가지 변수 선언 및 초기화
//		3. 출력메세지 및 입력받은 값 변수에 담기
//			while문 사용해서 0 ~ 100 범위 이내가 아닐 시 범위내로 입력할때까지 무한 반복
//				if (3과목 전부 0 ~ 100 범위 이내라면) {
//					break;
//		4. Student 객체화 - 입력받은 값 전달
//		5. 총점과 평균 메소드 호출
		Scanner sc = new Scanner(System.in);
		String name = "";
		int javaScore = 0, dbmsScore = 0, htmlScore = 0;
		System.out.print("이름 입력 : ");
		name = sc.next();
		while (true) {
			System.out.print("각 점수 입력 (띄어쓰기로 구분) : ");
			javaScore = sc.nextInt();
			dbmsScore = sc.nextInt();
			htmlScore = sc.nextInt();
			if (javaScore >= 0 && javaScore <= 100 && dbmsScore >= 0 && dbmsScore <= 100 && htmlScore >= 0 && htmlScore <= 100) {
				break;
			}
			System.out.println("잘못된 점수입니다.\n");
		}
		Student st = new Student(name, javaScore, dbmsScore, htmlScore);
		System.out.println(st.getName() + "님의 총점 : " + st.getTotalScore() + "점");
		System.out.println(st.getName() + "님의 평균 : " + st.getAverageScore() + "점");
	}
}
