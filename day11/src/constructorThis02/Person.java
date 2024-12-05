package constructorThis02;
//13. 실습 연습
public class Person {
//	필드
	String name;
	int age;
	
//	생성자
//	기본 생성자
	public Person() {
	}
//	이름만 매개변수로 받는 생성자
	public Person(String name) {
		this(name, 10);
		System.out.println("이름의 매개변수를 받는 생성자가 호출됨");
	}
//	모든 필드의 매개변수를 받는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
//	메소드
//	printInfo() : 정보 출력
	void printInfo () {
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
//		this를 사용하여 현재 객체의 다른 메소드 호출
		this.greet();	// → 메소드 호출은 메소드 안에서도 가능하기때문에 자기 자신의 메소드를 불러오는 것 가능
	}
	
//	greet() : 이름님 안녕하세요 출력
	void greet () {
		System.out.println(this.name + "님 안녕하세요.");
	}
}
