package throwsTest;
//6. 예외 발생시키기 : throw new 예외명();
public class ThrowTest {
	public static void main(String[] args) {
		System.out.println("예외를 발생시킬 예정");
		
		throw new NumberFormatException();
//		위에서 강제로 예외를 발생시켰기 때문에 아래코드는 지우라고 일반 예외가 발생됨
//		System.out.println("출력 끝");
	}
}
