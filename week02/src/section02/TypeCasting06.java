package section02;
// 4-1. 자동 형변환
public class TypeCasting06 {
	public static void main(String[] args) {
		int i = 100;
		char c = 'a';
		int j = c;		// char 타입은 int 타입보다 작으므로 자동형변환돼서 값이 담김
		double d = i;	// int 타입은 double 타입보다 작으므로 자동형변환돼서 값이 담김
		
		System.out.println("int형 변수 j의 값 : " + j);
		System.out.println("double형 변수 d의 값 : " + d);
	}
}
