package wrapperTest;
//5. Wrapper 클래스 : 박싱과 언박싱
public class WrapperTest1 {
	public static void main(String[] args) {
//		기본 자료형 → Wrapper 클래스 (박싱)
		int num1 = 10;
		System.out.println("기본 자료형 : " + num1);
		Integer inum1 = Integer.valueOf(num1);
		System.out.println("박싱 : " + inum1);
		System.out.println("자동 언박싱(연산) : " + (inum1 + 10));
		
//		Wrapper 클래스 → 기본 자료형 (언박싱)
		int unNum1 = inum1.intValue();
		System.out.println("언박싱 : " + unNum1);
		
//		자동 박싱 (AutoBoxing)
//		Double dNum1 = 100;	// 정수를 직접적으로 입력 불가
		
//		double d = 100;
//		Double dNum1 = d;	// double d에 값이 들어가며 100.0으로 변환됐으므로 가능
		
		double num2 = 1.1;
		Double dNum1 = num2;
		System.out.println("Double 자동 박싱 : " + dNum1);
		
//		자동 언박싱 (AutoUnBoxing)
		double unNum2 = dNum1;
		System.out.println("Double 자동 언박싱 : " + unNum2);
		
	}
}
