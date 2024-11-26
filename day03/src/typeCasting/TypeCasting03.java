package typeCasting;
// 13번 : 문자열 자료형의 형변환
public class TypeCasting03 {
	public static void main(String[] args) {
//		문자열 → 다른 자료형
		String data1 = "10";
	    String data2 = "abc";
	    System.out.println(data1 + 1);	// data1이 문자열이기 때문에 계산이 아닌 연결 : 101
	    System.out.println(data2);
	    
	    int result1 = Integer.parseInt(data1);
	    long result2 = Long.parseLong(data1);
	    double result3 = Double.parseDouble(data1);  // 10.0
	    float result4 = Float.parseFloat(data1); 	 // 10.0
	    char result5 = "abc".charAt(0);
//	    parseBoolean()메소드는 문자열을 boolean값으로 변환
//	    문자열이 true(대소문자 무관)이면 true를 반환하고 그렇지 않으면 false 반환
	    boolean result6 = Boolean.parseBoolean("TrUe");		// 대소문자 상관없이 True가 아니라면 무조건 false
	    boolean result7 = Boolean.parseBoolean(" ");		// false
	    
	    System.out.println(result1 + 1);
	    System.out.println(result2 + 1);
	    System.out.println(result3);
	    System.out.println(result4);
	    System.out.println(result5);
	    System.out.println(result6);
	    System.out.println(result7);
	    
//	    다른 자료형 → 문자열
//	     + ""
	    int num1 = 10;
	    double num2 = 10.5;
	    char num3 = 'a';
	    boolean num4 = true;
	    
	    System.out.println(num1 + " 입니다.");
	    String data = num1 + "";
	    System.out.println(data + 1); 	// '+'가 연산이 아니라 연결이 됨 : 101
	}
}
