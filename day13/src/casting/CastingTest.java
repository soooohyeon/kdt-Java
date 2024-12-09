package casting;
//3. 클래스 Up / Down Casting
public class CastingTest {
	public static void main(String[] args) {
//		각각 클래스 객체
		Tv tv = new Tv();
		System.out.println(tv);
		tv.chUp();			// 부모 객체의 값은 자식 클래스에 있는 멤버 사용 불가
		
		SmartTv smartTv = new SmartTv();
		System.out.println(smartTv);
		smartTv.chUp();
		smartTv.netflix();	// 자식 객체의 값은 자식 클래스에 있는 멤버 사용 가능
		
//		Up Casting
//		방법 01.
//		SmartTv() 는 Tv 클래스의 참조변수 tv1에 할당됨
//		부모 클래스 타입의 참조 변수로 자식 클래스 타입의 참조값을 대입하는 것
//		업 캐스팅으로 인해 tv1은 SmartTv 객체를 참조하지만 Tv 타입으로 취급함
		Tv tv1 = (Tv) new SmartTv();
//		Tv tv1 = new SmartTv();	와 같음	
		System.out.println(tv1);	// tv1에는 SmartTv 클래스 타입의 주소값이 담기는 것이므로 주소값은 변함이 없음
//		tv1.netflix();	// 오류 발생 ↓↓↓↓
//		그러나 담은 객체는 Tv 클래스이므로 사용 가능한 멤버는 Tv 클래스 내부에 있는 필드나 메소드만 가능	(자식클래스에 추가로 작성한 멤버는 사용 불가)
		
//		방법 02.
		Tv tv2 = smartTv;	// 10번 줄에 생성한 smartTv의 참조값을 Tv 클래스 타입의 참조변수에 담음
//		Tv tv2 = (Tv)smarTv 와 같음 / 왜? Tv 클래스가 SmartTv보다 크기 때문
//		tv2는 SmarTv 객체를 참조하지만 업캐스팅으로 인해 Tv 타입으로 취급
//		따라서 Tv 클래스의 필드와 메소드에만 접근 가능
		
//		방법 03
		Tv tv3 = new SmartTv();
//		부모 클래스 타입의 참조 변수로 자식 클래스 타입의 객체를 참조함
//		부모 클래스 타입의 참조변수에 자식 클래스 타입의 객체의 주소값을 저장
		System.out.println(tv3);
		
//		Down Casting
		SmartTv stv2 = (SmartTv) tv3;	// 강제로 타입을 명시해줘야함
		stv2.netflix();
		
//		잘못된 Down Casting
//		SmartTv stv2 = (SmartTv)new Tv(); // 오류
//		System.out.println(stv2);
		
//		Down Casting 은 반드시 Up Casting이 된 값으로 해야함
//		즉, Up Casting된 값을 다시 원래 자식 타입으로 되돌리는 것이 Down Casting
	}
}
