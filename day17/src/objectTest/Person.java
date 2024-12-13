package objectTest;
//3. Object 클래스 - equals
public class Person {
//	필드
	String name;
	int age;
	
//	매개변수 있는 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
@Override
	public String toString() {
		return "Person [ name : " + name + ", age : " + age + " ]";
	}

	//	매소드
	@Override
	public boolean equals(Object obj) {
//		객체의 자기자신과 같은 경우
		if (this == obj) {
			return true;
		}
////		이름이 같은 경우 ⇒ 같은 객체로 판단
//		if (obj instanceof Person) {
//			String other = ((Person)obj).name;	// 다운캐스팅
//			if (this.name.length() == other.length()) {	// 문자열 길이 비교
//				for (int i = 0; i < this.name.length(); i++) {
//					if(this.name.charAt(i) != other.charAt(i)) {
//						return false;
//					}
//				}
//				return true;
//			}
//		}
		
////      이름이 같은경우(코드 짧게도 가능)
		if (obj instanceof Person) {
		   String other = ((Person)obj).name;
		   return name.equals(other);
		}
		
//		이름과 나이가 같은 경우 ⇒ 같은 객체로 판단
//		1) instanceof를 사용하여 객체 타입 비교
//			아니라면 false
//		2) 매개변수 다운캐스팅하여 이름의 길이, 나이를 객체의 이름의 길이, 나이와 비교
//			아니라면 false
//		3) 반복문과 charAt()을 사용해서 값 비교
//		-> 짧게 하면 반복문과 charAt()이 아닌 문자열 비교 메소드인 .equals()를 사용해서 코드를 양 축소 가능
		if (obj instanceof Person) {
			Person other = (Person)obj;
			return this.name.equals(other.name) && this.age == other.age;
		}
		
		return false;
	}

//	 equlas를 재정의하면 hashCode도 재정의, 동일객체에 대해 같은 hashCode값이 반환되도록
//	 return name.hashCode() + Integer.hashCode(age); 형태로 작성가능(참고)
//	 아래 hashCode()는 객체의 나이를 반환하도록 오버라이딩함
	@Override
	public int hashCode() {
//		return this.age;
//		정수는 hashCode로 변환해도 정수값 그대로임
		return Integer.hashCode(age);	// 즉, this.age와 같음
	}
	
}
