package easyJava_0821;

public class GasStation {
	//fill(주유하다)라는 메서드른 가진다.	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인스턴스 생성
		GasStation gasStation = new GasStation();
		Suv suv = new Suv("suv");
		Truck truck = new Truck("truck");
		Bus bus = new Bus("bus");
		
		gasStation.fill(suv);
		
		gasStation.fill(truck);
		
		gasStation.fill(bus);
		
	}
	public static void fill(Car2_0821 car) {
		System.out.println(car.name+"에 기름을 넣습니다.");
		car.gas +=10;
		System.out.println("기름이"+car.gas+"리터 들어갔습니다.");
	}	

}
