package throwsTest;

import java.util.Scanner;

//6.
public class ThrowsTest2 {
	static void method1() throws NumberFormatException {	// 2. 메소드 호출한 곳으로 예외 던지기 (넘기기)
		System.out.print("반드시 양수만 입력 : ");
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		if (result <= 0) {
			throw new NumberFormatException();	// new 생성자();, 1. 강제 예외 발생
		}
		System.out.println("입력한 숫자는 " + result + "입니다.");
	}
	
	public static void main(String[] args) {
		try {
			method1();	// 3. 메소드 사용
		} catch (NumberFormatException e) {	// 4. 받은 예외 처리하기
			e.printStackTrace();
		}
	}
}
