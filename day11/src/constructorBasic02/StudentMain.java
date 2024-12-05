package constructorBasic02;
//7. 기본 생성자 확인
class Student {
//	필드
	String name;
	int age;
	
//	기본 생성자
	public Student() {
		System.out.println("기본 생성자 호출");
	}
}

public class StudentMain {
	public static void main(String[] args) {
		Student st1 = new Student();	// 객체 생성시 기본 생성자 호출 (기본생성자 안 출력문 먼저 출력)
		st1.name = "짱구";
		System.out.println(st1.name);
	}
}
