package review01;

public class Employee {
//	1) 직원 프로그램
//	Employee 클래스
//	필드 
//	   name, salary
//	메소드
//	   calculateBonus() : 기본적으로 salary * 0.1 반환
	
//	필드
	String name;
	int salary;
	
//	생성자
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

//	메소드
	double calculateBonus() {
		return salary * 0.1;
	}
	
}
