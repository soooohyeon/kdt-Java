package array;
// 3번 : 배열의 저장공간과 값
public class ArrayTest03 {
	public static void main(String[] args) {
		
//		정수형 타입 arData 배열 생성하고 각각의 저장공간에 4, 3, 2, 5 값을 담음.
//		ex) arData의 0번째에는 4, 1번째에는 3, ...
//		⇒ 정확히 알고 넘어갈 것 ↓↓↓↓↓↓↓↓
//		정수형 타입 arData 배열을 stack 메모리영역에 생성 : 참조변수
//		heap 메모리 영역에 4칸짜리 4, 3, 2, 5라는 값을 생성하고 참조값을(주소값) arData라는 참조 변수에 담음
		int[] arData = {4, 3, 2, 5};
		
		System.out.println(arData); // 참조값(주소값) 출력
		
		System.out.println(arData[0]);	// 4, 값
		arData[0] += 10;	// 값(arData[0] + 10) 먼저 연산되고 저장공간(arData = 14)에 대입
		System.out.println(arData[0]);	// 14, 값
		
		int data = arData[3];	// 값
		System.out.println(data);
		
		double data2 = arData[2];	// 값(자동형변환)
		System.out.println(data2);
		
//		↓↓ 배열의 길이는 고정이 되어 있음 / 인덱스 20번째는 없는 공간으로 오류 발생
//		int data3 = arData[20];
//		System.out.println(data3);
		
		System.out.println("배열의 길이 : " + arData.length);
		
		double[] arData2 = null;	// double 타입 배열 선언
//		arData2 = new int[3];	// double 타입의 배열변수에 int[] 타입의 배열을 할당하려고 하면 에러 발생
//		System.out.println("배열의 길이 : " + arData2.length);	// 배열이 생성되기 전이기 때문에 에러 발생
		arData2 = new double[3];	// double 타입 배열 생성 - 참조변수의 타입이랑 동일해야함

	}
}
