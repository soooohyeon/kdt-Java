package whileTest;
// 13번 : 반복문 (while문)
public class WhileTest01 {
	public static void main(String[] args) {
//		조건문이 계속 true이기 때문에 무한루프에 빠짐
//		while(true) {
//			System.out.println("행복");
//		}
		
		int i = 1;
		while (i <= 5) {
			System.out.println("행복함");
			i++;	// i = 6이 되는 순간 while의 조건문 확인 후 false가 나오고 while문 즉시 종료
		}
		
//		1 ~ 5까지 총합 구하기(while)
//		1) 총합 구할 변수, 비교대상이 될 변수 선언
//		2) while (조건식 <= 5) {
//		3) 		총합 += 비교대상변수;
//		4) 		비교대상변수++; }
//		5) 결과 출력
		int total = 0, num = 0;		// for문을 분리해서 써놓은거랑 같음
		while (num <= 5) {			// 그래서 횟수가 정해진 반복은 for문 사용
			total += num;
			total++;
		}
		System.out.println("1 ~ 5까지 총합 : " + total);
	}
}
