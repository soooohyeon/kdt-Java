package constructorThis01;
//8. 필드와 매개변수 이름이 동일한 경우 문제 해결
//같은 패키지안에서 같은 클래스명 불가 (접근제한자 때문 / 나중에 다시 배울 에정)
class Student01 {
	   // 필드
	   String name;
	   int age;

	   // 생성자
	   public Student01(String name, int age) {
	      this.name = name;
	      this.age = age;
	      System.out.println(this.name);
	      System.out.println(name);
	   }

	   // 메소드
	   void studentInfo() {
	      System.out.println("이름 : " + name);
	      System.out.println("나이 : " + age);
	   }
	}

public class StudentMain01 {
	public static void main(String[] args) {
		Student01 st = new Student01("신짱구", 5);
	}
}
