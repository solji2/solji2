package easyJava_0808;
//���� ������ ��� ����
public class LocalVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =0;
		double b;
		
		System.out.println(a);
		//System.out.println(b);//�ʱ�ȭ���� �ʰ�� ����� �� ����.
		
		int c = 0;
		
		//public double d = 0.0; //���� ������ public���� ������ �� ����.
		
		for(int i=0; i<10; i++) {
			//int a = 1;// ���� ������ ���� �̸����δ� �ٽ� ������ �� ����.
		 System.out.println(i);
		}
	}

}
