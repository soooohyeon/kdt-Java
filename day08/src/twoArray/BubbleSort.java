package twoArray;

import java.util.Arrays;

//6. 배열의 정렬 (버블 정렬)
public class BubbleSort {
	public static void main(String[] args) {
		int[] number = {5, 2, 9, 1, 6};
		
		System.out.println("초기 배열 : " + Arrays.toString(number));
		
		for (int i = 0; i < number.length; i++) {
			boolean swapped = false;	// 교환 발생 여부
			for (int j = 0; j < number.length - 1 - i; j++) {
				if (number[j] > number[j + 1]) {
//					두 요소 교환 (swap)
					int temp = number[j];
					number[j] = number[j  + 1];
					number[j + 1] = temp;
					swapped = true;
				}
			}
			System.out.println((i + 1) + "단계 : " + Arrays.toString(number));
//			교환이 없으면 정렬 종료
			if (!swapped) {
				break;
			}
		}
	      System.out.println("정렬완료 : " + Arrays.toString(number));
	}
//	      초기 배열 : [5, 2, 9, 1, 6]
//	      1단계 : 5 > 2, 9 > 1, 6 > 9
//	      2단계 : 5 > 1, 6 > 5
//	      3단계 : 2 > 1
//	      4단계 : 교환 없음
}
