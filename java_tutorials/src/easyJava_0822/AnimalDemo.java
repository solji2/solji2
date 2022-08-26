//인터페이스와 다형성
package easyJava_0822;

interface Animal{
	void sound();
}

//Animal 구현클래스 시작
class Dog implements Animal{
	public void sound() {
		System.out.println("멍멍~~");
	}
}

class Cuckoo implements Animal{
	public void sound() {
		System.out.println("뻐꾹~~~");
	}
}
//Animal 구현클래스 끝

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Cuckoo c = new Cuckoo();
		
		makeSound(d);
		makeSound(c);
	}

	//Dog 객체나 Cuckoo 객체를 Animal 타입에 대입한다.
	static void makeSound(Animal a) {
		//a 객체의 타입을 실행 도중에 결정한다.
		//a 객체가 Dog 타입이면 멍멍~~
		//a 객체가 Cuckoo 타입이면 뻐꾹~~
		a.sound();
		
	}
}
