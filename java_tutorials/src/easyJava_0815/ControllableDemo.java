package easyJava_0815;
//Controllerable �������̽��� �׽�Ʈ
public class ControllableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		Computer com = new Computer();
		
		//Controllerable�������̽��� TV ��ü�� Computer ��ü�� �����ϴ� ����� ����.
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		com.turnOn();
		com.turnOff();
		com.repair();
		
		Controllerable.reset();//���� �޼���� �������̽��� ���� ȣ���ؾ��Ѵ�.
	}

}
