package method;
//7. 메소드 오버로딩
public class MethodOverloading01 {
	public static void main(String[] args) {
		
		System.out.println(addInt(10, 20));
		System.out.println(addDouble(15.2, 17.3));
		
	}
	
//	메소드 오버로딩 전
	static int addInt (int num1, int num2) {
		return num1 + num2;
	}
	
	static double addDouble (double num1, double num2) {
		return num1 + num2;
	}
	
}
