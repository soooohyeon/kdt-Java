package casting3;
//7. 캐스팅 특징
public class Dog extends Animal {
//	메소드 오버라이딩
	@Override
	void crying() {
		System.out.println("멍멍!");
	}
	
//	생성자
	public Dog(String name) {
		super(name);
	}
	
//	메소드
	void walk() {
		   System.out.println("산책가기");
	}	
}
