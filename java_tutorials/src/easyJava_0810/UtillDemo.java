package easyJava_0810;

class Utill{
	static int fourtimes(int i){//정적 메서드이다.
		return i * 4;
	}
}

public class UtillDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Utill.fourtimes(5));//정적메서드를 호출한다.
	}

}
