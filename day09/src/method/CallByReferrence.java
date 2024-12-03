package method;

import java.lang.module.ModuleDescriptor.Exports.Modifier;

//10. Call By Reference
public class CallByReferrence {
	public static void main(String[] args) {
//		JAVA의 기본 참조 타입 복사는 얕은 복사
		
		int[] ar = {1, 2, 3};
//		1. 참조값과 Call By Value
//		System.out.println("메소드 호출 전 : " + ar[0]);
//		System.out.println(ar);
//		modifyArray(ar);
//		System.out.println(ar);
//		System.out.println("메소드 호출 후 : " + ar[0]);
		
		System.out.println("array2 메소드 호출 전 : " + ar[0]); // 1
		modifyArray2(ar);
		System.out.println("array2 메소드 호출 후 : " + ar[0]); // 1
		System.out.println(ar);
		
	}
	static void modifyArray (int[] ar) {	// int[] ar : 참조값을 담고 있음
		System.out.println(ar);	
		ar[0] = 10; // 참조된 배열의 첫 번째 값 변경
	}
//	참조값이 복사되어 전달되므로 메소드 내부에서 배열의 내용을 변경하면 원본 배열에도 영향을 미침
	static void modifyArray2 (int[] ar) {	// int[] ar : 참조값을 담고 있음
		ar = new int[] {10, 20, 30};		// 참조값을 담고 있는 ar에 새로운 저장공간의 배열을 생성함
		System.out.println(ar);				// 해서 원본배열과 다른 새로운 배열을 복사한 것이고 수정해도 원본 배열에는 영향을 끼치지 않음
		ar[0] = 10; // 참조된 배열의 첫 번째 값 변경
	}
	// 참조값이 복사되어 전달되므로 메소드 내부에서 새로운 객체를 참조하게 변경하면 원본 배열에는 영향을 끼치지 않는다
}
