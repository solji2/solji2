package easyJava_0815;

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Shape s = new Shape(); //Shape Ŭ������ �߻� Ŭ�����̹Ƿ� �����ڸ� ����� ��ü�� ������ �� ����.
		Circle c1 = new Circle(3);
		c1.draw();
		System.out.printf("���� ���̴� %.1f\n",c1.findArea());
		
		
		
		
	}

}
