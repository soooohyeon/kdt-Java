package ex01;

import java.util.Scanner;

//박수현
public class Main {
	public static void main(String[] args) {
//		로직구성 있어야함
//		성적 평가 프로그램
//		학생의 성적을 2과목 입력받아 학점을 계산하는 프로그램
//		90점 이상 A, 80점 이상 90점 미만 B, 70점 이상 80점 미만 C, 70점 미만 F
//		반드시 메소드를 만들 것 (2개 이상), 객체 2개 만들 것
		
//		사용자로부터 점수를 입력받고 학점과 합격 여부 출력
//		필드 : 이름, JAVA점수, DBMS점수, 총점, 학점
//		생성자 : 상관없음
//		메소드	- calculateGrade(int) : 점수를 받아 학점 반환하는 메소드 (매개변수 1개 정수형)
//				- isPass(int) : 점수 70점 이상이면 true, 아니면 false 반환하는 메소드
//		** 로직
//		1) 입력 클래스 import
//		2) 입력받을 과목 2개 변수 생성 및 초기화
//		3) 메세지 출력 및 입력받은 값 변수에 담기
//		4) 객체 생성 (입력 받은 값 넣기)
		Scanner sc = new Scanner(System.in);
		int javaScroe = 0, dbmsScroe = 0;
		System.out.print("JAVA 점수 입력 : ");
		javaScroe = sc.nextInt();
		System.out.print("DBMS 점수 입력 : ");
		dbmsScroe = sc.nextInt();
		Main m1 = new Main("짱구", javaScroe, dbmsScroe);
		System.out.print("JAVA 점수 입력 : ");
		javaScroe = sc.nextInt();
		System.out.print("DBMS 점수 입력 : ");
		dbmsScroe = sc.nextInt();
		Main m2 = new Main("철수", javaScroe, dbmsScroe);
		
		System.out.println(m1.name + "님의 학점은 " + m1.grade + "입니다.");
		System.out.println(m2.name + "님의 학점은 " + m2.grade + "입니다.");
		System.out.println(m1.name + "님 평균 점수 : ");
		System.out.println(m2.name + "님 평균 점수 : ");
	}
//	** 로직
//	1) 필드 생성
		
	String name;
	int javaScroe;
	int dbmsScroe;
	int total;
	char grade;
	
//	생성자
	public Main(String name, int javaScroe, int dbmsScroe) {
		this.name = name;
		this.javaScroe = javaScroe;
		this.dbmsScroe = dbmsScroe;
		this.total = this.javaScroe + this.dbmsScroe;
		this.grade = calculateGrade(this.total);
	}
	
//	메소드 생성
//	1. 점수를 받아 학점 반환하는 메소드 (매개변수 1개 정수형 - 총점을 매개변수로 받기)
//	2. 메소드명 calculateGrade
//	3. 코드
//		int avg = total / 2;
//		avg 점수에 따라 grade에 학점 넣기
	char calculateGrade (int total) {
		int avg = total / 2;
		if (avg >= 90) {
			return 'A';
		} else if (avg >= 80 && avg < 90) {
			return 'B';
		} else if (avg >= 70 && avg < 80) {
			return 'C';
		} else {
			return 'F';
		}
	}


//	1. 점수 70점 이상이면 true, 아니면 false 반환하는 메소드 (매개변수 1개 정수형 - 총점을 매개변수로 받기)
//	2. 메소드명 isPass
//	3. 코드
//		리턴타입 boolean
//		삼항연산자 (총점/2) >= 70 ? true : false
	boolean isPass (int total) {
		return (total/2) >= 70 ? true : false;
	}
	
}
