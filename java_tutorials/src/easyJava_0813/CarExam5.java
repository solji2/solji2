package easyJava_0813;
//Ŭ���� Car�� name �� number�� �ʵ�� ������ �ֽ��ϴ�.
//1)�Ű������� ���� �ʴ� ������:name�� �̸����� ,number�� 0���� �ʱ�ȭ
//2)�Ű������� String�� �Է¹޴� ������:name�� �Է¹��� ���ڿ��� �����ϰ� number�� 0���� �ʱ�ȭ
//3)�Ű������� String�� int�� �Է¹޴� ������:name �� number�� �Է¹��� ������ �ʱ�ȭ�Ѵ�.



class Car{
	//name,number�ʵ� ����
	String name;
	int number;
	public Car() {
		this("�̸�����",0);
	}
	
	public Car(String name) {
		this(name,0);
	}
	
	public Car(String name,int number) {
		this.name=name;
		this.number=number;
	}
	
	public void run() {
		System.out.println("�޸���");
	}
}


public class CarExam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		Car c2 = new Car("�ڵ���");
		Car c3 = new Car("�ڵ���",1234);
		System.out.println(c1.name+","+c1.number);
		System.out.println(c2.name+","+c2.number);
		System.out.println(c3.name+","+c3.number);
		
	}

}
