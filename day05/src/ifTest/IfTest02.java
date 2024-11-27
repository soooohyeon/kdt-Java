package ifTest;
// 6번 : 조건문 (if-else문)
public class IfTest02 {
	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20;
		System.out.println("1번");
		
		if (num1 > num2) {
			System.out.println("2번");		// 실행 안됨
		} else {
			System.out.println("3번");
		}
		
		System.out.println("4번");
		
	}
}
