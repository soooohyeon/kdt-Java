package throwsTest;
//5. 예외 던지기 (throws는 메소드 선언부에 사용)
public class ThrowsTest {
	static void method() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);	// 정적메소드 사용 / 500 → 0.5초, 1000 → 1초
//				해당 메소드 사용 시 반드시 예외처리가 필요
//				왜? 메소드 선언해둔 곳에서 throws를 사용하여 예외 던지기를 작성해뒀기 때문
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		method();
	}
}
