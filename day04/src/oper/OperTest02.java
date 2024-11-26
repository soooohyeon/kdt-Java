package oper;
// 9번 : 복합 대입 연산자, 증감연산자
public class OperTest02 {
	public static void main(String[] args) {
		int num = 1;
		System.out.println(num);
		System.out.println(num + 10);
		
		num += 10;		// num = num + 10;
//		→ num에 저장된 값 + 10 연산된 값을 num 변수에 저장함
		System.out.println(num);
		
		num *= 2;
		System.out.println(num);
		
		num /= 2;
		System.out.println(num);
		
		System.out.println("증감 연산자");
		int num2 = 1;
		System.out.println("기존 num2의 값 : " + num2);			// 1
		System.out.println("전위형 num2의 값 : " + ++num2);			// 2
		System.out.println("전위형 적용 후의 num2의 값 : " + num2);	// 2
		
		System.out.println("증감 연산자2");
		int num3 = 1;
		System.out.println("기존 num3의 값 : " + num3);			// 1
		System.out.println("전위형 num3의 값 : " + num3++);			// 1
		System.out.println("전위형 적용 후의 num2의 값 : " + num3);	// 2
		
		
		   int num1 = 7, num4 = 7;
		   int result1 = 0, result2 = 0;

		   result1 = --num1 + 4;
		   result2 = num4-- + 4;
		   
		   System.out.println(result1);
		   System.out.println(result2);
		
	}
}
