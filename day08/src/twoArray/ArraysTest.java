package twoArray;

import java.util.Arrays;

//7. Arrays.sort()를 이용한 정렬
public class ArraysTest {
	public static void main(String[] args) {
		int[] number = {5, 2, 9, 1, 6};
		
		System.out.println("정렬 전 : " + Arrays.toString(number));
		
//		Arrays.sort(number);
//		↓ 부분정렬 : 1번째 부터 3번째 까지의 인덱스만 정렬↓
		Arrays.sort(number, 1 ,4);
		
		System.out.println("정렬 후 : " + Arrays.toString(number));
	}
}
