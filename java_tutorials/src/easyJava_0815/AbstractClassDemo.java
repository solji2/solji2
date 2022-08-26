package easyJava_0815;

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Shape s = new Shape(); //Shape 클래스는 추상 클래스이므로 생성자를 사용해 객체를 생성할 수 없다.
		Circle c1 = new Circle(3);
		c1.draw();
		System.out.printf("원의 넓이는 %.1f\n",c1.findArea());
		
		
		
		
	}

}
