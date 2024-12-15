package streamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest3 {
	public static void main(String[] args) {
		String[] names = {"Abc", "Def", "GhIj", "kLm"};
		String[] names2 = {"GhIj", "kLm", "Def", "Abc"};
		
//		스트림을 사용하여 대문자로 변환
		String[] upperName = Arrays.stream(names)	// 문자열 배열 names를 배열 Stream API로 사용
				.map(String::toUpperCase)			// 각 요소를 대문자로 바꿈
				.toArray(String[]::new);			// 바꾼 요소들을 선언해둔 upperName 배열에 대입
		
		System.out.println(upperName);
		
//		sortName 문자열 배열을 선언 후 names2 배열을 내림차순으로 정렬한 뒤 선언해둔 sortName 문자열(객체) 배열에 값 대입
		String[] sortName = Arrays.stream(names2).sorted().toArray(String[]::new);
		Arrays.stream(sortName).forEach(System.out::print);
		
//		Arrays.stream(upperName).forEach(System.out::println);	// upperName 배열의 요소마다 줄바꿈 후 전체 출력
				
//		스트림을 사용하여 리스트로 변환
//		List<String> upperList = Arrays.stream(names).map(String::toLowerCase).collect(Collectors.toList());
//		System.out.println(upperList);	// 전부 소문자로 담긴 것 확인
		
//		위 스트림을 사용하여 대문자로 변환한 코드를 for문으로 풀이한 것
//		for (int i = 0; i < names.length; i++) {
//			names[i] = names[i].toUpperCase();
//		}
//		System.out.println(Arrays.toString(names));
		
	}
}
