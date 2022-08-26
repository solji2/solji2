package easyJava_0810;
//정적 변수 활용
class Circle{
	double radius;
	static int numberOfCircle = 0;//정적변수
	int numCircle = 0;
	
	public Circle(double radius) {
		this.radius = radius;
		numberOfCircle++; //객체를 생성할 때 마다 하나씩 늘어난다.
		numCircle++; //객체를 생성할 때 마다 늘어나지만 객체마다 별도의 기억 공간을 사용하기에 항상 0에서부터 증가한다.
		
	}
}

public class CircleDemo {

	public static void main(String[] args) {//가장 대표적인 정적 메서드는 main()
		// TODO Auto-generated method stub
		
		Circle myCircle = new Circle(10.0);
		Circle yourCircle = new Circle(5.0);
		
		//print();main()메서드는 정적 메서드 이므로 인스턴스 메서드를 사용할 수 없다.
		
		System.out.println("원의 개수 : "+myCircle.numberOfCircle);
		System.out.println("원의 개수 : "+Circle.numberOfCircle);//정적변수에 사용
		System.out.println("원의 개수 : "+yourCircle.numCircle);
		
		}
	
		void print() {
			System.out.println("인스턴스 메서드입니다.");
		}

}
