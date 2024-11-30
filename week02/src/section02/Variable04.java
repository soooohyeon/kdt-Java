package section02;
//2. 변수 - 저장공간과 값 ①
public class Variable04 {
	public static void main(String[] args) {
		int myAge = 20; 		// 정수형 타입 myAge 변수에 20이라는 값 대입 / myAge : 저장공간
		int yourAge = myAge;	// 정수형 타입 yourAge 변수에 myAge의 값 대입 / myAge : 값
		
		System.out.println(myAge);		// () 안에 있는 myAge의 값을 출력하고 줄바꿈함
		System.out.println(yourAge);	// () 안에 있는 yourAge의 값을 출력하고 줄바꿈함
	}
}
