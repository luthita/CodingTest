package lesson13;

import java.util.Scanner;

// �� �̾��
public class No7_1748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int count = 1;
		int result = 0;
		int num = 10;
		for(int i = 1; i <= N; i++) {
			// �ڸ� ���� �ٲ� �� ����, �߰� �� ����
			if(i == num) {
				count++;
				num = num*10;
			}
			// ������� �ڸ� �� ���ϱ�
			result += count;
			
		}
		System.out.println(result);
		
	}

}
