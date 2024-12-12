package review;

enum Oper {
	PLUS("+") {
		public int apply(int num1, int num2) { return num1 + num2; }
	}, 
	MINUS("-") {
		public int apply(int num1, int num2) { return num1 - num2; }
	};
	
	private final String symbol;
	
	Oper(String symbol) {
		this.symbol = symbol;
	}
	
	public abstract int apply(int num1, int num2);
//	추상메소드로 각각 구현부만 재정의해서 사용
}
public class LambdaMain {
	public static void main(String[] args) {
		
	}
}
