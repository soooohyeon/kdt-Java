package ex02_박수현;

public class Print {
	public static void main(String[] args) {
//		2. 15부터 30까지 중 짝수의 합을 출력하라
//
//		- 클래스명 : Print
//		- 단, while문을 사용할 것
		
//		1. 총합을 담을 변수 선언 및 초기화
//		2. 값을 담을 count 변수 및 초기화
//		3. count + 15를 담을 변수 선언;
//		4. while (true) {
//		5.		if ((count + 15) % 2 == 0)) {
//		6. 			총합 += (count + 15) }
//		7. 		if (count == 15) { 반복종료; }	
//		7.		count++; }
//		8. 결과 출력
		int total = 0, count = 0, num = 0;
		
		while (true) {
			num = count + 15;
			
			if (num % 2 == 0 ) {
				total += num;
			}
			if (count == 15) {
				break;
			}
			count++;
		}
		
		System.out.println("15~30 짝수의 총합 : " + total);
	}
}
