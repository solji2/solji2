package easyJava_0815;

abstract class Shape {
	//추상 클래스도 필드를 포항할 수 있다.
	double pi = 3.14;
	//추상 메서드는 본체가 없다.
	abstract void draw();
	//추상 클래스도 구현 메서드를 포함한다.
	public double findArea() {
		return 0.0;
	}
	
	
	
}
