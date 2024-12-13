package listTest;

import java.util.ArrayList;
import java.util.List;

//8. 컬렉션 프레임워크 : ArrayList, 제네릭
public class ArrayListTest03 {
	public static void main(String[] args) {
//		List<Integer> ll = new ArrayList<>();		// 업캐스팅으로 해당 형태도 자주 사용
		ArrayList<Integer> li = new ArrayList<>();
		
//		추가
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		System.out.println(li);
		
//		값 가져오기 : 인덱스 번호로 특정 값 가져오기
		try {
			System.out.println(li.get(0));
			System.out.println(li.get(10));
		} catch (Exception e) {		// 어떠한 예외인지 저장해두지 않았기 때문의 부모인 Exception으로 예외 처리
			System.out.println("범위를 벗어났습니다.");
		}
		
//		삭제 : 인덱스 번호(int 타입)로 삭제
//		삭제한 요소를 반환
		System.out.println("인덱스 1의 값 " + li.remove(1) + "을 삭제하였습니다.");
		System.out.println(li);
		
//		삭제 : 값으로 검색하여 삭제 (Object 타입)
//		성공여부 반환
		System.out.println("값 삭제 여부  " + li.remove(Integer.valueOf(50)));
		
//		포함여부 검사 : 리스트에 존재하면 true, 없으면 false
		System.out.println(li.contains(40));
		System.out.println(li.contains(100));

		// 수정
//		수정 : 수정 전의 값  발환
		System.out.println(li);
		System.out.println(li.set(2, 50));
		System.out.println(li);
	}
}
