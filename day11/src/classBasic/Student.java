package classBasic;
//1-1. 클래스 : 사용자 정의 타입 (자료형)
public class Student {
//	필드(속성) : 5 ~ 9 줄에 선언한 변수들
//	필드의 변수들은 해당 클래스에 정의되어있는 메소드의 변수로 사용 가능
	int math;
	int eng;
	int kor;
	double avg;
	String name;
	
//	메소드(기능)
//	1-3 : 연관성있는 저장공간과 기능을 한 곳에 모아 관리
	int getTotal() {
//		매개변수로 따로 받지 않더라도 해당클래스 내에 필드로 선언되어 있어 사용 가능
		return math + eng + kor; 
	}
}
