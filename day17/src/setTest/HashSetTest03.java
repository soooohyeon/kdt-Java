package setTest;

import java.util.ArrayList;
import java.util.HashSet;

//13.
public class HashSetTest03 {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(20);
		li.add(20);
		li.add(20);
		li.add(30);
		System.out.println(li);
		System.out.println(li.size());
		
		HashSet<Integer> set = new HashSet<>(li);
//		HashSet의 생성자 중 Collection을 매개변수로 받는 생성자가 있음
//		즉, 업캐스팅되며 HashSet에 저장됨 / 중복 제거, 순서 뒤죽박죽
		System.out.println(set);
		ArrayList<Integer> result = new ArrayList<>(set);
//		HashSet에서 중복은 제거되고 순서는 뒤죽박죽인 상태로 ArrayList로 다시 저장되면서 그대로 인덱스가 부여됨
		System.out.println(result);
		
		
	}
}
