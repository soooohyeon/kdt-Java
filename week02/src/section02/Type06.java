package section02;
// 3. 자료형 타입 - 문자형 ② : (유니코드)정수형 타입으로 알파벳 출력하기
public class Type06 {
	public static void main(String[] args) {
		int ga = '가';			// 정수형 타입 변수에 유니코드 값 44032 담기
		int na = '나';			// 정수형 타입 변수에 유니코드 값 45208 담기
		int alphabetA = 'A';	// 정수형 타입 변수에 유니코드 값 65 담기
		int alphabetB = 'B';	// 정수형 타입 변수에 유니코드 값 66 담기
//		해서 char형을 문자형이기 전에 정수형이라고 표현한다고 함
		
		System.out.println(ga);			// ()안에 담기 변수의 값 출력하고 줄바꿈함
		System.out.println(na);
		System.out.println(alphabetA);
		System.out.println(alphabetB);
	}
}
