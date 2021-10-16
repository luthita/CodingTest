package lesson08;

import java.util.Scanner;

// 손익분기점
public class No1_1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(b >= c) {
			System.out.println(-1);
		}else {
			System.out.println(a / (c - b) + 1);
		}
		
	}

}
