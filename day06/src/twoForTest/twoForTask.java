package twoForTest;
// 
public class twoForTask {
	public static void main(String[] args) {
//		**** 과제
//			1
//		   121
//		  12321
//		 1234321
//		123454321

		for (int i = 1; i < 6; i++) {
			for (int j = 5; j < 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < 5 ; k++) {
				System.out.print(k+1);
			}
			System.out.println();
		}
		
	}
}
