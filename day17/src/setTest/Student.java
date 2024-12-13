package setTest;
//12. HashSetTest02 파일을 위한 클래스 생성
public class Student {
//	필드
	int number;
	String name;
	
//	생성자
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

//	toString 재정의
	@Override
	public String toString() {
		return "Student [number: " + number + ", name : " + name + "]";
	}
	
//	equals 재정의
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Student) {
//			학번(number)을 기준으로 두 Student 객체가 같은지 여부 판단 후 반환
			return this.number == ((Student)obj).number;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.number;
	}
	
}
