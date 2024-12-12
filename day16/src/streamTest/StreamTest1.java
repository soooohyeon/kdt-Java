package streamTest;

import java.util.List;
import java.util.stream.IntStream;

public class StreamTest1 {
	public static void main(String[] args) {
//		선언적 방식과 명령적 방식
//		1 ~ 10까지 짝수만 필터링하기
//		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);	// 아래 배열과 유사함
		int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] evenNum = IntStream.of(number)	// 정수형 number 배열의 값을 반환
				.filter(n -> n % 2 == 0)		// 짝수 필터링해서 정수형 배열을 반환
				.map(n -> n * 2)				// 받은 배열을 각 * 2 연산 후 반환
				.toArray();						// 선언해둔 evenNum 배열에 값 대입
		
		System.out.println("number[0] : " + number[0]);		// 1
		System.out.println("evenNum[0] : " + evenNum[0]);	// 4
		
		for (int n : evenNum) {
			System.out.print(n + " ");
		}

		System.out.println();
		
//		위 Stream API를 사용한 결과를 for문으로 풀어서 작성한 것
		for (int n : number) {
			if (n % 2 == 0) {
				n *= 2;
				System.out.print(n + " ");
			}
		}
	}
}
