package print;
// 10번 실습
public class PrintTask {
	public static void main(String[] args) {
//		1. printf를 사용해 형식에 맞게 출력하기 (변수형에 넣어서 사용)
//		이름 : 본인 이름
//		나이 : 본인 나이
//		취미 : 취미
//		키 : 실수형 2자리까지
//		몸무게 : 실수형 3자리까지

//		(1) 변수 선언
		String name = "박수현", hobby = "영화보기";
		int age = 25;
		double height = 163.4, weight = 12.34567;
		System.out.println("[문제 1]");
		System.out.printf("이름 : %s\n나이 : %d\n취미 : %s\n키 : %.2f\n몸무게 : %.3f\n", name, age, hobby, height, weight);
		
//		2. 10진수의 값 255를 8진수, 16진수, 10진수로 각각 출력하기
		int number = 255;
		System.out.println("\n[문제 2]");
		System.out.printf("8진수 : %o\n16진수 : %x\n10진수 : %d\n", number, number, number);
		
//		3. 상품정보를 println과 printf를 사용하여 아래 형식으로 출력하기
//		각 자리수는 5자리로 정렬, tab키 2번 사용
//      -------------------------
//      상품명         가격
//      -------------------------
//      메로나         1500원
//      누네띠네       1200원
//      꼬북칩         2000원
//      초코파이       3000원
//      -------------------------

		System.out.println("\n[문제 3]");
		System.out.println("-------------------------");
		System.out.printf("%-5s\t\t%-5s\n", "상품명", "가격");
		System.out.println("-------------------------");
//		System.out.printf("%-5s\t\t%5d원\n", "메로나", 1500);
//		System.out.printf("%-5s\t\t%5d원\n", "누네띠네", 1200);
//		System.out.printf("%-5s\t\t%5d원\n", "꼬북칩", 2000);
//		System.out.printf("%-5s\t\t%5d원\n", "초코파이", 3000);
		System.out.printf("%-5s\t\t%5d원\n%-5s\t\t%5d원\n%-5s\t\t%5d원\n%-5s\t\t%5d원\n", "메로나", 1500, "누네띠네", 1200, "꼬북칩", 2000, "초코파이", 3000);
		System.out.println("-------------------------");

//		4. 봄여름가을겨울을 아래와 같이 출력하기
//		출력문 1번으로 아래와 같이 출력하기
//		봄
//				여름
//			가을
//				겨울
		System.out.println("\n[문제 4]");
		System.out.print("봄\n\t\t여름\n\t가을\n\t\t겨울");
	} 
}
