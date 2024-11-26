package task;

public class Task02 {
   public static void main(String[] args) {
      //int, long, double, float, boolean, char 선언 및 초기화
	   int intVal = 65;
	   long longVal = 17L;
	   double doubleVal = 3.14;
	   float floatVal = 3.14f;
	   boolean booleanVal = false;
	   char charVal = 'F';
	   
      //1. 정수(int) -> 모든 자료형 자동형변환 가능여부 확인
	   long longVal1 = intVal;
	   double doubleVal1 = intVal;
	   float floatVal1 = intVal;
	   
	   System.out.println("[1. 정수(int)의 모든 자료형 형변환 가능여부]");
	   
	   System.out.println("long 타입 : " + longVal1);
	   System.out.println("double 타입 : " + doubleVal1);
	   System.out.println("float 타입 : " + floatVal1);
	   System.out.println("결과 : long, double, float 타입 가능\n");
      
      //2. 정수(long) -> 모든 자료형 자동형변환 가능여부 확인
	   double doubleVal2 = longVal;
	   
	   System.out.println("[2. 정수(long)의 모든 자료형 형변환 가능여부]");
	   System.out.println("double 타입 : " + doubleVal2);
	   System.out.println("결과 : double 타입 가능 \n");
      
      //3. 실수(double) -> 모든 자료형 자동형변환 가능여부 확인
	   System.out.println("[3. 실수(double)의 모든 자료형 형변환 가능여부]");
	   System.out.println("결과 : 자동형변환 가능한 타입 없음\n");
      
      //4. 실수(float) -> 모든 자료형 자동형변환 가능여부 확인
	   double doubleVal4 = floatVal;
	   
	   System.out.println("[4. 실수(float)의 모든 자료형 형변환 가능여부]");
	   System.out.println("double 타입 : " + doubleVal4);
	   System.out.println("결과 : double 타입 가능\n");
      
      //5. 논리형 (boolean)  -> 모든 자료형 자동형변환 가능여부 확인
	   System.out.println("[5. 논리형(boolean)의 모든 자료형 형변환 가능여부]");
	   System.out.println("결과 : 자동형변환 가능한 타입 없음\n");
      
      //6. 문자형(char) -> 모든 자료형 자동형변환 가능여부 확인
	   int intVal6 = charVal;
	   long longVal6 = charVal;
	   double doubleVal6 = charVal;
	   float floatVal6 = charVal;
	   
	   System.out.println("[6. 문자형(char)의 모든 자료형 형변환 가능여부]");
	   System.out.println("int 타입 : " + intVal6);
	   System.out.println("long 타입 : " + longVal6);
	   System.out.println("double 타입 : " + doubleVal6);
	   System.out.println("float 타입 : " + floatVal6);
	   System.out.println("결과 : int, long, double, float 타입 가능");
   }
}