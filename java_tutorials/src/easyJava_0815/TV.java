package easyJava_0815;
//Controllerable ���� Ŭ������ TV

//class extends class
//interface extends interface
//class implements interface
//interface extends,implements(X) class  �ȵ� XXXXXXXXX

public class TV implements Controllerable{
	//Controllerable �������̽��� ���ǵ� ��� �߻� �޼��带 �����ؾ��Ѵ�.
	//�ݵ�� public�̾�� �Ѵ�.�ڽ��� �θ𺸴� ���� ������ ������ �� �Ǳ� �����̴�.
	//�θ��� �������̽��� �޼���� ��� public�̴�.
	@Override
	public void turnOn() {
		System.out.println("TV�� �Ҵ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV�� ����.");
	}
}
