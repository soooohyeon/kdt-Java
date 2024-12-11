package ex04_박수현;

public class Student extends Person {
//	(2) Student 클래스
//    Person 클래스 상속
//    - 필드 (private) : int javaScore, int dbmsScore, int htmlScore(과목 점수)
//    - 생성자 : Person의 생성자를 호출하고, 각 점수 초기화
//    - 메소드
//        getTotalScore() : 세 과목 점수를 더한 값(정수)을 반환
//        getAverageScore() : 평균(정수형)으로 반환
	
//	필드
	private int javaScore;
	private int dbmsScore;
	private int htmlScore;

//	생성자
	public Student(String name, int javaScore, int dbmsScore, int htmlScore) {
		super(name);
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
	}
	
//	메소드 1. 세 과목 점수를 더한 값(정수)을 반환
//	1. 리턴타입 int
//	2. 메소드명 getTotalScore
//	3. 코드
//		총합 변수 선언 후 위 필드의 값 전부 더해서 리턴
	int getTotalScore() {
		int total = this.javaScore + this.dbmsScore + this.htmlScore;
		return total;
	}
	
//	메소드 2. 평균(정수형)으로 반환
//	1. 리턴타입 int
//	2. 메소드명 getAverageScore
//	3. 코드
//		평균, 총합 변수 선언 및 초기화
//		총합 변수에 총합 구하는 메소드 호출해서 리턴값 담기
//		평균 = 총합 / 3;
//		return 평균;
		int getAverageScore() {
			int avg = 0;
			int total = getTotalScore();
			avg = total / 3;
			return avg;
		}
}
