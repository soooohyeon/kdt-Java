package section02;
//2. 변수 - 저장공간과 값 ②
public class Variable05 {
	public static void main(String[] args) {
		int myAge = 20;		// 정수형 타입의 myAge 변수에 값 20으로 초기화
		int yourAge = 30;	// 정수형 타입의 yourAge 변수에 값 30으로 초기화
		int tempAge;		// 정수형 타입의 tempAge 선언
		
		tempAge = myAge;	// tempAge에 myAge 값 20 대입 (초기화)
		myAge = yourAge;	// myAge에 yourAgedml 값 30 대입
		yourAge = tempAge;	// yourAge에 tempAge 값 20 대입
//		이미 초기화된 변수에 새로운 값을 대입하게 되면 새로운 값으로 값이 변경됨
		
		System.out.println(myAge);		// myAge의 값 출력하고 줄바꿈함
		System.out.println(yourAge);	// yourAge의 값 출력하고 줄바꿈함
	}
}
