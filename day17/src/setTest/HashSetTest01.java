package setTest;

import java.util.HashSet;
import java.util.Set;

//10. HashSet 메소드 사용
public class HashSetTest01 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();	// 업캐스팅
		System.out.println(set);	// toString()이 생략되어 있고 오버라이딩되어있음
		
//		요소 추가 add
		set.add("강아지");
		set.add("고양이");
		set.add("치타");
		set.add("호랑이");
		set.add("코뿔소");
		set.add("코뿔소");
		set.add("코뿔소");			// 코뿔소란 값으로 3개를 넣었더라도 "코뿔소"는 1번만 들어감
		System.out.println(set);	// 입력한 순서와 다른 순서로 출력됨, 출력되기 위해 내부에서 Iterator 사용됨
		
//		요소 포함 contains
		System.out.println(set.contains("강아지"));	// true
		System.out.println(set.contains("사슴"));	// false
		
//		요소 제거 remove
		System.out.println(set.remove("치타"));	// 값이 있기때문에 true
		
//		크기 확인 size
		System.out.println(set.size());
		
//		모든 요소 제거 clear
		set.clear();
		System.out.println(set);
	}
}
