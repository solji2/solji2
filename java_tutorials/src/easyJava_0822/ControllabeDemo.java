//�������̽��� ������1
package easyJava_0822;

import easyJava_0815.Computer;
import easyJava_0815.Controllerable;
import easyJava_0815.TV;

public class ControllabeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������̽� Ÿ���� �迭 ������ ���� ��ü �迭�� �����Ѵ�.
		Controllerable[] controllable = {new TV(),new Computer()};
		
		for(Controllerable c : controllable) {
			c.turnOn();
			c.turnOff();
			c.repair();
		}
		Controllerable.reset();
	}

}
