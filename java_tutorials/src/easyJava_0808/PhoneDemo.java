package easyJava_0808;
//Ŭ���� ����� ��ü ����
class Phone{
	String model;
	int price;
	
	void print() {
		System.out.println(price+"�� ��¥�� "+model+" ����Ʈ��");
	}
}
public class PhoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PhoneŸ���� ��ü�� ������ �� myPhone��� ���� ������ �����Ѵ�.
		Phone myPhone = new Phone();
		//��ü�� �ʵ忡 ���� �����Ѵ�,
		myPhone.model = "������ S8";
		myPhone.price = 100;
		myPhone.print();

		Phone yourPhone = new Phone();
		//model,price�� �ʵ��̸� 
		yourPhone.model = "������ 13";
		yourPhone.price = 130;
		//print() �޼����̸�
		yourPhone.print();
		
		
	}

}
