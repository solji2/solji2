package easyJava_0808;
//public - 클래스 접근 권한으로 누구나 사용할 수 있가.
//class - 클래스 키워드
//Ball - 클래스 이름으로 소스 파일 이름과 동일해야한다.
public class Ball {
	
	double radius = 2.0; //필드
	double getVolume() { // 메서드
		return 4/3*3.14*radius*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ten = 10;//기초타입
			Ball myBall = new Ball();//참조타입
		//클래스이름 변수    =new 클래스이름();클래스이름은 생성자라고 한다. 변수 선언과 객체 생성을 동시에 함
		
	}

}
