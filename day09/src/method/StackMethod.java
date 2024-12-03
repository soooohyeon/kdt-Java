package method;
// 2. 메소드와 메모리
public class StackMethod {
	public static void main(String[] args) {
//		1. static 키워드가 붙으면 main 메소드 실행 → 스택에 main이라는 스택 프레임 생성
//			변수  result가 main 스택 프레임에 저장됨
//		2. add 메소드 호출 → 스택에 add 스택 프레임 생성
//			매개변수 num1, num2, sum 변수가 스택 프레임에 저장됨
//			result에 30이라는 값이 담김
//		3. add 메소드 종료 → add 스택 프레임 삭제
//			sum, num1, num2가 메모리에서 제거됨
//		4. main 메소드 종료 → main 스택 프레임 삭제
		StackMethod sm = new StackMethod();

		int result = sm.add(10, 20);
		System.out.println(result);

	}

	int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
}
