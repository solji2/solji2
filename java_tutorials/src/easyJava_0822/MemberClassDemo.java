//��ø Ŭ������ ���-���Ŭ����
//Ŭ������ ����μ� ����Ǵ� ��ø Ŭ����
package easyJava_0822;

public class MemberClassDemo {//�ܺ� Ŭ�����̴�.
	private String Secret = "�����";
	String s = "�ܺ�";
	
	class MemberClass{//���� Ŭ�����̴�.
		String s = "����";
		
		public void show1() {
			System.out.println("���� Ŭ����");
			System.out.println(Secret);//�ܺ� Ŭ������ private ����� ������ �� �ִ�.
			System.out.println(s);//���� Ŭ������ ��� s�� �ǹ�
			System.out.println(MemberClassDemo.this.s);//�ܺ� Ŭ������ ��� s�� �ǹ�
		}
		//static String ss="���� ��� �ʵ�";  ���� Ŭ���� ���ο� ���� ������ �޼��带 ������ �� ����.
		//static void show2() {}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberClassDemo m = new MemberClassDemo();
		MemberClassDemo.MemberClass m1 = m.new MemberClass();//���� Ŭ������ ����
		
		System.out.println(m1.s);
		m1.show1();
	}

}
