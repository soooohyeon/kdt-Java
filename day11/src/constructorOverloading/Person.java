package constructorOverloading;
//10. 생성자 오버로딩
public class Person {
//	필드
	String name;
	int age;
	String job;
	
//	1. 기본 생성자
	public Person() {
		this.name = "이름없음";
		this.age = 0;
		System.out.println(this);
		System.out.println("기본생성자가 호출됨.");	// 
	}

//	2. 이름만 초기화하는 생성자
	public Person(String name) {	// PersonMain 클래스에 p2에 호출됨
		this.name = name;
	//	this.age = 20; // 나이에 기본값 설정
		System.out.println("이름은 인수로 받고, 나이는 0살이 기본값인 생성자 호출됨");
	}

//	3. 이름과 나이를 초기화 하는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.job = "미정";	// 매개변수로 받지 않더라도 생성자로 기본값을 설정해둘 수 있음
							// 추후 다시 해당 필드를 호출해서 수정 가능
		System.out.println("이름과 나이를 초기화하는 생성자 호출");
	}

//	4. 나이와 이름을 초기화 하는 생성자
	public Person(int age, String name) {
		this.name = name;
		this.age = age;
	}

//	5. 이름과 직업을 초기화 하는 생성자
	public Person (String name, String job) {
			
		}
	
//	6. 직업과 이름을 초기화 하는 생성자 → 자료형의 타입이나, 순서, 개수가 달라야 오버로딩 가능
//		변수명과는 무관함
//	public Person (String job, String name) { }
	
//	7. 모든 필드 값 초기화
	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
}


