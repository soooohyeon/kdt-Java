package streamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest3 {
	public static void main(String[] args) {
		String[] names = {"Abc", "Def", "GhIj", "kLm"};
		
//		스트림을 사용하여 대문자로 변환
//		String[] upperName = Arrays.stream(names).map(String::toUpperCase).toArray(String[]::new);
//		System.out.println(upperName);
//		
//		Arrays.stream(upperName).forEach(System.out::println);
				
//		스트림을 사용하여 리스트로 변환
		List<String> upperList = Arrays.stream(names).map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(upperList);	// 전부 소문자로 담긴 것 확인
		
//		위 스트림을 사용하여 대문자로 변환한 코드를 for문으로 풀이한 것
//		for (int i = 0; i < names.length; i++) {
//			names[i] = names[i].toUpperCase();
//		}
//		System.out.println(Arrays.toString(names));
		
	}
}
