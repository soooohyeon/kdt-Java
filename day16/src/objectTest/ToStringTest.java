package objectTest;

public class ToStringTest {
	public static void main(String[] args) {
		Student st = new Student("짱구", 100, 80, 100 + 80);
		System.out.println(st);
		System.out.println(st.toString());
	}
}
