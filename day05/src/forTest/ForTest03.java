package forTest;
//12번 : 반복문 (for문)
public class ForTest03 {
	public static void main(String[] args) {
//		이름 5번 출력
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + "번 홍길동");
		}
		
		for (int i = 5; i > 0; i--) {
			System.out.println((6-i) + "번 김철수");
		}

//		1부터 100까지의 합
//		1) 총 합 저장할 변수
//		2) for문 (초기식 int i = 1; 조건식 i < 101; i++){
//		3) 총 합 저장할 변수 += i; }
//		4) 합 출력
		int total = 0;
		for (int i = 1; i < 101; i++) {
			total += i;
		}
		System.out.println("1부터 100까지의 총 합 : " + total);
		
//		1부터 100까지의 짝수의 총 합 (1) - if문으로 짝수 확인
//		1) 총 합 저장할 변수
//		2) for문 (int i = 1; i < 101; i++) {
//		3) if문 (i % 2 == 0) {
//		4) if문 true 일때만 총합 누적 total2 += i; } }
//		5) 결과 출력
		
		int total2 = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				total2 += i;
			}
		}
		System.out.println("1 ~ 100까지의 짝수의 총합 : " + total2);
		
//		1부터 100까지의 짝수의 총 합 (2) - for문에서 짝수만 반복
//		1) 총합구할 변수
//		2) for(초기식 i = 2; i <= 100; i += 2){
//		3) 총합 += i }
//		4)출력
      int total3 = 0;
      for (int i = 2; i <= 100; i += 2) {
         total3 += i;
      }
      System.out.println("2번방법 총합 : " + total3);

//		1부터 100까지의 짝수의 총 합 (3) - i를 1부터 50까지, 짝수 생성하는 방법
//      1) 총합구할 변수
//		2) for(초기식 i = 1; i <= 50; i++){ //1부터 50까지 반복
//		3) 총합 += i * 2; }
//		4) 출력

      int total4 = 0;
      for (int i = 1; i <= 50; i++) {
         total4 += i * 2;
      }
      System.out.println("3번방법 총합 : " + total4);

	}
}
