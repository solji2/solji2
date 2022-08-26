package easyJava_0816;

public class Truck extends Car1 {
	public Truck() {
		//truck의 생성자가 호출될 때 부모의 생성자도 자동으로 호출된다.
		//나를 가리키는 키워드가 this였다면 부모는 super이다.
		super("트럭");
		System.out.println("Truck의 기본 생성자입니다.");
	}
}
