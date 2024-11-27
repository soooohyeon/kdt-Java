package ifTest;
// 7번 : 조건문 (if-else if-else문)
public class IfTest03 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		
		System.out.println("1번");
		
		if (num1 > num2) {
			System.out.println("2번");	// 실행 안됨
		} else if (num1 < num2) {
			System.out.println("3번");
		} else {
			System.out.println("4번");	// 실행 안됨
		}
		
		System.out.println("5번");
	}
}
