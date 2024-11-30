package section02;
//3. 자료형 타입 - 논리형 ② : 조건문에서 사용
public class Type09 {
	public static void main(String[] args) {
		boolean isStudent = true;	// 논리형 타입 변수의 논리형 값이 true가 담김
		
		if (isStudent) {	// 조건식이 true라면 아래 코드 실행
			System.out.println("저는 학생입니다.");
		} else {			// 위 조건식이 false라면 아래 코드 실행
			System.out.println("저는 학생이 아닙니다.");
		}
	}
}
