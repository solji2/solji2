package easyJava_0811;
//5과목 평균 점수 구하기
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//방법1
		int[] score = {100,90,50,95,85};
		//배열 변수를 선언한 후 배열을 초기화할 때는 반드시 new 연산자로 객체를 생성해야한다.
		//방법2
		int[] scores = new int[] {100,90,50,95,85};
		//방법3
		int[]scoress;
		scoress = new int[] {100,90,50,95,85};
		
		int sum = 0;
		
		for(int i=0;i<5;i++) {
			sum+= score[i];
		}
		double avg = sum/5.0;
		System.out.println(avg);
	}

}
