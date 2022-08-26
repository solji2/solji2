/*
 * package easyJava_0808;
 * 
 * class Car{ //형+필드명 String name; int number;
 * 
 * //생성자 클래스명(매개변수 목록) car객체를 만들면서 name을 초기화한다. //public Car(String n) { // name
 * = n; //}
 * 
 * public Car(String name) { //this는 내 구성 요소라는 의미를 지니고 있다. //내 필드 name에 지금 들어온
 * 매개변수 name을 넣어달라는 의미로 사용 this.name = name; } }
 * 
 * public class CarExam {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * //Car c1 = new Car();//사용자가 생성자를 하나라도 추가하면 기본 생성자는 자동으로 만들어지지 않는다 //생성자를 추가하면
 * 기본 생성자를 이용해 Car 객체를 생성할 수 없다. Car c2 = new Car("소방차"); //생성자는 매개변수로 String 값을
 * 받겠다고 했기에 괄호 안에 String 값을 넣어야함 Car c3 = new Car("구급차");
 * 
 * System.out.println(c2.name); System.out.println(c3.name);
 * 
 * }
 * 
 * }
 */