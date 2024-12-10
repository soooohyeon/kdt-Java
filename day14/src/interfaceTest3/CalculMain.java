package interfaceTest3;

public interface CalculMain {
	public static void main(String[] args) {
//		Calculator cal = new Calculator();	// 인터페이스는 객체화 불가
		CalculImpl cal = new CalculImpl();	// 인터페이스는 객체화 불가
		
		System.out.println(cal.add(10, 20));	// 양수일 땐 1에 인수인 + 10 + 20으로 31 출력됨
		System.out.println(cal.substract(-10, 20));	
	}
}
