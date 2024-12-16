package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//2. HashMap
public class HashMapTest02 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		System.out.println(map);

		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		System.out.println(map);
		
		map.put("a", 100);
		System.out.println(map);

		map.put("e", 1);	// 키는 중복 불가, 값은 중복 가능
		System.out.println(map);
		System.out.println(map.get("d"));	// get() 메소드는 반환타입 O
		
		System.out.println(map.size());
		
		System.out.println(map.keySet());	// 키만 모아서 출력해줌
		System.out.println(map.values());	// 값만 모아서 출력해줌
		// keySet() 메소드 반환타입은 Set이나 순서가 유지되는 상태로 출력되는 이유 -> Iterator
		// keySet() 메소드는 HashMap 클래스의 내부클래스 안에 존재
		
		HashMap<String, Integer> mart = new HashMap<>();
//		추가
		mart.put("새우깡", 2200);
		mart.put("빼빼로", 2000);
		mart.put("포카칩", 1500);
		mart.put("양파링", 1900);
		System.out.println(mart);
		
//		조회
		System.out.println(mart.get("새우깡"));
		System.out.println(mart.get("꼬북칩'"));	// 값이 들어있지 않다면 null이 나옴
		
//		삭제
//		mart.remove("빼빼로");
		System.out.println("삭제 시 : " + mart.remove("빼빼로"));
		System.out.println(mart);
		
//		길이
		System.out.println(mart.size());
		
//		key에 포함되어있는지 확인
		System.out.println(mart.containsKey("새우깡"));
		
//		value에 포함되어있는지 확인
		System.out.println(mart.containsValue("새우깡"));
		// 타입이 다른 Value에 넣어도 오류가 발생하진 않으나 검색 불가
		
		System.out.println("============================");
		
//		Iterator
//		Key만 가져오기
		System.out.println(mart.keySet());
		Iterator<String> iter = mart.keySet().iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
//		Value만 가져오기
		System.out.println(mart.values());
		Iterator<Integer> iter2 = mart.values().iterator();
		while (iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		System.out.println(iter2);	// 내부 클래스
		
//		Entry, Key, Value 한쌍씩 가져오기 - Entry는 HashMap에 구현되어있음
		Set<Entry<String, Integer>> items = mart.entrySet();
	    for (Entry<String, Integer> entry : items) {
	    	System.out.println(entry);
	    }

	}
}
