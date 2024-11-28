package doWhileTest;
// 6번 : 기타 제어문(break문)
public class BreakTest {
	public static void main(String[] args) {
//		1 ~ 10까지 중 5까지만 출력
		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//			if (i == 5) {
//				break;		// 반복문 즉시 탈출, break 사용 위치에 따라 코드가 달라질 수 있음
//			}
			if (i == 6) {
				break;		// 반복문 즉시 탈출
			}
			System.out.println(i);
		}
		System.out.println("출력 끝");
		
//		1 ~ 10까지 중 7까지만 출력 (while문)
		int num = 0;
		while (num < 10) {
			if (num > 6) {
				break;
			}
			System.out.println(num + 1);
			num++;
		}
	}
}
