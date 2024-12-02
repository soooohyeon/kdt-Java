package twoArray;

import java.util.Arrays;

//8. Arrays.toString()를 이용한 출력
public class ArraysTest02 {
	public static void main(String[] args) {
//		1차원 배열
		int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
//		2차원 배열
		int number2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		System.out.println(number);
		System.out.println("1차원 배열의 값 출력 : " + Arrays.toString(number));
		System.out.println(number2);
		System.out.println("1차원 배열의 값 출력(참조값) : " + Arrays.toString(number2));
		System.out.println("2차원 배열의 값 출력 : " + Arrays.deepToString(number2));
	}
}