package teamTask;

import java.util.Scanner;

public class TaskEx01 {
   public static void main(String[] args) {
//	   황어진님  풀이 (참고-오류들 잡아두신 부분 있음)
      // 1. 숫자 업다운 QUIZ

      // logic

      // logic
      // 정답은 임의의 숫자로 정해서 변수에 할당한다.
      // 메뉴 출력을 위해 while문 사용
      // 지문 출력 "숫자를 입력하면, up인지 다운인지 알려줍니다. 기회는 총3번입니다." 출력
      // 입력값을 받아서 변수에 할당
      // 비교 연산을 통해 up인지 다운인지 판단 비교연산자를 활용하여 판단
      // 삼항연산자를 사용해서 조건에따라 결과 출력
      // 오답일 경우 기회 변수를 -- 감산함
      // 기회변수가 0이되면 게임 종료

      Scanner scan = new Scanner(System.in);    // 입력메소드 import

      int answer = 0;                     // 사용자의 입력값을 받을 변수
      int magicNumber = 20;                  // 게임 정답
      int chance = 3;                        // 기회 변수

      boolean roop = true;                   // 반복문을 실행시킬 조건

      while (roop) {                  // 반복문을 실행

         if (chance > 0) {            // 기회가 남아있다면 실행
            System.out.println();
            System.out.printf("\nUP Down 수수깨끼 ^.^~ \n1부터 100까지의 숫자를 입력하면,\nup인지 down인지 출력합니다.\n기회는 %d번입니다.\n",
                  chance); // 메시지 출력
            answer = scan.nextInt(); // 입력값을 받아서 answer 에 할당

            if (answer > magicNumber) { // 입력값이 정답보다 큰 경우
               chance--;
               System.out.printf("\nDOWN!"); // down 안내문 출력
               System.out.printf(chance != 0 ? "\n\n남은 기회 : " + chance : "\n\n게임에서 패배했습니다.");// 기회가 남아 있으면 남은 기회를
                                                                           // 출력하고, 기회가 없다면
                                                                           // gameover 출력

            } else if (answer < magicNumber) { // 입력값이 정답보다 작을 경우
               chance--;
               System.out.printf("\nUP!");// up 안내문 출력
               System.out.printf(chance != 0 ? "\n\n남은 기회 : " + chance : "\n\n게임에서 패배했습니다.");// 기회가 남아 있으면 남은 기회를
                                                                           // 출력하고, 기회가 없다면
                                                                           // gameover 출력

            } else if (answer == magicNumber) { // 입력값이 정답과 일치 할 경우
               System.out.println("★★★★★축하합니다. 정답입니다!★★★★★");
               roop = false; // 반복문을 반복시키는 조건을 false로 변경하여 루프 종료시키기
            }
         } else {
            roop = false; // 반복문을 반복시키는 조건을 false로 변경하여 루프 종료시키기

         }

      }
      scan.close(); // scanner 입력메소드 도구 종료

   }

}
