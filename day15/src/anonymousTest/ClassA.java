package anonymousTest;
//3. 익명클래스 - 인터페이스 구현하는 클래스
public class ClassA implements InterA {
	@Override
	public void printData() {
		System.out.println("ClassA에서 메소드 오버라이딩");
	}
}
