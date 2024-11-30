package section02;
//3. 자료형 타입 - 실수형 ①
public class Type03 {
	public static void main(String[] args) {
		double marathon = 42.195;		// 실수형 타입의 marathon 변수를 생성하고 값 대입
		float halfMarathon = 21.0975f;	// 실수형 타입의 halfMarathon 변수를 생성하고 값 대입
//		정수형 long 타입처럼 값 뒤에 f 붙여서 사용
		
		System.out.println("마라톤은 " + marathon + "km를 달립니다.");			//	() 안을 출력하고 줄바꿈함
		System.out.println("하프마라톤은 " + halfMarathon + "km를 달립니다.");	//	() 안을 출력하고 줄바꿈함
	}
}