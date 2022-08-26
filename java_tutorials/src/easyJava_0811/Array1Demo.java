package easyJava_0811;

import java.util.Scanner;

//배열에 정수를 입력하고 평균 계산
public class Array1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		//베열을 선언하고 동시에 5개의 원소를가진 객체를 생성
		int scores[] = new int[5];
		int sum=0;
		
		for (int i = 0; i < scores.length; i++) 
			scores[i]=in.nextInt();
		for (int i = 0; i < scores.length; i++) {
			sum+= scores[i];
		}
		System.out.println("평균"+sum/5.0);
		
	}

}
