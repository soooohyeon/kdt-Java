package doWhileTest;

// 7번 : 기타 제어문 (continue문)
public class ContinueTest {
	public static void main(String[] args) {
//		1 ~ 10까지 중 7을 제외하고 출력 (for문)
		for (int i = 0; i < 10; i++) {
			if(i == 6) {
				continue;
			}
			System.out.println(i + 1);
		}
		
//		1 ~ 10까지 중 5를 제외하고 출력 (while문)
		int num = 1;
		while (num <= 10) {
			if (num == 5) {
				num++;		// 증감식을 작성하지 않게되면 num = 5일때 아래 코드를 실행안하기 때문
				continue;	// 4까지 출력이 끝나버림 / But, 실행은 계속됨
			}				// num=5이고 while의 조건식은 계속 true로 무한루프
			System.out.println(num);
			num++;
			
		}
		
	}
}
