package easyJava_0803;

public class ArrayWithFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정숫값 100개를 담을 수 있는 배열을 선언
		int[] iarray = new int[100];
		//배열의 0번 인덱스에 1담고 1번 인덱스에 2 담고
		iarray[0]=1;
		iarray[1]=2;
		
		//1~100까지 값을 차례대로 담아야하니 반복문 활용
		//int i를 0으로 초기화->초깃값으로 선언한 i는 인덱스로 사용
		//배열을 0번부터 시작하니깐 0으로 초기화
		//for(int i=0;조건식;증감식) 
		//for(int i=0;i<100;i++) 100은 배열의 크기
		//막약 배열의 크기가 달라지면 숫자도 같이 수정해야하므로 매번 수정하지 않아도 되는 배열의 길이를 가리키는 length라는 속성 사용
		for(int i=0;i<iarray.length;i++) {
			//각 인덱스에 해당하는 배열에 값을 1부터 넣을거여서 i에 1씩 더해서 값을 넣어준다.
			//즉 인덱스가 0번일 때 1이 들어간다.
			iarray[i] = i+1;
			System.out.println(iarray[i]);
		}
		
	}

}
