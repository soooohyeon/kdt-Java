package doWhileTest;
// 1번 : 반복문(do-while문)
public class DoWhileTest {
	public static void main(String[] args) {
		boolean isFalse = false;
		
//		while문 → 실행안됨
		while (isFalse) {
			System.out.println("안녕");
		}
		
//		do-while문 → while의 조건식이 false이기 때문에 최소 1번 실행
		do {
			System.out.println("안녕");
		} while (isFalse);
		
		System.out.println("출력 끝");
	} 
}
