package easyJava_0808;
//지역 변수의 사용 범위
public class LocalVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =0;
		double b;
		
		System.out.println(a);
		//System.out.println(b);//초기화되지 않고는 사용할 수 없다.
		
		int c = 0;
		
		//public double d = 0.0; //지역 변수는 public으로 지정할 수 없다.
		
		for(int i=0; i<10; i++) {
			//int a = 1;// 지역 변수는 같은 이름으로는 다시 선언할 수 없다.
		 System.out.println(i);
		}
	}

}
