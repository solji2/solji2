//인터페이스와 다형성1
package easyJava_0822;

import easyJava_0815.Computer;
import easyJava_0815.Controllerable;
import easyJava_0815.TV;

public class ControllabeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스 타입의 배열 변수에 구현 객체 배열을 대입한다.
		Controllerable[] controllable = {new TV(),new Computer()};
		
		for(Controllerable c : controllable) {
			c.turnOn();
			c.turnOff();
			c.repair();
		}
		Controllerable.reset();
	}

}
