package lesson11;

import java.util.Scanner;

// ������
public class No2_2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int result = 1000001;
		
		for(int i = 1; i <= N; i++) {
			int number = i;
			int sum = number;
			
			// �� �ڸ� ���� ��
			while(number != 0) {
				sum += (number % 10);
				number /= 10;
			}
			
			// ���� �Է°��� ���� ��
			if(sum == N) {
				result = result < i ? result : i;
				break;
			}
			
		}
		if(result != 1000001) {
			System.out.println(result);
		}else {
			System.out.println(0);
		}
		
	}

}
