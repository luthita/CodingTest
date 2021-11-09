package lesson12;

import java.util.Scanner;

// 최대공약수와 최소공배수
public class No5_2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(GCD(a,b));
		System.out.println(a * b / GCD(a,b));
		
	}

	public static int GCD(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return GCD(b, a%b);
		}
	}
}
