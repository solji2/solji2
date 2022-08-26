package easyJava_0809;

class MyClass2{
	//똑같은 이름으로 메서드를 3개를 만들었다 이렇게 하는것이 메서드 오버로딩이라고한다.
	public int plus(int x,int y) {
		return x+y;
	}
	public int plus(int x,int y,int z) {
		return x+y+z;
	}
	public String plus(String x,String y) {
		return x+y;
	}
}

public class MedhodOverloadExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass2 m = new MyClass2();
		System.out.println(m.plus(4, 5));
		System.out.println(m.plus(4, 6, 7));
		System.out.println(m.plus("Hello", "World"));
		//비슷한 일을 하지만 매개변수의 개수나 자료형이 다르다면 똑같은 메서드를 정의해 사용할 수 있습니다.
		//이것을 오버로딩이라고한다.
	
	}

}
