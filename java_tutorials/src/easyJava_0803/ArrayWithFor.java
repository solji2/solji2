package easyJava_0803;

public class ArrayWithFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ 100���� ���� �� �ִ� �迭�� ����
		int[] iarray = new int[100];
		//�迭�� 0�� �ε����� 1��� 1�� �ε����� 2 ���
		iarray[0]=1;
		iarray[1]=2;
		
		//1~100���� ���� ���ʴ�� ��ƾ��ϴ� �ݺ��� Ȱ��
		//int i�� 0���� �ʱ�ȭ->�ʱ갪���� ������ i�� �ε����� ���
		//�迭�� 0������ �����ϴϱ� 0���� �ʱ�ȭ
		//for(int i=0;���ǽ�;������) 
		//for(int i=0;i<100;i++) 100�� �迭�� ũ��
		//���� �迭�� ũ�Ⱑ �޶����� ���ڵ� ���� �����ؾ��ϹǷ� �Ź� �������� �ʾƵ� �Ǵ� �迭�� ���̸� ����Ű�� length��� �Ӽ� ���
		for(int i=0;i<iarray.length;i++) {
			//�� �ε����� �ش��ϴ� �迭�� ���� 1���� �����ſ��� i�� 1�� ���ؼ� ���� �־��ش�.
			//�� �ε����� 0���� �� 1�� ����.
			iarray[i] = i+1;
			System.out.println(iarray[i]);
		}
		
	}

}
