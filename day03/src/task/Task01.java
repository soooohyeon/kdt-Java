package task;

public class Task01 {
   public static void main(String[] args) {
       //1. 기본 자료형의 변수를 선언하고 초기화한 뒤 값을 출력하기
      
//      출력결과 예시
//      int: 100000
//      long: 123456789L
//      float: 3.14f
//      double: 3.14159265359
//      char: A
//      boolean: true
	   int intVal = 100000;
	   long longVal = 123456789L;
	   float floatVal = 3.14f;
	   double doubleVal = 3.14159265359;
	   char charVal = 'A';
	   boolean booleanVal = true;

	   System.out.println("[문제 1]");
	   System.out.println("int : " + intVal);
	   System.out.println("long : " + longVal + "L");
	   System.out.println("float : " + floatVal + "f");
	   System.out.println("double : " + doubleVal);
	   System.out.println("char : " + charVal);
	   System.out.println("boolean : " + booleanVal);
      
      //2. 이름과 생년월일을 저장할 상수를 선언하고 출력하기
      
//      출력결과
//      제 이름은 000이고 생년월일은 000000입니다
	   final String MY_NAME = "박수현";
	   final int My_BIRTH = 20000310;
	   
	   System.out.println("\n[문제 2]");
	   System.out.println("제 이름은 " + MY_NAME + "이고 생년월일은 " + My_BIRTH + "입니다.");
	   
      
      //3. 아래 변수를 선언하고 변수의 데이터 타입과 값을 출력하기
      
      // 정수형 age 변수 선언, 값 : 25
      // 실수형 height 변수 선언, 값 : 160.5
      // 논리형 isStudent 변수 선언, 값 : true
      
//      출력결과
//      나이 : 25, 타입은 000형
//      키 : 160.5, 타입은 000형
//      학생여부 : true, 타입은 000형
	   int age = 25;
	   double height = 160.5;
	   boolean isStudent = true;
	   
	   System.out.println("\n[문제 3]");
	   System.out.printf("나이 : %d, 타입은 정수형\n키 : %.1f, 타입은 실수형\n학생여부 : %s, 타입은 논리형\n", age, height, isStudent);
	   
      //4. hobby라는 문자열 변수 선언 후 값을 초기화하여 출력하기(printf 한번만 사용)
      // 
//      출력결과
//      안녕하세요, 제 이름은 [000]입니다.
//      제 취미는 [00]입니다.
	   String name = "박수현", hobby = "영화 감상";
	   
	   System.out.println("\n[문제 4]");
	   System.out.printf("안녕하세요, 제 이름은 %s입니다.\n제 취미는 %s입니다\n", name, hobby);
      
      //5. 아래 변수를 선언하고 각 자료형 변환을 수행하여 결과 출력하기
      String strNum = "100";
      int intNum = 200;
      double doubleNum = 300.5;
      char charLetter = 'C';
      boolean boolVal = true;
      
//      strNum을 정수로 변환하여 덧셈 연산 : intNum + strNum
//      intNum을 실수로 자동 형변환하여 덧셈 연산 : intNum + doubleNum
//      charLetter를 정수로 변환하여 출력
//      boolVal을 문자열로 변환하여 출력
      int result1 = intNum + Integer.parseInt(strNum);
      double result2 = intNum + doubleNum;
      int result3 = charLetter;
      String result4 = boolVal + "";
      
	   System.out.println();
	   System.out.println("[문제 5-1] 결과 : " + result1);
	   System.out.println("[문제 5-2] 결과 : " + result2);
	   System.out.println("[문제 5-3] 결과 : " + result3);
	   System.out.println("[문제 5-4] 결과 : " + result4);
   }
   
}
