package ifTest;
// 5번 : 조건문 (if문)
public class IfTest01 {
	public static void main(String[] args) {
		System.out.println("1번");
		
		if (true) {
			System.out.println("2번");
		}
		
//		오류가 발생하진 않으나 실행이 안될 코드라며 이클립스에서 알려줌
		if (10 < 10) {
			System.out.println("3번");
		}
		
		System.out.println("4번");
		
	}
}
