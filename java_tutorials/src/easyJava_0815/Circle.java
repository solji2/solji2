package easyJava_0815;
//�߻� Ŭ������ �ڽ� Ŭ����
public class Circle extends Shape {
	
	int radius;
	
	public Circle(int radius) {
		this.radius=radius;
	}
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("���� �׸���.");
	}
	//�θ�Ŭ������ �޼ҵ带 �������̵��Ѵ�.
	public double findArea() {
		//pi�� �θ�Ŭ������ shape���� �������� �����̴�.
		return pi*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
