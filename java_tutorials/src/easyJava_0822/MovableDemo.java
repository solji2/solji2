//�������̽� Ÿ�� ������ ���Ե� ���� ��ü�� ������ Ÿ���� ��ȯ�ؼ� ���ð�ü�� �޼��� ȣ�� 
package easyJava_0822;

interface Movable{
	void move(int x);
}

class Car implements Movable{
	private int pos = 0;
	
	public void move(int x) {//Movable �������̽��� �߻� �޼����� move()�� ����ü�̴�.
		pos+=x;
	}
	public void show() {
		System.out.println(pos+"m �̵��߽��ϴ�.");
	}
	
}

public class MovableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable m = new Car();
		m.move(15);
		//m.show();//Movable Ÿ�Կ��� show �޼��尡 ���� ������ ȣ���� �� ����.
		
		Car c =(Car)(m);//m�� �����ϴ� ���� ��ü�� CarŸ���̹Ƿ� ���� Ÿ�� ��ȯ�� �� �ִ�.
		c.move(10);
		c.show();
	}

}
