package accessModifier;
//1. private 접근제한자
public class Person {
//	필드
//	String name;	// 아무것도 작성을 안했기 때문에 접근제한자 default
//	int age;		// 아무것도 작성을 안했기 때문에 접근제한자 default
	private String name;
	private int age;
	
//	메소드
	void printInfo() {	// 아무것도 작성을 안했기 때문에 접근제한자 default
		System.out.println(this.name + "님 환영합니다.");
	}

//	getter, setter 메소드
//	setter 메소드 : name 필드의 값 설정
	public void setName(String name) {
		this.name = name;
	}
//	getter 메소드 : name 필드의 값 반환
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
