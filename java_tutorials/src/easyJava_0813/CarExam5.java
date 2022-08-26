package easyJava_0813;
//클래스 Car는 name 과 number를 필드로 가지고 있습니다.
//1)매개변수를 받지 않는 생성자:name은 이름없음 ,number는 0으로 초기화
//2)매개변수로 String만 입력받는 생성자:name을 입력받은 문자열로 지정하고 number는 0으로 초기화
//3)매개변수로 String과 int를 입력받는 생성자:name 과 number를 입력받은 값으로 초기화한다.



class Car{
	//name,number필드 생성
	String name;
	int number;
	public Car() {
		this("이름없음",0);
	}
	
	public Car(String name) {
		this(name,0);
	}
	
	public Car(String name,int number) {
		this.name=name;
		this.number=number;
	}
	
	public void run() {
		System.out.println("달리다");
	}
}


public class CarExam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		Car c2 = new Car("자동차");
		Car c3 = new Car("자동차",1234);
		System.out.println(c1.name+","+c1.number);
		System.out.println(c2.name+","+c2.number);
		System.out.println(c3.name+","+c3.number);
		
	}

}
