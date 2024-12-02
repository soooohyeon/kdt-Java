package twoArray;
//3. 2차원 배열
public class TwoArrayTest03 {
	public static void main(String[] args) {
//		1	2	3	4
//		5	6	7	8
//		9	10	11	12
		
//		1. 값 넣고 각 값을 출력하기 ar1
//		1) for-each 사용해서 출력 바깥 for-each는 행의 주소값, 안쪽 for-each는 각 행의 인덱스 반복
		int[][] ar1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		
//		2차원 배열의 각 행의 주소값 구하기(1)
//		for (int[] data : ar1) {
//			for (int data2 : data) {
//				System.out.print(data2 + "\t");
//			}
//			System.out.println();
//		}
		
//		2차원 배열의 각 행의 주소값 구하기(2)
		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar1[i].length; j++) {
				System.out.print(ar1[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		2. 칸 수만 알도록 선언 후 값 대입 후 출력하기 ar2
//		1) 2차원 배열 선언 및 생성
//		2) 값 대입 for (행 길이 만큼 반복) {
//		3) 		for (열 길이 만큼 반복) {
//		4)			값 = 각행의 시작 값이 i * 3 + j + 1; } }
//		5) for-each 사용해서 출력 바깥 for-each는 행의 주소값, 안쪽 for-each는 각 행의 인덱스 반복

		int[][] ar2 = new int [4][3];
		
////		값 넣기 (1)
//		for (int i = 0; i < ar2.length; i++) {
//			for (int j = 0; j < ar2[i].length; j++) {
//				ar2[i][j] = (i * 3) + j + 1;
//			}
//		}

//		값 넣기 (2)
		int value = 1;	// 배열에 넣을 값 변수
		for (int i = 0; i < ar2.length; i++) {
			for (int j = 0; j < ar2[i].length; j++) {
				ar2[i][j] = value++;	// 누적변수 활용해 값 대입
			}
		}
		
		for (int[] data3 : ar2) {
			for (int data4 : data3) {
				System.out.print(data4 + "\t");
			}
			System.out.println();
		}
		
	}
}
