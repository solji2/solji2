package easyJava_0816;

public class CarExam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		if(car instanceof Machine) {
			System.out.println("Car�� Machine�� ��ӹ޾ҽ��ϴ�.");
		}
		else {
			System.out.println("Car�� Machine�� ��ӹ��� �ʾҽ��ϴ�.");
		}
	}

}
