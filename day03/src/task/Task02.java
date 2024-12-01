package task;

public class Task02 {
   public static void main(String[] args) {
      //int, long, double, float, boolean, char 선언 및 초기화
	   int intVal1 = 65;
	   long longVal1 = 17L;
	   double doubleVal1 = 3.14;
	   float floatVal1 = 3.14f;
	   boolean booleanVal1 = false;
	   char charVal1 = 'F';
	   
      //1. 정수(int) -> 모든 자료형 자동형변환 가능여부 확인
	   long longVal2 = intVal1;
	   double doubleVal2 = intVal1;
	   float floatVal2 = intVal1;
	   
	   System.out.println("[1. 정수(int)의 모든 자료형 형변환 가능여부]");
	   
	   System.out.println("long 타입 : " + longVal2);
	   System.out.println("double 타입 : " + doubleVal2);
	   System.out.println("float 타입 : " + floatVal2);
	   System.out.println("결과 : long, double, float 타입 가능\n");
      
      //2. 정수(long) -> 모든 자료형 자동형변환 가능여부 확인
	   double doubleVal3 = longVal1;
	   
	   System.out.println("[2. 정수(long)의 모든 자료형 형변환 가능여부]");
	   System.out.println("double 타입 : " + doubleVal3);
	   System.out.println("결과 : double 타입 가능 \n");
      
      //3. 실수(double) -> 모든 자료형 자동형변환 가능여부 확인
	   System.out.println("[3. 실수(double)의 모든 자료형 형변환 가능여부]");
	   System.out.println("결과 : 자동형변환 가능한 타입 없음\n");
      
      //4. 실수(float) -> 모든 자료형 자동형변환 가능여부 확인
	   double doubleVal4 = floatVal1;
	   
	   System.out.println("[4. 실수(float)의 모든 자료형 형변환 가능여부]");
	   System.out.println("double 타입 : " + doubleVal4);
	   System.out.println("결과 : double 타입 가능\n");
      
      //5. 논리형 (boolean)  -> 모든 자료형 자동형변환 가능여부 확인
	   System.out.println("[5. 논리형(boolean)의 모든 자료형 형변환 가능여부]");
	   System.out.println("결과 : 자동형변환 가능한 타입 없음\n");
      
      //6. 문자형(char) -> 모든 자료형 자동형변환 가능여부 확인
	   int intVal5 = charVal1;
	   long longVal5 = charVal1;
	   double doubleVal5 = charVal1;
	   float floatVal5 = charVal1;
	   
	   System.out.println("[6. 문자형(char)의 모든 자료형 형변환 가능여부]");
	   System.out.println("int 타입 : " + intVal5);
	   System.out.println("long 타입 : " + longVal5);
	   System.out.println("double 타입 : " + doubleVal5);
	   System.out.println("float 타입 : " + floatVal5);
	   System.out.println("결과 : int, long, double, float 타입 가능");
   }
}