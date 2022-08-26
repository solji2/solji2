package easyJava_0815;

//메서드가 하나라도 추상메서드라면 해당 클래스는 추상 클래스가 될 수 밖에 없다.
//추상클래스라고 해서 추상메서드만 가질 수 있는건 아니다.
public abstract class Bird {
	//추상 메서드란 내용이 없는 메서드다 즉,구현되지 않은 메서드이다.
	//실체가 없기 때문에 본체없이 세미콜론으로 끝난다.
	public abstract void sing();
	
	public void fly() {
		System.out.println("날다.");
	}
}
