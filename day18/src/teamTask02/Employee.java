package teamTask02;

public class Employee {
//	사원의 Id(String), 이름, 나이, 부서, 연봉으로 설정
	
//	필드
	private String id;
	private String name;
	private int age;
	private String team;
	private int salary;
		
	public Employee(String id, String name, int age, String team) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.team = team;
	}

//	getter, setter
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getTeam() {
		return team;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//	hashCode() 오버라이딩
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
//	equals() 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Employee) {
			return ((Employee) obj).name.equals(this.name);
		}
		
		return false;
	}
	
//	toString() 오버라이딩
	@Override
	public String toString() {
		return "id : " + id + ", name : " + name + ", age : " + age + ", team : " + team + ", salary : " + salary;
	}
}
