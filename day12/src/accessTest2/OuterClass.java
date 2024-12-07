package accessTest2;

import accessTest1.Parent;

public class OuterClass {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.publicValue);
		p.printAccess();	// Parent 클래스 메소드 사용
	}
}
