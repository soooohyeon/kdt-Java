package twoArray;

import java.util.Arrays;

//5. 배열의 정렬 (선택 정렬)
public class SelectionSort {
	public static void main(String[] args) {
		int[] number = {5, 2, 9, 1, 6};

		System.out.println("초기 배열 : " + Arrays.toString(number));
		
		for (int i = 0; i < number.length; i++) {
//			최소값 저장할 변수
			int minIdx = i;
			
//			최소값 찾기
			for (int j = 1 + i; j < number.length; j++) {
				if (number[j] < number[minIdx]) {
					minIdx = j;
				}
			}
//			최소값과 현재 요소 교환
			int temp = number[minIdx];
			number[minIdx] =  number[i];
	         number[i] = temp;

	         System.out.println((i + 1) + "단계 : " + Arrays.toString(number));

	      }
	      System.out.println("정렬완료 : " + Arrays.toString(number));
		
	}
}
