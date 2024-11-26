package variable;
// 3번
public class Constant {
	public static void main(String[] args) {
//		상수 : 한 번 값이 지정되면 변경할 수 없는 데이터를 의미
//		final 키워드 사용
		
//		상수 선언과 초기화
//		final 자료형 상수명 = 값;
		
		final int MAX_STUDENTS = 25;
		System.out.println(MAX_STUDENTS);
//		MAX_STUDENTS = 30;  // 상수는 변경불가
		
//		상수명 작성시 주의사항
//		상수명은 대문자로 작성, 단어 사이를 _로 구분
//		초기화 필수, final 키워드 같이 사용하여 선언과 동시에 초기화 해야함
//		불변성 : 한 번 값이 지정되면 변경 불가하므로 값을 유지하거나 중요한 데이터를 보호하는데 유용함
	}
}
