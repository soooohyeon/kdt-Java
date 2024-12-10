package section11;

//예제 02.
class Car {}
class Bus extends Car {}
class SchoolBus extends Bus {}

class OpenCar extends Car {}
class SportsCar extends OpenCar {}

public class Casting02 {
	public static void main(String[] args) {
		Car c1 = new SchoolBus();	// SchoolBus의 부모인 Bus의 부모 클래스 타입으로 업캐스팅
		
		Bus b1 = new Bus();			// Bus 객체 생성
		Bus b2 = new SchoolBus();	// SchoolBus의 부모인 Bus로 클래스 타입으로 업캐스팅
		
		Car c2 = new OpenCar();		// OpenCar의 부모인 Car 클래스 타입으로 업캐스팅
		OpenCar oc = new SportsCar();	// SportsCar의 부모인 OpenCar 클래스 타입으로 업캐스팅
//		Bus b3 = new OpenCar();		// 오류 발생, Bus와 OpenCar가 공통인 Car를 상속 받고 있을 뿐 상속관계는 아님
//		Bus b4 = new SportsCar();	// 오류 발생, Bus와 SportsCar는 상속 관계가 아님
		
	}
}
