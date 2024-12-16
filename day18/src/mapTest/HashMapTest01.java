package mapTest;

import java.util.HashMap;
//1. HashMap : 스택 오버 플로우
public class HashMapTest01 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();
//		키와 값의 타입을 지정해줘야함
		System.out.println(map);	// toString() 생략됨
		
		HashMap<Object, Object> thisMap = new HashMap<>();
		thisMap.put(thisMap, thisMap);		// {(this Map)=(this Map)} 출력됨
		
//		thisMap.put("Key", thisMap);
//		thisMap.put(thisMap, "Value");	// 자기 참조 추가 -> 무한 재귀 발생
		// HashMap이 자기 자신을 값이나 키로만 포함시키는 경우,
		// hashCode() : 키와 값의 해시코드를 계산하는 과정에서 자기자신을 다시 호출 -> 무한 재귀
		// toString() : HashMap의 모든 키-값 쌍을 문자열로 변환하는 과정에서 자기 자신을 참조 -> 무한 재귀
//		System.out.println(thisMap.toString());	// StackOverFlow (재귀 호출) -> 넘쳐서 발생
	}
}
