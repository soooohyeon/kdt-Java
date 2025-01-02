package teamTask02;

public class Main {
	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		
//		값 전달하기 위한 객체 생성
		Employee e1 = new Employee("E1", "짱구", 25, "개발");
		Employee e2 = new Employee("E2", "맹구", 25, "개발");
		Employee e3 = new Employee("E3", "철수", 25, "개발");
		Employee e4 = new Employee("E4", "유리", 25, "보안");
		
//		사원 추가
		es.addEmployee(e1.getId(), e1);
		es.addEmployee(e2.getId(), e2);
		es.addEmployee(e3.getId(), e3);
		es.addEmployee(e4.getId(), e4);
		
//		특정 사원 출력
		System.out.println("사원 정보 : " + es.printEmployee("E1"));
		
//		연봉 추가
		es.addSalary(3000);
		
//		전체 정보 추가
		es.printEmployeeAll();
		
	}
}
