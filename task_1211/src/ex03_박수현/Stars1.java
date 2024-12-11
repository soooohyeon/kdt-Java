package ex03_박수현;

public class Stars1 {
	public static void main(String[] args) {
//		3.
//		(1) 피라미드 출력
//		- 클래스명 : Stars1
//		[입출력결과]
//		   *
//		  * *
//		 * * *
//		이중 for 문 사용해서 바깥 for문으로 행 반복
//		첫 번째 안쪽 for문으로 공백 출력, 두 번째 안쪽 for문으로 * 출력
		for (int i = 0; i < 3; i++) {
			for (int j = 2; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			} 
			System.out.println();
		}
		System.out.println();
	}
}
