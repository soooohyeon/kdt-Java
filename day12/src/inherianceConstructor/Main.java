package inherianceConstructor;

public class Main {
	public static void main(String[] args) {
		Child c = new Child();
//		자식 클래스 객체 생성시 부모 생성자 먼저 실행 후 자식 클래스의 생성자 실행 = 자식 객체
		c.printStr("상속");
		c.printInt(4);
	}
}
