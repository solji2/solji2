package easyJava_0816;

public class BusExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus("�ٶ�",3000,1050);
		if(bus.name != "�ٶ�" ) {
			System.out.println("bus�� name�� �ٸ��ϴ�.");
		}
		else if(bus.number != 3000) {
			System.out.println("bus�� number�� �ٸ��ϴ�.");
		}
		else if(bus.fee != 1050) {
			System.out.println("bus�� fee�� �ٸ��ϴ�.");
		}
		else {
			System.out.println("�����Դϴ�.");
		}
	}

}
