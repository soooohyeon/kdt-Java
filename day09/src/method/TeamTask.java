package method;

import java.util.Scanner;

public class TeamTask {

	public static void main(String[] args) {
		
//		Q1. 좀비 바이러스 발생
//		---------로직---------
//		1. 입력받기 위한 Scanner 클래스 import
//		2. 메소드 사용을 위한 클래스 객체명 선언
//		3. 초기 좀비 수를 입력받기 위해 메세지 출력하고 초기 좀비 수 입력받아 변수에 담기
//		4. if (좀비 <= 1) {
//			"초기 진압 되었습니다." 출력
//		5. } else { 결과값(메소드 사용)을 출력 }
//		6. 버퍼 비우기
		Scanner sc = new Scanner(System.in);
		TeamTask tt = new TeamTask();
		
		System.out.print("최초 좀비의 수는 몇명이었나요? ");
		int zombie = sc.nextInt();
		if (zombie<= 1) {
			System.out.println("초기 진압 되었습니다.");
		} else {
			System.out.println("6시간 후의 좀비의 수는 : " + tt.calculatorZombie(zombie) + " 입니다.");        
		}
		sc.nextLine();    
		
		System.out.println();	// 줄바꿈
		
//		Q2. 귀여운 척 금지
//		---------로직---------
//		1. 입력받기 위한 Scanner 클래스 import
//		2. 메소드 사용을 위한 클래스 객체명 선언
//		3. 메소드 리턴 값을 담을 변수와 기회 횟수를 카운트 해줄 변수 선언 및 초기화
//		4. while (기회가 남아있을 때까지) {
//		    출력메세지 및 입력받은 값 변수에 담기
//		    메소드 사용하고 리턴 받은 값 변수에 담기
//		    ① if (키워드 o && 기회 > 0) 
//		    “당신은 귀엽습니다” 출력;
//		    기회변수—;
//		    ② else if (키워드 x) 
//		    “잘하고 있습니다, 앞으로도 그렇게 사용해주세요” 출력
//		    ③ else if (기회 == 0)
//		    “이제 그 만” 출력하고 반복문 종료;
//		5. 버퍼 비우기
//		Scanner sc = new Scanner(System.in); 
//		TeamTask tt = new TeamTask();        
		
		int flag = 0;  // 메소드 사용 리턴값을 담을 변수
		int count = 3; // 기회 3번                                             
		System.out.println("~냥 , ~용, ~쪄, ~냠 이 포함된 문장을 절대 입력하지마세요.");                     
	                                                                                 
		while (count >= 0) { // 기회가 남아있을 때까지 반복
			System.out.print("메세지 입력 : ");
			String cutePhrase = sc.nextLine(); 
			flag = tt.iAmCute(cutePhrase); // 변수에 메소드 리턴값 담기
			if (flag == 1 && count > 0) { // 키워드가 들어가 있다면 
				System.out.println("당신은 귀엽습니다 ><");
				count--; // 기회 차감
			} else if (flag == 0) { // 키워드가 들어가 있지 않다면              
				System.out.println("잘하고 있습니다, 앞으로도 그렇게 사용해주세요");
			} else if (count == 0) { // 키워드가 들어가 있고 기회도 없다면
					System.out.println(" 그 만 ");
					break; // 반복 탈출
			}
		}                                           
//		sc.close();
		
//		Q3. 오늘의 운세 확인
//		---------로직---------
//		1. 입력받기 위한 Scanner 클래스 import
//		2. 메소드 사용을 위한 클래스 객체명 선언
//		3. 메세지 출력 후 이름 입력 받고 변수에 담기
//		4. 결과 출력 (메소드 사용)
//		5. 버퍼 비우기
//		Scanner sc = new Scanner(System.in);
//		TeamTask tt = new TeamTask();
		System.out.print("이름을 입력하면 오늘의 운세를 확인 할 수 있습니다. : ");
		String name = sc.nextLine();
		System.out.println("운세 : " + tt.tellFortune(name));
		sc.close();
	}

//	Q1. 좀비 바이러스가 발생했습니다.
//	처음 좀비의 수가 2마리 라고 가정했을 때 1시간 후에는 4마리 > 2시간 후에는 8마리 > 3시간 후에는 16마리> ... 가 됩니다.
//	6시간 뒤에 좀비가 몇 마리가 될지 계산하는 메소드를 만드세요.
//		[조건]
//		1. 리턴값 o, 매개변수 o
//		2. 초기 좀비의 수는 입력메소드로 입력 받아야합니다
//		3. 초기 좀비의 수가 1로 입력 받았을 경우 ‘초기 진압 되었습니다.’ 출력
//			[출력 결과] 6시간 후의 좀비의 수는  N 입니다.**
//	---------로직---------
//	1. 기능 : 사용자로부터 입력받은 초기 좀비 수에 6승의 결과값을 구하는 메소드
//	2. 매개변수 : int zombie
//	3. 메소드명 : calculatorZombie
//	4. 실행할 부분
//	    리턴할 총 좀비수 변수 선언
//	    제곱 연산이기 때문에 선언한 변수에 초기 좀비 값 대입
//	    for (6시간이라 6번 반복) {
//	    총 좀비 수 *= 초기 좀비 수; }
//	5. 리턴 값 : 총 좀비 수 (int)
//	6. 리턴타입 : int로 변경
	int calculatorZombie(int zombie) {
		int zombieTotal = zombie;	// 제곱을 계산해야하기 때문에
									// 반복문 실행 전 초기값을 초기 좀비수로 잡아줌
		for (int i = 1; i <= 6; i++) { // 총 6번의 반복을 돌려 6승을 계산
			zombieTotal *= zombie; // 누적 곱셈 (제곱)
		}                             
		return zombieTotal; // 누적 곱셈한 총 좀비 수 반환
	}

//	Q2. 귀여운 척 금지
//	귀여운 척하는 사람의 말투를 고쳐줍시다.
//	조건에 부합하는 메소드를 작성해서 문장를 교정하세요.
//		[조건]
//		** 키워드 : ~냥 , ~냠, ~용, ~쪄
//		1. 매개변수 o, 리턴값 o (키워드 포함 여부를 담은 정수형 flag 변수 선언할 것)
//		2. 입력받은 문자열 중에 키워드가  있다면
//		해당 키워드를 2번 연속 출력하게 문장을 바꿉니다.
//		그 후 "당신은 귀엽습니다" 문장을 다음 줄에 출력 합니다.
//		3. 만약 키워드가 포함되지 않았다면 "잘하고 있습니다, 앞으로도 그렇게 사용해주세요" 출력
//		4. 키워드가 들어간 문장이 총 3번 이상 입력 되었을때 “그  만!” 문장을 출력시키고 프로그램을 종료시킵니다.
//		5. 메소드 명 : iAmCute
//			[출력 결과]
//			메세지 입력 : 안녕하세용
//			안녕하세용용
//			당신은 귀엽습니다 > <
//			메세지 입력 : 안녕하세용
//			안녕하세용용
//			당신은 귀엽습니다 > <
//			메세지 입력 : 안녕하세용
//			안녕하세용용
//			메세지 입력 : 안녕하세용
//			그   만 !
//	---------로직---------
//	1. 기능 : 사용자로부터 입력받은 문자열에 특수한 키워드 검사
//	2. 매개변수 : String cutePhrase
//	3. 메소드명 : iAmCute
//	4. 실행할 부분
//	    문자열을 쪼개서 저장할 한 글자 변수, 검사한 문자열 결과값을 다시 담을 변수
//	    리턴할 키워드 포함 여부를 담을 변수 선언 및 초기화
//	    for (매개변수 문자열길이만큼 반복) {
//	    	한 글자 변수 = 매개변수.charAt(i) + “”;
//		    if (한 글자 변수.equals(키워드)){
//		    결과값 += (한 글자 변수 + 한 글자 변수);
//		    여부 변수 = 1;
//		    } else { 결과값 += 한 글자 변수; } }
//	    	결과값 출력;
//	5. 리턴 값 : flag (정수형)
//	6. 리턴타입 : int로 변경
	int iAmCute(String cutePhrase) {
		String foo = "";
		String result = "";
		int flag = 0;

		for (int i = 0; i < cutePhrase.length(); i++) {
			foo = cutePhrase.charAt(i) + "";
			if (foo.equals("냥") || foo.equals("용") || foo.equals("냠") || foo.equals("쪄")) {
				result += (foo + foo);
				flag = 1;
			} else {
				result += foo;
			}
		}
		System.out.println(result);
		return flag;
	}
	
//	Q3. 오늘의 운세 확인
//	이름을 입력하고 오늘의 운세를 확인해보세요
//	이름의 각 자리를 정수로 바꾼 후 다 더해서 5로 나누고 나온 나머지의 결과값에 따라 오늘의 운세 문구를 출력하세요 
//		[ 조건 ] 
//		1. 매개변수 o, 리턴값 o
//		2. 메소드명 : tellFortune
//		[운세 문구]
//		0 : 오늘은 행운의 날입니다!
//		1 : 약간의 어려움이 있을 수 있어요.
//		2 : 평온한 하루가 예상됩니다.
//		3 : 모험심을 발휘해보세요!
//		4 : 좋은 일이 찾아올 거예요.
//	---------로직---------
//	1. 기능 : 사용자로부터 입력받은 문자열에 각 자리를 정수로 형변환 후 총합한 결과에 5를 나눈 나머지값 구하고 운세 문구 반환
//	2. 매개변수 : String name
//	3. 메소드명 : tellFortune
//	4. 실행할 부분
//	    형변환한 이름의 각 자리를 담을 정수형 변수 unicodeSum
//	    for (매개변수 문자열길이만큼 반복) {
//	    unicodeSum= 매개변수.charAt(i); }
//	    int 결과 = unicodeSum % 5;} 
//	    switch (결과)
//	    0~4 : 각 숫자에 맞는 운세 문구
//	5. 리턴 값 : 문자열(운세문구)
//	6. 리턴타입 : String으로 변경
	String tellFortune(String name) {
        int unicodeSum = 0;
        for (int i = 0; i < name.length(); i++) {
            unicodeSum += name.charAt(i);
        }
        int result = unicodeSum % 5;
        
        switch (result) {
            case 1: return "약간의 어려움이 있을 수 있어요.";
            case 2: return "평온한 하루가 예상됩니다.";
            case 3: return "모험심을 발휘해보세요!";
            case 4: return "좋은 일이 찾아올 거예요.";
            default: return "오늘은 행운의 날입니다!" ;
        }
    }

}