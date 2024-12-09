package review01;

public class Main {
	public static void main(String[] args) {
//			1) 직원 프로그램
//			Employee 클래스
//			필드 
//			   name, salary
//			메소드
//			   calculateBonus() : 기본적으로 salary * 0.1 반환
//			Manager와 Developer 클래스는 Employee 클래스 상속
//			Manager 클래스
//			   calculateBonus()를 오버라이딩하여 salary * 0.2 반환
//			Developer 클래스
//			   calculateBonus()를 오버라이딩하여 salary * 0.15 반환
//			메인 메소드에서 다형성을 사용하여 Employee 타입 배열에 각 객체를 저장하고, 보너스 계산
		
//		** 사용되어야 하는 문법 / 개념 : 클래스, 상속, 메소드 오버라이딩
	      Employee e = new Employee("짱구", 8000);
	      Manager m = new Manager("철수", 6000);
	      Developer d = new Developer("유리", 5500);

//	      m과 d도 부모클래스의 상속을 받기 때문에 Employee 클래스 배열에 들어갈 수 있음
	      Employee[] emp = { e, m, d };

	      for (Employee em : emp) {
	         System.out.println(em.name + "의 보너스는 " + em.calculateBonus());
	      }

	}
}
