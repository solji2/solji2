package easyJava_0821;

public class GasStation {
	//fill(�����ϴ�)��� �޼��帥 ������.	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ν��Ͻ� ����
		GasStation gasStation = new GasStation();
		Suv suv = new Suv("suv");
		Truck truck = new Truck("truck");
		Bus bus = new Bus("bus");
		
		gasStation.fill(suv);
		
		gasStation.fill(truck);
		
		gasStation.fill(bus);
		
	}
	public static void fill(Car2_0821 car) {
		System.out.println(car.name+"�� �⸧�� �ֽ��ϴ�.");
		car.gas +=10;
		System.out.println("�⸧��"+car.gas+"���� �����ϴ�.");
	}	

}
