package easyJava_0810;

class Car{
	String name;
	int number;
	
	public Car(String name) {
		this.name = name;
	}
	public Car() {
		//����Ʈ�� �ƹ� ���� ���� �ʴ� �����ڸ� �⺻ �����ڶ�� �մϴ�.
	}
	//���� �ΰ� �޴� ������ ����
	public Car(String name,int number) {
		this.name = name;
		this.number = number;
	}
}

public class CarExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("�ҹ���");
		Car c2 = new Car(); //Car��ü�� �����ڰ� �ϳ��� ���� ���� �⺻ �����ڰ� �ڵ����� �����������
		//�ϳ��� ���ǵǾ� �ִٸ� �⺻�����ڴ� �ڵ����� ��������� �ʴ´�.�⺻�����ڸ� �����ϸ� ������ ����� �����ڵ� �����ε��� �����ϴ�.
		Car c3 = new Car("������",8282);
	}

}
