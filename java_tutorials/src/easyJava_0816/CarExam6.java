package easyJava_0816;

public class CarExam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		if(car instanceof Machine) {
			System.out.println("Car가 Machine을 상속받았습니다.");
		}
		else {
			System.out.println("Car가 Machine을 상속받지 않았습니다.");
		}
	}

}
