package task1;

public class Developer extends Employee {
//	Developer 클래스
//	- calculateBonus()를 오버라이딩하여 salary * 0.15 반환
//	** 로직
//	1) Employee 클래스 상속받기
//	2) 메소드 오버라이딩

//	생성자
	public Developer(String name, int salary) {
		super(name, salary);
	}

	@Override
	double calculateBonus() {
		return this.salary * 0.15;
	}
}
