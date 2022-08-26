package easyJava_0815;
//Controllerable 인터페이스의 테스트
public class ControllableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		Computer com = new Computer();
		
		//Controllerable인터페이스로 TV 객체와 Computer 객체를 동작하는 방법이 같다.
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		com.turnOn();
		com.turnOff();
		com.repair();
		
		Controllerable.reset();//정적 메서드는 인터페이스로 직접 호출해야한다.
	}

}
