package easyJava_0813;

public class BusExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bus 클래스를 인스턴스를 하나 생성하고 run메서드를 실행
		//Bus클래스에는 아무런 메소드도 정의하지 않았지만 Car클래스를 상속받음으로써 
		//Car라는 부모 클래스가 가진 run메서드를 사용할 수 있다. 
		Bus bus = new Bus();
		bus.run();
		bus.ppangppang();
		
		Car car = new Car();
		car.run();
		//car.ppangppang();	// ppangppang메소드가 부모클래스에는 존재하지않음
	}

}
