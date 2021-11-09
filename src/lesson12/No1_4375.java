package lesson12;

import java.util.Scanner;

// 1
public class No1_4375 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int n = scan.nextInt();
			int num = 0;

			for(int i = 1; i <= n; i++) {
				num = num * 10 +1;
				num %= n;
				if(num == 0) {
					System.out.println(i);
					break;
				}
			}
		}
	}

}
