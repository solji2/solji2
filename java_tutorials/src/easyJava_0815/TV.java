package easyJava_0815;
//Controllerable 구현 클래스인 TV

//class extends class
//interface extends interface
//class implements interface
//interface extends,implements(X) class  안됨 XXXXXXXXX

public class TV implements Controllerable{
	//Controllerable 인터페이스에 정의된 모근 추상 메서드를 구현해야한다.
	//반드시 public이어야 한다.자식은 부모보다 접근 범위가 좁으면 안 되기 때문이다.
	//부모인 인터페이스의 메서드는 모두 public이다.
	@Override
	public void turnOn() {
		System.out.println("TV를 켠다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끈다.");
	}
}
