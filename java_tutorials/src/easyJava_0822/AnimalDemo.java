//�������̽��� ������
package easyJava_0822;

interface Animal{
	void sound();
}

//Animal ����Ŭ���� ����
class Dog implements Animal{
	public void sound() {
		System.out.println("�۸�~~");
	}
}

class Cuckoo implements Animal{
	public void sound() {
		System.out.println("����~~~");
	}
}
//Animal ����Ŭ���� ��

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Cuckoo c = new Cuckoo();
		
		makeSound(d);
		makeSound(c);
	}

	//Dog ��ü�� Cuckoo ��ü�� Animal Ÿ�Կ� �����Ѵ�.
	static void makeSound(Animal a) {
		//a ��ü�� Ÿ���� ���� ���߿� �����Ѵ�.
		//a ��ü�� Dog Ÿ���̸� �۸�~~
		//a ��ü�� Cuckoo Ÿ���̸� ����~~
		a.sound();
		
	}
}
