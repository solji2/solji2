package easyJava_0810;
//���� ���� Ȱ��
class Circle{
	double radius;
	static int numberOfCircle = 0;//��������
	int numCircle = 0;
	
	public Circle(double radius) {
		this.radius = radius;
		numberOfCircle++; //��ü�� ������ �� ���� �ϳ��� �þ��.
		numCircle++; //��ü�� ������ �� ���� �þ���� ��ü���� ������ ��� ������ ����ϱ⿡ �׻� 0�������� �����Ѵ�.
		
	}
}

public class CircleDemo {

	public static void main(String[] args) {//���� ��ǥ���� ���� �޼���� main()
		// TODO Auto-generated method stub
		
		Circle myCircle = new Circle(10.0);
		Circle yourCircle = new Circle(5.0);
		
		//print();main()�޼���� ���� �޼��� �̹Ƿ� �ν��Ͻ� �޼��带 ����� �� ����.
		
		System.out.println("���� ���� : "+myCircle.numberOfCircle);
		System.out.println("���� ���� : "+Circle.numberOfCircle);//���������� ���
		System.out.println("���� ���� : "+yourCircle.numCircle);
		
		}
	
		void print() {
			System.out.println("�ν��Ͻ� �޼����Դϴ�.");
		}

}
