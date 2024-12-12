package streamTest;

import java.util.List;
import java.util.stream.IntStream;

public class StreamTest1 {
	public static void main(String[] args) {
//		선언적 방식과 명령적 방식
//		1 ~ 10까지 짝수만 필터링하기
//		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);	// 아래 배열과 유사함
		int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] evenNum = IntStream.of(number)
				.filter(n -> n % 2 == 0)	// 짝수 필터링
				.map(n -> n * 2)
				.toArray();
		
		System.out.println("number[0] : " + number[0]);		// 1
		System.out.println("evenNum[0] : " + evenNum[0]);		// 2
		
		for (int n : evenNum) {
			System.out.print(n + " ");
		}

		System.out.println();
		
		for (int n : number) {
			if (n % 2 == 0) {
				n *= 2;
				System.out.print(n + " ");
			}
		}
	}
}
