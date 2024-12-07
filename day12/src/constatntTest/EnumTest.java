package constatntTest;
//6. enum (상수 클래스)
public class EnumTest {
	enum Day {	// 불변 객체기 때문에 수정이나 추가가 불가능 / 즉, 변할 수 없는 상수들의 집합(클래스)
		SUNDAY(false), MONDAY(true), TUESDAY(true), THURSDAY(true), FRIDAY(true), SATURDAY(false);
//		↑ 하나의 객체로 만들어 생성자로 취급한 것
//		열거형은 new 키워드가 빠졌다고 생각하면 됨
		boolean week;			// 필드
		Day(boolean week) {		// 생성자
			this.week = week;
		}
		boolean weekday() {		// 메소드
			return this.week;
		}
	}
	
	public static void main(String[] args) {
		Day today = Day.FRIDAY;	// 사용하려 할때 static을 뜻하는 s와 final을 뜻하는 f가 붙어져 있음
		
		System.out.println("오늘은 " + today + "입니다.");
		
//		switch문을 사용한 열거형 상수 처리
		String result;
		switch (today) {
		case MONDAY:
			result = "월요일";
			break;
		case TUESDAY:
			result = "화요일";
			break;
		case FRIDAY:
			result = "금요일";
			break;
		default:
			result = "다른 요일";
			break;
		}
		System.out.println("오늘은 " + result + "입니다.");
		
//		enum은 static이기 때문에 클래스명인 Day.메소드명()으로 사용 가능
		Day[] days = Day.values();	// 모든 열거형 값을 배열로 가져오는 메소드
		
		System.out.println(days);
		for (Day day : days) {
			System.out.println(day);
		}
		
		
//		평일만 가져오기
//		for (Day day : days) {
//			if (!day.equals(Day.SUNDAY) && !day.equals(Day.SATURDAY) )
//				System.out.println(day);
//				
//		}
		
		
	}
}
