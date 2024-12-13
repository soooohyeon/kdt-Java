package wrapperTest;
//6. String 메소드 사용
public class StringTest {
	public static void main(String[] args) {
		String msg = "안녕하세요";
		
//		charAt()
		System.out.println(".charAt() : " + msg.charAt(0));
		System.out.println(".charAt() : " + msg.charAt(3));
		
		System.out.println();
		
//		indexOf()
		System.out.println(".indexOf() : " + msg.indexOf("녕"));		// 해당 문자가 있는 경우 해당 인덱스 번호 반환
		System.out.println(".indexOf() : " + msg.indexOf("~~"));	// 해당 문자가 없는 경우 -1 반환
		
		System.out.println();
		
//		split()
		String msg2 = "안!녕!하!세!요!";
		System.out.println(msg2);
		
		String[] ar = msg2.split("!");
		System.out.println(".split() : " + ar[0]);
		System.out.println(".split() : " + ar[2]);

		for (String data : ar) {
			System.out.println("빠른 for문 : " + data);
		}

		System.out.println();
				
//		length()
		System.out.println(".length() : " + msg2.length());
		
		System.out.println();
		
//		strip()
		String msg3 = "          하     이            ";
		System.out.println("msg3 : " + msg3);
		System.out.println("msg3 길이 : " + msg3.length());
		System.out.println(".strip() : " + msg3.strip());
		System.out.println(".strip() 사용 후 길이 : " + msg3.strip().length());		// 메소드 연속 사용 : 메소드 체이닝
		
		System.out.println();
		
//		substring(start, end)
		System.out.println(msg2);
		System.out.println(".substring(start, end) : " + msg2.substring(0, 3));
		
		System.out.println();
		
//		contains() : 해당 문자가 포함되어있는지 여부를 boolean형으로 반환
		System.out.println(".contains() : " + msg2.contains("하"));
		System.out.println(".contains() : " + msg2.contains("하하하"));
	}
}
