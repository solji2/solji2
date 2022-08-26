package easyJava_0815;
//상수를 정의한 인터페이스

interface Coin{//int만 표시되어 있지만 public static final int이다. 
				//인터페이스의 모든 필드는 public static final int이다.
	int penny =1;
	int nickle = 5;
	int dime = 10;
	int quarter = 25;
}

public class Coin1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime은 "+Coin.dime+"센트입니다.");
	}

}
