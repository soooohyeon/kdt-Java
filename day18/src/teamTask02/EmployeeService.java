package teamTask02;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService {
//	HashMap의 Key는 사원의 Id(String), Value는 이름, 나이, 부서로 설정
//	- 조건 1. 새로운 사원정보를 추가
//			 각 팀원들 이름, 나이, 부서(개발부서 or 보안부서 중 택 1)
//	- 조건 2. 특정 ID(팀장)의 사원정보를 출력
//	- 조건 3. 모든 사원의 정보 출력 (반드시 EntrySet 사용)
//	- 조건 4. 모든 사원 정보에 연봉 추가(연봉은 3000으로 통일)
	
	private Map<String, Employee> map = new HashMap<>();

//	메소드 01. - 새로운 사원정보를 추가
//	리턴타입 : void
//	메소드명 : addEmployee
//	매개변수 : string id, Employee
//	실행코드
//		put() 메소드 사용해서 객체 추가
	void addEmployee(String id, Employee employee) {
		map.put(id, employee);
		System.out.println("사원 등록이 되었습니다.");
	}
	
//	메소드 02. - 특정 ID(팀장)의 사원정보를 출력
//	리턴타입 : Employee
//	메소드명 : printEmployee
//	매개변수 : String id
//	실행코드
	Employee printEmployee(String id) {
		return map.get(id);
	}
	
//	모든 사원의 정보 출력 (반드시 EntrySet 사용)
//	리턴타입 : void
//	메소드명 : printEmployeeAll
//	실행코드
	void printEmployeeAll() {
		for (Map.Entry<String, Employee> entry : map.entrySet()) {
			System.out.println("사원번호 : " + entry.getKey() + "\n" + entry.getValue());
		}
	}
	
//	모든 사원 정보에 연봉 추가(연봉은 3000으로 통일)
//	리턴타입 : void
//	메소드명 : addSalary
//	매개변수 : int salary
//	실행코드
//		map의 값인 Employee의 setter 메소드로 salary 전달
//		모든 사원 정보 출력 메소드 호출
	void addSalary(int salary) {
		(map.values()).stream().forEach(em -> em.setSalary(salary));
//		printEmployeeAll();
	}
}
