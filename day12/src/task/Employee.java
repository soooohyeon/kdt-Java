package task;

public class Employee {
//	1) 직원 프로그램
//	Employee 클래스
//	필드 
//	   name, salary
//	메소드
//	   calculateBonus() : 기본적으로 salary * 0.1 반환
//
//	Manager와 Developer 클래스는 Employee 클래스 상속
//	Manager 클래스
//	   calculateBonus()를 오버라이딩하여 salary * 0.2 반환
//	Developer 클래스
//	   calculateBonus()를 오버라이딩하여 salary * 0.15 반환
//	메인 메소드에서 다형성을 사용하여 Employee 타입 배열에 각 객체를 저장하고, 보너스 계산
	
//	필드
	String name;
	int salary;
	
//	메소드
	double calculateBonus() {
		return this.salary * 0.1;
	}
}
