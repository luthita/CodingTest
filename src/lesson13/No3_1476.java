package lesson13;

import java.util.Scanner;

// 날짜 계산
public class No3_1476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int E = scan.nextInt();
		int S = scan.nextInt();
		int M = scan.nextInt();
		
		int count = 0;
		
		while(true) {
			count++;
			if(count % 15 == E && count % 28 == S && count % 19 == M) {
				break;
			}
		}
		System.out.println(count);
	}

}
