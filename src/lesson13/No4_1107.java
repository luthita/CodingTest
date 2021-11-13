package lesson13;

import java.util.Scanner;

// ������
public class No4_1107 {

	static boolean[] broken = new boolean[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		
		// ���峭 ��ư���� true
		for(int i = 0; i < M; i++) {
			int n = scan.nextInt();
			broken[n] = true;
		}
		
		// +,- �θ� ������ ���� Ƚ��
		int result = Math.abs(N - 100);
		
		for(int i =0; i <= 1000000; i++) {
			int c = i;
			
			// ���ڵ��� ������ �� �� �ִ� ���
			int len = possible(c);
			
			if(len > 0) {
				int press = Math.abs(c - N);
				result = Math.min(result,  len+press);
			}
		}
		System.out.println(result);
		
		
		
	}
	public static int possible(int c) {
		if(c == 0) {
			if(broken[0]) {
				return 0;
			} else {
				return 1;
			}
		}
		int len = 0;
		
		while( c > 0) {
			if(broken[c % 10]) {
				return 0;
			}
			len++;
			c /= 10;
		}
		return len;
	}

}
