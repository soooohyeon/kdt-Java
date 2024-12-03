package method;
//5. 메소드 사용이유 2 : 높은 재사용성
public class MethodBasic02 {
	public static void main(String[] args) {
//		동일한 로직을 구현하기 위해 새롭게 코드를 작성할 필요없이
//		이미 작성된 메소드를 호출하면 됨
//		작성된 코드의 재사용성을 높일 수 있음
		
//		필요시에 인수만 변경하고 재사용 가능
		System.out.println("첫 번째 직사각형의 면적 : " + calculateArea(5, 10));
		System.out.println("두 번째 직사각형의 면적 : " + calculateArea(50, 3));
		
	}
	
	static int calculateArea (int width, int height) {
		return width * height;
	}
}
