package easyJava_0821;

public class VanExam0821 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car0821 c = new Van0821();
		c.run();
		
		//error : 부모타입으로 자식을 가리킬 수는 있지만 부모타입으로 자식을 가리켰을떄는 부모의 메서드만 사용할 수 있다.
		//c.ppangppang();
		//형변환
		//형변환 이뉴 : 부모가 자식을 가리킬 수 있으나 부모가 가리키고 있을때는 부모가 알고 있는 메서드까지만 접슨 할 수 있기에
		//이 때 형변환으로 모든 메서드를 다 사용할 수 있다.
		Van0821 van = (Van0821)c;
		van.run();
		van.ppangppang();
		
	}

}
