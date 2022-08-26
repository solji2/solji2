package easyJava_0815;
//추상 클래스의 자식 클래스
public class Circle extends Shape {
	
	int radius;
	
	public Circle(int radius) {
		this.radius=radius;
	}
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그리다.");
	}
	//부모클래스의 메소드를 오버라이등한다.
	public double findArea() {
		//pi는 부모클래스인 shape에서 물려받은 변수이다.
		return pi*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
