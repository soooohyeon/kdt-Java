package streamTest;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTest2 {
	public static void main(String[] args) {
		String[] names = {"짱구", "철수", "흰둥이", "맹구", "유리"};
		
//		배열로 스트림 생성
//		Arrays.stream()
//		Stream.of()
		
		Arrays.stream(names).forEach(System.out::println);
		
//		범위 스트림 (숫자 범위)
//		IntStream, LongStream, DoubleStream의 range()
//		rangeClosed()
		
//		범위 : 1 ~ 9까지 띄어쓰기 없이 출력
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
//		범위 : 1 ~ 10까지 띄어쓰기 없이 출력
		IntStream.rangeClosed(1, 10).forEach(System.out::print);
		
	}
}
