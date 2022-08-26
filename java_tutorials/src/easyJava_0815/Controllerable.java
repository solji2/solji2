package easyJava_0815;
//전자제품 제어부 인터페이스
public interface Controllerable {
	
	//default메서드는 인터페이스의 멤버이지만 구현 메서드로 'default 반환타입 디폴트메서드이름' 이렇게 정의한다.
	default void repair() {//디폴트 메서드이다.
		show("장비를 수리한다.");
	}
	static void reset() {//정적 메서드이다.
		System.out.println("장비를 초기화한다.");
	}
		

	private void show(String s) {//주로 도우미 메서드
		System.out.println(s);
	}
	//추상메서드이다.
	void turnOn();
	void turnOff();
}
