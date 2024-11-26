package scanner;

import java.util.Scanner;

// 6번 : nextInt()
public class ScannerTest05 {
	public static void main(String[] args) {
//		나이(nextInt()), 이름(nextLine()) 입력받기

//		1. 변수 2개 선언(int, String)
//		2. 입력 클래스 import
//		3. 출력 메세지 (나이 입력 : )
//		4. 나이 변수에 입력받은 값 저장
//		5. 출력 메세지 (이름 입력 : )
//		6. 이름 변수에 입력받은 값 저장
//		7. 결과 출력 (이름은 000이고 나이는 00살 입니다.)
		
		int age = 0;
		String name = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
//		위 나이 입력받은 메소드 사용하면 엔터를 치게 되는데
//		next(), nextInt(), nextDouble()는 엔터를 소모하지 않아 엔터가 그대로 남아있게 됨
//		해서 다음에 nextLine()을 사용하게 되면 입력받지 않고 종료하게 되므로 nextLine으로 변수에 값을 저장하기 전
//		한번 사용해서 엔터를 소모시켜줘야함
		sc.nextLine();
		
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		System.out.println("이름은 " + name + "이고 나이는 " + age + "살 입니다.");
		sc.close();
		
	}
}
