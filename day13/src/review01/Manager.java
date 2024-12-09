package review01;

public class Manager extends Employee {
//	필드 ⇒ x
	
//	생성자
	public Manager(String name, int salary) {
		super(name, salary);
	}

//	메소드 오버라이딩
	@Override	// → (@ 어노테이션) 해당 키워드를 반드시 붙여줘야함
	double calculateBonus() {
		return salary * 0.2;
	}
}
