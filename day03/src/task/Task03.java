package task;

public class Task03 {
   public static void main(String[] args) {
      //int, long, double, float, boolean, char 선언 및 초기화
	   int intVal6 = 67;
	   long longVal6 = 68L;
	   double doubleVal6 = 69.14;
	   float floatVal6 = 72.14f;
	   boolean booleanVal6 = false;
	   char charVal6 = 'Z';
	   
      //1. 정수(int) -> 모든 자료형 강제형변환 가능여부 확인
	   System.out.println("[1. 정수(int)의 모든 자료형 강제형변환 가능여부]");
	   
	   System.out.println("long 타입 : " + (long)intVal6);
	   System.out.println("double 타입 : " + (double)intVal6);
	   System.out.println("float 타입 : " + (float)intVal6);
	   System.out.println("char 타입 : " + (char)intVal6);
	   System.out.println("결과 : long, double, float, char 타입 가능\n");
      
      //2. 정수(long) -> 모든 자료형 강제형변환 가능여부 확인
	   System.out.println("[2. 정수(long)의 모든 자료형 강제형변환 가능여부]");
	   
	   System.out.println("int 타입 : " + (int)longVal6);
	   System.out.println("double 타입 : " + (double)longVal6);
	   System.out.println("float 타입 : " + (float)longVal6);
	   System.out.println("char 타입 : " + (char)longVal6);
	   System.out.println("결과 : long, double, float, char 타입 가능\n");
      
      //3. 실수(double) -> 모든 자료형 강제형변환 가능여부 확인
	   System.out.println("[3. 실수(double)의 모든 자료형 강제형변환 가능여부]");
	   
	   System.out.println("int 타입 : " + (int)doubleVal6);
	   System.out.println("long 타입 : " + (long)doubleVal6);
	   System.out.println("float 타입 : " + (float)doubleVal6);
	   System.out.println("char 타입 : " + (char)doubleVal6);
	   System.out.println("결과 : long, long, float, char 타입 가능\n");
      
      //4. 실수(float) -> 모든 자료형 강제형변환 가능여부 확인
	   System.out.println("[4. 실수(float)의 모든 자료형 강제형변환 가능여부]");
	   
	   System.out.println("int 타입 : " + (int)floatVal6);
	   System.out.println("long 타입 : " + (long)floatVal6);
	   System.out.println("double 타입 : " + (double)floatVal6);
	   System.out.println("char 타입 : " + (char)floatVal6);
	   System.out.println("결과 : long, long, double, char 타입 가능\n");
      
      //5. 논리형 (boolean) -> 모든 자료형 강제형변환 가능여부 확인
	   System.out.println("[5. 논리형(boolean)의 모든 자료형 강제형변환 가능여부]");
	   System.out.println("결과 : 자동형변환 가능한 타입 없음 \n");
      
      //6. 문자형(char) -> 모든 자료형 강제형변환 가능여부 확인
	   System.out.println("[6. 문자형(char)의 모든 자료형 강제형변환 가능여부]");
	   
	   System.out.println("int 타입 : " + (int)charVal6);
	   System.out.println("long 타입 : " + (long)charVal6);
	   System.out.println("double 타입 : " + (double)charVal6);
	   System.out.println("float 타입 : " + (float)charVal6);
	   System.out.println("결과 : long, long, double, float 타입 가능");
	   
   }
}