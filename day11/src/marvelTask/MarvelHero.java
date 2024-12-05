package marvelTask;
//11. 실습 연습
public class MarvelHero {
//	마블에 나오는 히어로를 객체로 만들어 출력하기
//	필드 - 이름, 슈퍼파워 (String superPower : 공격력), 나이
	String name;
	String superPower;
	int age;
	
//	생성자 - 모든 필드를 매개변수로 받는 생성자
//		추가) 생성자 내에서 this 출력 / this : 객체를 구별하기 위한 변수 (해당 객체의 참조값이 들어있음)
	public MarvelHero(String name, String superPower, int age) {
		this.name = name;
		this.superPower = superPower;
		this.age = age;
		System.out.println(name + "의 생성자 : " + this);
	}
	
//	메소드
//	정보출력 메소드 (printInfo()) - 모든 필드 내용 출력
//	1) 출력하는 메소드기 때문에 void
//	2) 필드의 값을 출력하면 되기 때문에 this 키워드 필요없이 각각 필드 이름으로 출력
	void printInfo() {
		System.out.println(name + "의 힘은 " + superPower + "이고, 나이는 " + age + "살 입니다.");
		System.out.println(this.name + "의 힘은 " + this.superPower + "이고, 나이는 " + this.age + "살 입니다.");
	}
	
//	히어로 액션 메소드 (performAction())
//	히어로 이름과 액션 출력 (아이언맨이 강력한 갑옷을 사용합니다)
//	1-1) 리턴타입 없이 void
//	1-2) 리턴타입 있을 때 String
//	** 매개변수 : 호출때 각 객체의 필드를 사용하니 매개변수를 받을 필요없음
//	** 객체 필드의 값을 출력하면 되기 때문에 this 키워드 필요없이 각각 필드 이름으로 출력 가능
//	3) 출력 (name은 superPower을 사용합니다)
//	1-1)
//	void performAction(String name, String superPower) {
//		System.out.println(name + "이/가 " + superPower + "을/를 사용합니다.");
//	}
	
//	1-2)
	String performAction() {
		return (name + "이/가 " + superPower + "을/를 사용합니다.");
	}
	
	
}
