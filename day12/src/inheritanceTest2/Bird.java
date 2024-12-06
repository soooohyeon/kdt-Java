package inheritanceTest2;

public class Bird extends Animal {
//	새 클래스의 고유 메소드
	void fly() {
		System.out.println(this.name + "이/가 하늘을 날고 있습니다~");
	}
}
