package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.Collectors;

public class LottoList {
	public static void main(String[] args) {
//		ArrayList, HashSet을 사용하여 중복을 허용하지 않는 6개의 랜덤숫자를 저장
//		Random 클래스를 이용하여 1 ~ 45사이의 랜덤 숫자를 생성
//		정렬해서 출력 collections
		
//		1. Random 클래스 사용을 위해 객체 생성
//		2. HashSet 선언 및 생성
//		3. while (true)
//			HashSet 객체명.add(랜덤메소드)	→ nextInt(45)+1 → 1 ~ 45 사이에 랜덤숫자 생성됨
//			if (HashSet 객체명.size() == 6) 일때 반복종료
//		정렬 (1)
//		4. StreamAPI 사용해서 정렬 후 List에 담기 (업캐스팅)
//		5. List에 담은 배열 다시 ArrayList에 담기 (다운캐스팅)
//		정렬 (2)
//		4. 새로 생성한 ArrayList에 빠른 for문 사용해서 HashSet 요소 담기
//		5. Collections.sort() 사용 후 출력
		Random r = new Random();
		HashSet<Integer> hs = new HashSet<>();
		while(true) {
			hs.add(r.nextInt(45)+1);
			if (hs.size() == 6) {
				break;
			}
		}
//		정렬 (1)
		ArrayList<Integer> li = (ArrayList<Integer>)(hs.stream().sorted().collect(Collectors.toList()));	// 다운캐스팅
//		li.stream().forEach(System.out::println);
		
//		정렬 (2)
//		ArrayList<Integer> li2 = new ArrayList<>();
//		for (int data : hs) {
//			li2.add(data);
//		}
		ArrayList<Integer> li2 = new ArrayList<>(hs);
		Collections.sort(li2);
		System.out.println(li);
	}
}
