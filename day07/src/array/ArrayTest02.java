package array;
// 2번 : 배열 index
public class ArrayTest02 {
	public static void main(String[] args) {
//		어떤 값을 넣을지 알 때
		int[] ar1 = {1, 2, 3, 4, 5};	// {1, 2, 3, 4, 5}는 heap 메모리에 담김
//		↓↓ ar1 → stack 메모리에 있는 참조변수 (heap 메모리에 저장된 배열의 시작주소 = 참조값)
		System.out.println(ar1);		// stack 메모리로 참조변수 / 출력된 값이 참조값
		System.out.println(ar1[0]);		// ar1 참조변수를 이용하여 heap 메모리의 저장된 0번째 값 출력
		
//		 몇 칸 만들지 알 때
		int[] ar2 = new int[3];
//		ar2라는 stack메모리에 할당된 참조변수는 heap 메모리에 할당된 시작주소인 참조값을 가지고 있음
		System.out.println(ar2);
//		↓↓ 변수는 초기화를 해줘야 사용이 가능
//		↓↓ but, 배열은 크기는 알지만 값을 모르는 배열생성 후 초기화를 하지 않더라도 해당 배열 자료형의 따라 자동으로 초기값을 담아줌
//		↓↓ stack : [0][0][0] 
		System.out.println(ar2[0]);		// 출력결과 : 0 (정수형의 초기값인 0이 자동으로 담기게 됨)

//		ar2 = 1;		// ar2는 주소값이 담긴 참조변수이기 때문에 오류 발생
//		↓↓ 여기서 ar2[인덱스]는 저장공간으로 사용 
		ar2[0] = 1;	// stack : [1][0][0]
		ar2[1] = 2;	// stack : [1][2][0] 
		ar2[2] = ar2[0] + ar2[1];	// stack : [1][0][1+2] ⇒ [1][2][3] 

//		크기 & 값 모르는 변수 생성
		int[] ar3 = null;
		System.out.println(ar3);	// ar3의 주소값이 없기때문에 오류 발생
//		↓↓ new : heap 메모리의 배열을 만들고 시작 주소값을 가져옴
		ar3 = new int[] {1, 2, 3};
		
	}
}
