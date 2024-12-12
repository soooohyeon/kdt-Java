package exceptionTest;
//4. 예외처리
public class ExceptionTest4 {
	public static void main(String[] args) {
		String[] ar = {"1", "2", "100", "a", "-50"};
		
		System.out.println(ar);
//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
//		System.out.println(ar[3]);
//		System.out.println(ar[4]);
		
//		try {
//			for(String i : ar) {
//				System.out.println(Integer.parseInt(i));	// 인덱스 3에서 NumberFormatException 발생
//			}
//		} catch (NumberFormatException e) {
//			System.out.println("숫자로 변환 불가 : " + e.getMessage());
//		}
		
//		아래 코드와 위 코드의 차이 잘 구분하기
//		위 코드 : 예외 발생 시 반복 종료
//		아래 코드 : 예외 발생 시 catch 문 실행하고 나머지 반복 실행
		for(String i : ar) {
			try {
				System.out.println(Integer.parseInt(i));	// 인덱스 3에서 NumberFormatException 발생
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환 불가 : " + e.getMessage());
			}
		}
		
	}
}
