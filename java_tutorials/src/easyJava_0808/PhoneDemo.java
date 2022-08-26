package easyJava_0808;
//클래스 선언과 객체 생성
class Phone{
	String model;
	int price;
	
	void print() {
		System.out.println(price+"만 원짜리 "+model+" 스마트폰");
	}
}
public class PhoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Phone타입의 객체를 생성한 후 myPhone라는 참조 변수에 대입한다.
		Phone myPhone = new Phone();
		//객체의 필드에 값을 대입한다,
		myPhone.model = "갤럭시 S8";
		myPhone.price = 100;
		myPhone.print();

		Phone yourPhone = new Phone();
		//model,price는 필드이름 
		yourPhone.model = "아이폰 13";
		yourPhone.price = 130;
		//print() 메서드이름
		yourPhone.print();
		
		
	}

}
