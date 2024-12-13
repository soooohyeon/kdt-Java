package setTest;

import java.util.HashSet;

//11. HashSet 
public class HashSetTest02 {
	public static void main(String[] args) {
//		HashSet 객체 생성
		HashSet<Student> set = new HashSet<>();
		System.out.println(set);	// 비어있음
		System.out.println(set.toString());	// 비어있음
		
//		Student 객체 생성
		Student st1 = new Student(1, "신짱구");
		Student st2 = new Student(1, "신짱구");
		
		set.add(st1);	// Student 클래스 타입으로 추가
		set.add(st2);	// st1과 다름 (해시코드를 기준으로 주소값이 다르기 때문) / 해서 
		System.out.println(set);	// 참조값으로 나옴 - 정보를 보기 위해서 toString 오버라이딩
		
	}
}
