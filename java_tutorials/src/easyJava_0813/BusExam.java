package easyJava_0813;

public class BusExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bus Ŭ������ �ν��Ͻ��� �ϳ� �����ϰ� run�޼��带 ����
		//BusŬ�������� �ƹ��� �޼ҵ嵵 �������� �ʾ����� CarŬ������ ��ӹ������ν� 
		//Car��� �θ� Ŭ������ ���� run�޼��带 ����� �� �ִ�. 
		Bus bus = new Bus();
		bus.run();
		bus.ppangppang();
		
		Car car = new Car();
		car.run();
		//car.ppangppang();	// ppangppang�޼ҵ尡 �θ�Ŭ�������� ������������
	}

}
