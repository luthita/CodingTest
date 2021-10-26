package lesson08;

import java.util.Scanner;

// º≥≈¡ πË¥ﬁ
public class No7_2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		if(n == 4 || n == 7) {
			System.out.println(-1);
		} else if(n % 5 == 0) {
			System.out.println(n/5);
		} else if(n % 5 == 1) {
			System.out.println(n/5 + 1);
		} else if(n % 5 == 2) {
			System.out.println(n/5 + 2);
		} else if(n % 5 == 3) {
			System.out.println(n/5 + 1);
		} else if(n % 5 == 4) {
			System.out.println(n/5 + 2);
		}
	}

}
