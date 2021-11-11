package lesson13;

import java.util.Scanner;

// ���� ����
public class No2_3085 {
	
	public static int N;
	public static char[][] arr;
	public static int max;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		arr = new char[N][N];
		for(int i = 0; i < N; i++) {
			String str = scan.next();
			for(int j = 0; j < N; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N-1; j++) {
				// ���� ������ �� ���� ��ȯ
				char temp = arr[i][j];
				arr[i][j] = arr[i][j+1];
				arr[i][j+1] = temp;
				
				arrCheck();
				
				temp = arr[i][j];
				arr[i][j] = arr[i][j+1];
				arr[i][j+1] = temp;
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N - 1; j++) {
				char temp = arr[j][i];
				arr[j][i] = arr[j+1][i];
				arr[j+1][i] = temp;
				
				arrCheck();
				
				temp = arr[j][i];
				arr[j][i] = arr[j+1][i];
				arr[j+1][i] = temp;
			}
		}
		System.out.println(max);
		
		
	}
	// ���� ���� ���ϸ鼭 ���� �� �ִ� ���� �ִ� ���� ã��
	public static void arrCheck() {
		
		// ���� üũ
		for(int i = 0; i < N; i++) {
			int count = 1;
			for(int j = 0; j < N-1; j++) {
				if(arr[i][j] == arr[i][j+1]) {
					count++;
				} else {
					count = 1;
				}
				max = Math.max(max,  count);
			}
		}
		
		// ���� üũ
		for(int i = 0; i < N; i++) {
			int count = 1;
			for(int j = 0; j < N-1; j++) {
				if(arr[j][i] == arr[j+1][i]) {
					count++;
				}else {
					count = 1;
				}
				max = Math.max(max, count);
			}
		}
	}

	public static void swap(char a, char b) {
		char temp = a;
		a = b;
		b = temp;
	}
}
