package task1;

public class Manager extends Employee {
//	Manager 클래스
//	- calculateBonus()를 오버라이딩하여 salary * 0.2 반환
//	** 로직
//	1) Employee 클래스 상속받기
//	2) 메소드 오버라이딩
	
//	생성자
	public Manager(String name, int salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculateBonus() {
		return this.salary * 0.2;
	}
}
