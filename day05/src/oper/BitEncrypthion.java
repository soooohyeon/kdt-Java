package oper;
// 4번 : 비트연산자를 이용한 암호화와 복호화
public class BitEncrypthion {
	public static void main(String[] args) {
		int originalMsg = 42;	// 원본 메세지
		int key = 99;			// 비트 마스크 (암/복호화에 사용)
		
//		실무에서는 아래 형태로 사용하지 않음(예시를 들기 위한 것)
		System.out.println("원본 메세지 :" + originalMsg);
		
//		XOR 연산을 통한 암호화
		int encryptedMsg = originalMsg ^ key;
		System.out.println("암호화된 메세지 : " + encryptedMsg);
		
//		암호화된 메세지를 동일한 키를 가지고 XOR 연산을 통해 복호화함
		int decryptedMsg = encryptedMsg ^ key;
		System.out.println("복호화된 메세지 : "+ decryptedMsg);
	}
}
