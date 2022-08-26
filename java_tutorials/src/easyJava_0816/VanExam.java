package easyJava_0816;

public class VanExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Van van = new Van();
		Car3 c = new Van();
		c.run();
		van.run();
		//Van클래스는 메서드가 없기 때문에 부모 클래스인 Car3클래스의 run 메서드가 실행된다.
		//"Car의 run 메서드" 출력
		
		//Van클래스에서 부모클래스인 Car3 의 메서드를 똑같이 생성후 --> 부모클래스인 Car3의 메서드를 실행하지 않고 
		//자식 클래스인 Van의 새로 정의한 메서드를 실행
		//"Van의 run" 메서드 출력
		
		//super 키워드를 통해 자식 클래스에서 부모클래스의 메서드를 호출
		//super.run(); 
		//"Car의 run 메서드","Van의 run 메서드" 출력
		
	}

}
