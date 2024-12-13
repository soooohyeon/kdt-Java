package listTest;

import java.util.ArrayList;

//8. 컬렉션 프레임워크 : ArrayList
public class ArraysTest {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			li.add((10 -i) * 10);
		
		}
		System.out.println(li);
		
		
//		뒷부분 코드 확인할 것
	}
}
