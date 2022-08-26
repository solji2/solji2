package easyJava_0808;
//클래스의 멤버 접근

/*class Circle{
	//필드
	double radius;//초기화하지 않았으므로 기본값인 0.0이된다.
	//메서드
	double findArea() {
		//this는 클래스를 통해 만들어진 객체 자신이다.
		return 3.14*this.radius*this.radius;//클래스 멤버에 접근한다.radius 대신 this.radius를 사용해도된다.
	}
	void show(double x,double y) {
		System.out.printf("반지름 = %.1f,넓이 = %.1f\n",x,y);
	}
}*/

public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 선언 동시에 객체 생성
		//Circle myCircle = new Circle();//생성자를 호출해 Circle 객체를 생성한다.
		//myCircle.radius =10.0;
		//myCircle.show(myCircle.radius, myCircle.findArea());
	}

}
