package streamTest;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTest2 {
	public static void main(String[] args) {
		String[] names = {"짱구", "철수", "흰둥이", "맹구", "유리"};
		
//		배열로 스트림 생성
//		Arrays.stream()
//		Stream.of()
		
		Arrays.stream(names).forEach(System.out::println);	// 문자열 배열의 요소를 1개씩 줄바꿈해서 출력해줌
		System.out.println(Arrays.stream(names).count());	// 요소의 개수 출력해줌, 5출력됨
		System.out.println(names.length);
		
//		범위 스트림 (숫자 범위)
//		IntStream, LongStream, DoubleStream의 range()
//		rangeClosed()
		
//		범위 : 1 ~ 9까지 띄어쓰기 없이 출력
//		IntStream.range(1, 10).forEach(System.out::print);
		
		System.out.println();
		
//		범위 : 1 ~ 10까지 띄어쓰기 없이 출력
//		IntStream.rangeClosed(1, 10).forEach(System.out::print);
		
//		Stream API 사용해서 1 ~ 10까지 값을 배열에 넣기
		int[] ar = IntStream.rangeClosed(1, 10).toArray();
//		배열 출력
		System.out.println(Arrays.toString(ar));
	}
}
