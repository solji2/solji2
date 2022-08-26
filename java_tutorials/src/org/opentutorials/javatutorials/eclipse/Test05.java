package org.opentutorials.javatutorials.eclipse;

import java.util.Scanner;

public class Test05 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("점수를 입력하시오~~>");
		//점수 입력
		int score = in.nextInt();
		//입력한 점수 출력
		//80점 이상이면 참 잘했음
		if(score>=80){
			System.out.println("참 잘했음");
		}
		else{
			System.out.println("다음 학기에 다시 만나요!");
		}
		
	}

}
