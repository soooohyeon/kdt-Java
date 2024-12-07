package task1;

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
//	- calculateBonus()를 오버라이딩하여 salary * 0.2 반환
//	Developer 클래스
//	- calculateBonus()를 오버라이딩하여 salary * 0.15 반환
//	메인 메소드에서 다형성을 사용하여 Employee 타입 배열에 각 객체를 저장하고, 보너스 계산
	
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
		return this.salary * 0.1;
	}
	
	public static void main(String[] args) {
//		1) Manager와 Developer 객체에 각 데이터 초기화
//		2) 오버라이딩 메소드 사용해서 결과 출력
		Employee e = new Employee("나미리", 230);
		Manager m = new Manager("신형만", 350);
		Developer d = new Developer("봉미선", 270);
		
		System.out.println(e.name + "님의 급여 " + e.salary + "만원\n보너스 "
							+ e.calculateBonus() + "만원 추가 지급");
		System.out.println(m.name + "님의 급여 " + m.salary + "만원\n보너스 "
							+ m.calculateBonus() + "만원 추가 지급");
		System.out.println(d.name + "님의 급여 " + d.salary + "만원\n보너스 "
							+ d.calculateBonus() + "만원 추가 지급");
	}
}
