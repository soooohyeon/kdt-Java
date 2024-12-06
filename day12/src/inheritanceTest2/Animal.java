package inheritanceTest2;
//8. 상속
public class Animal {
//	필드
	String name;
	int age;
	String type;
	
//	메소드
	void eat(String food) {
		System.out.println(this.name + "이/가 " + food + "을 먹고있습니다.");
	}
	
	void play() {
		System.out.println(this.name + "이/가 놀고 있습니다.");
	}
	
	void sleep() {
		System.out.println(this.name + "이/가 자고 있습니다.");
	}
	
	void birthday() {
		this.age++;
		System.out.println(this.name + "의 생일입니다!\n이제 " + this.age + "살 입니다.");
	}
	
}
