package lesson13;

import java.util.Scanner;

// 리모컨
public class No4_1107 {

	static boolean[] broken = new boolean[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		
		// 고장난 버튼들은 true
		for(int i = 0; i < M; i++) {
			int n = scan.nextInt();
			broken[n] = true;
		}
		
		// +,- 로만 눌러서 가는 횟수
		int result = Math.abs(N - 100);
		
		for(int i =0; i <= 1000000; i++) {
			int c = i;
			
			// 숫자들을 눌러서 갈 수 있는 경우
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
