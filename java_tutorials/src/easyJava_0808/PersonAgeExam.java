package easyJava_0808;

class Person{
	//�ʵ��
	String name;
	int age;
	//������ Ŭ������(�Ű����� ���)
	//Ŭ������ �ʵ�� name,age ������ ����,�������� �Ű������� name,age�� ���� 
	//�̷��� ���� �̸��� ������ ���� �� ���� ���� �����Ϸ��� �򰥸�
	//�̸����� this Ű���� ��� -this�� �ش� ��ü�� �ǹ�
 	public Person(String name,int age) {
		this.name = name;//�ʱⰪ
		this.age = age; //�ʱⰪ
	}
}

public class PersonAgeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person Ŭ�������� String�� int�� ������ �Ű������� �޴� ������ ȣ��
		Person p = new Person("ȫ�浿",25);
		System.out.println(p.name);
		System.out.println(p.age);
	}

}
