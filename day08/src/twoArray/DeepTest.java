package twoArray;

import java.util.Arrays;

//11. 깊은 복사
public class DeepTest {
	public static void main(String[] args) {
		int original[] = { 1, 2, 3 };

//		깊은 복사
		int deepCopy[] = new int[original.length];
		for (int i = 0; i < original.length; i++) {
			deepCopy[i] = original[i];
		}

		System.out.println("원본 배열 : " + Arrays.toString(original));
		System.out.println("깊은 복사 배열 : " + Arrays.toString(deepCopy));

//		복사본 수정
		deepCopy[0] = 999;
		System.out.println("수정 후 원본 배열 : " + Arrays.toString(original));
		System.out.println("수정 후 깊은 복사 배열 : " + Arrays.toString(deepCopy));

	}
}
