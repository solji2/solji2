package easyJava_0813;

public class AccessObj {
	//public은 어떤 클래스든 접근할 수 있다 전체공개라고 생각하면 될 듯
	public int p =3;
	//접근제한자인 protected를 사용
	//protected 모든 접근이 아니라 같은 패키지인 경우만 접근 허용
	//단 다른 패키지라도 상속 받은 경우에는 접근을 허용한다.
	protected int p2 = 4;
	//접근제한자-자기 자신만 접근할 수 있다
	private int i = 1;
	//default 자기 자신,자기 자신과 같은 패키지 안에서 접근을 허용
	int k = 2;
	
	//접근제한자 접근 범위가 넓은 순으로
	//public>protected>default?private
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
