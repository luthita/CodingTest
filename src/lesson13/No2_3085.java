package lesson13;

import java.util.Scanner;

// 사탕 게임
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
				// 가로 인접한 두 문자 교환
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
	// 가로 세로 비교하면서 먹을 수 있는 사탕 최대 갯수 찾기
	public static void arrCheck() {
		
		// 가로 체크
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
		
		// 세로 체크
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
