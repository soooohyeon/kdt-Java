package section10;

// 예제 04.
class Person {	// 부모 클래스 선언
//	필드
	String name;
	int age;
	
//	초기화를 위한 생성자 선언
	public Person(String name, int age) {
//		필드의 변수와 매개변수명을 구분하기 위해 필드변수명 앞에 this 키워드를 붙여줌
//		해당 객체에 맞는 값으로 초기화 되므로 this는 객체 자기 자신을 의미
		this.name = name;
		this.age = age;
	}
}

//예제 05.
class Customer extends Person {	// 자식 클래스이며 부모 클래스인 Person을 상속 받음
//	부모 필드와는 개별적인 필드 선언
	int memberID;
	
//	부모 클래스의 생성자인 super() 메소드를 사용하여 값을 전달해줬고, 추가로 작성한 필드도 초기화를 위해 작성해줌
	public Customer(String name, int age, int memberID) {
		super(name, age);
		this.memberID = memberID;
	}
	
//	메소드
	void Enter() {
		System.out.println("회원번호 : " + memberID + " (" + name + ", " + age + "세) 님 입장하셨습니다.");
	}
}

public class InheritanceTest02 {
	public static void main(String[] args) {
//		예제 06.
		Customer c1 = new Customer("박자바", 25, 11111);	// 각 클래스에서 생성한 생성자의 매개변수에 맞게 값을 입력해줘야함
		c1.Enter();	// 자식 클래스의 메소드 호출
		
		Customer c2 = new Customer("송코딩", 20, 22222);
		c2.Enter();
	}
}
