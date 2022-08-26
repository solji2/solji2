package easyJava_0810;

class Car{
	String name;
	int number;
	
	public Car(String name) {
		this.name = name;
	}
	public Car() {
		//디폴트로 아무 값도 받지 않는 생성자를 기본 생성자라고 합니다.
	}
	//값을 두개 받는 생성자 정의
	public Car(String name,int number) {
		this.name = name;
		this.number = number;
	}
}

public class CarExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("소방차");
		Car c2 = new Car(); //Car객체에 생성자가 하나라도 없을 때는 기본 생성자가 자동으로 만들어지지만
		//하나라도 정의되어 있다면 기본생성자는 자동으로 만들어지지 않는다.기본생성자를 정의하면 에러가 사라짐 생성자도 오버로딩이 가능하다.
		Car c3 = new Car("구급차",8282);
	}

}
