package listTest;

import java.util.ArrayList;

//7. 컬렉션 프레임워크 : ArrayList
public class ArrayListTest01 {
	public static void main(String[] args) {
//		ArrayList 객체 생성 - import 받아야함
		ArrayList al = new ArrayList();
		System.out.println(al);	// toString이 생략되어있음 - 오버라이딩 되어있음
		System.out.println(al.toString());
		
//		요소 추가
		al.add(al);				// 객체 자기 자신을 넣으면 (this Collection)이 나옴
		al.add(2);				// int타입을 Object 타입으로 자동 박싱됨
		System.out.println(al);
		al.add(0.5);			// 자동 박싱
//		다른 타입도 저장 가능
//		왜? Object 타입이기 때문
		al.add(1);
		al.add("1");			// → 저장한 값 하나하나를 요소(Element)라고 함
		System.out.println(al);
		
//		ArrayList의 크기를 반복하여 요소 출력
 		for (int i = 0; i < al.size(); i++) {
 			System.out.println(i + " : " + al.get(i));
// 			0번째에 객체 자기자신을 저장했기 떄문에 저장한 요소 그대로 0번째 인덱스에 들어가 있음
 		}
 		
// 		<Element> : 제네릭
// 		뒤 <>에 동일한 타입이 들어간다면 생략 가능
 		ArrayList<Integer> al2 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			al2.add(((10 - i) * 10));
		}
		System.out.println(al2);
		
		for (int data : al2) {	// Integer → int로 언박싱
			System.out.println(data);
		}
		
		
	}
}
