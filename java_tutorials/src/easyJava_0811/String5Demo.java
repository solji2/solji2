package easyJava_0811;
//String Ŭ������ ���� �޼��� �̿�
public class String5Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String version = String.format("%s%d", "JDK",14);//�־��� ���˿� ���� ���ڿ��� ��ȯ
		System.out.println(version);
		
		String fruits = String.join("-","apple", "banana","cherry","durian");
		//�־��� �����ڿ� ������ ���ڿ��� ��ȯ
		System.out.println(fruits);
		
		String pi = String.valueOf(3.14);
		System.out.println(pi);
	}

}
