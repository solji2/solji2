package easyJava_0808;
//접근자와 설정자 추가
class Circle{
	private double radius;

	public double getRadius() {//접근자
		return radius;
	}

	public void setRadius(double r) {//설정자
		this.radius = r;
	}
	
	double findArea() {
		return 3.14*radius*radius;
	}
	
	void show(double x,double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n",x,y);
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
