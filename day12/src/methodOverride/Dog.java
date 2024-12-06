package methodOverride;

public class Dog extends Animal {
//	생성자
	public Dog(String name) {
		super(name);
	}
//	메소드 오버라이딩 : 부모 클래스의 메소드를 자식클래스에서 재정의
//	매개변수의 개수, 타입, 순서에 따라 여러번 정의할 수 있는 오버로딩과 달리 오버라이딩은 1회만 가능
//	상단 source 탭 > Override/Implement Methods 클릭 또는
//	Alt + Shift + s + v
	@Override
	void sound() {
		System.out.println(this.name + "의 멍멍!");
	}
	
}
