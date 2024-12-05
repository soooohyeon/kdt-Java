package classTask;
// 실습 01. 동물 클래스를 작성
public class Animal {
//	 필드(속성) : '이름', '나이', '종류'라는 필드
//	    - 이름 : 동물의 이름을 저장하는 곳
//	    - 나이 : 동물의 나이를 저장하는 곳
//	    - 종류 : 동물의 종류(개, 고양이, 새 등)를 저장하는 곳
	String name;
	int age;
	String group;
	
//	객체를 초기화하기 위한 생성자
	public Animal(String name, int age, String group) {
		this.name = name;
		this.age = age;
		this.group = group;
	}
	
//	 메서드(행동)
//	저장한 모든 정보 출력 메소드
//	매개변수 x, 리턴 x, 메소드명(printInfo)
	void printInfo() {
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age + ", 분류 : " + this.group);
	}
	
//	    - 밥먹기() : 동물이 밥을 먹는 행동을 하는 메서드
//	    - 놀기() : 동물이 노는 행동을 하는 메서드
//	    - 자다() : 동물이 자는 행동을 하는 메서드
//	    - 생일축하() : 동물의 생일을 축하하는 메서드
//	* 밥먹기
//	매개변수 x, 리턴 x, 메소드명(eat)
	void eat() {
		System.out.println(this.name + "이/가 사료를 먹고있습니다.");
	}
//	* 놀기
//	매개변수 x, 리턴 x, 메소드명(play)
	void play() {
		System.out.println(this.name + "이/가 놀고있습니다.");
	}
//	* 자기
//	매개변수 x, 리턴 x, 메소드명(sleep)
	void sleep() {
		System.out.println(this.name + "이/가 자고있습니다.");
	}
//	* 생일축하
//	매개변수 x, 리턴 x, 메소드명(birthday)
	void birthday() {
		System.out.println("축하합니다~\n" + this.name + "의 " + age + "번째 생일 입니다.");
	}
}
