package easyJava_0815;
//Controllerable 구현 클래스인 Computer
public class Computer implements Controllerable {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터를 켠다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터를 끈다.");
	}

}
