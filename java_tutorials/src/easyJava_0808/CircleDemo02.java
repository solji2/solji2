package easyJava_0808;
//�����ڿ� ������ �߰�
class Circle{
	private double radius;

	public double getRadius() {//������
		return radius;
	}

	public void setRadius(double r) {//������
		this.radius = r;
	}
	
	double findArea() {
		return 3.14*radius*radius;
	}
	
	void show(double x,double y) {
		System.out.printf("������ = %.1f, ���� = %.1f\n",x,y);
	}
}

public class CircleDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle myCircle = new Circle();
		myCircle.setRadius(10.0);
		myCircle.show(myCircle.getRadius(),myCircle.findArea());
	}

}
