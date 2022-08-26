/*
 * package easyJava_0813; //기본 생성자를 호출했을 때 name은 이름없음 number는 0으로 초기화 class Car{
 * String name; int number;
 * 
 * public Car(String name) { this.name = name; }
 * 
 * public Car(String name,int number) { this.name = name; this.number = number;
 * 
 * }
 * 
 * public Car() { //this.name = "이름없음"; //this.number = 0;
 * this("이름없음",0);//this에 고라호를 붙이면 자기 자신의 생성자를 의미한다. //자신의 생성자에 '이름없음',0릏 넣어서
 * 호출하면 Car객체에 기본 생성자를 호출했을 때 String 값과 int 값을 가진 생성자를 호출할 것 입니다.
 * 
 * } }
 * 
 * public class CarExam4 {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * Car c1 = new Car(); System.out.printf(c1.name,c1.number); }
 * 
 * }
 */