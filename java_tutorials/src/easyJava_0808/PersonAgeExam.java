package easyJava_0808;

class Person{
	//필드명
	String name;
	int age;
	//생성자 클래스명(매개변수 목록)
	//클래스의 필드로 name,age 변수를 선언,생성자의 매개변수로 name,age를 선언 
	//이렇게 같은 이름의 변수를 여러 개 있을 때는 컴파일러가 헷갈림
	//이를위해 this 키워드 사용 -this는 해당 객체를 의미
 	public Person(String name,int age) {
		this.name = name;//초기값
		this.age = age; //초기값
	}
}

public class PersonAgeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person 클래스에서 String과 int형 변수를 매개변수로 받는 생성자 호출
		Person p = new Person("홍길동",25);
		System.out.println(p.name);
		System.out.println(p.age);
	}

}
