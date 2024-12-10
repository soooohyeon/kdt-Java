package interfaceTest3;

public interface Inter1 {
	default void printText() {
		System.out.println("Inter1의 printText()");
	}
}