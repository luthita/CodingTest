package lesson03;

import java.util.Scanner;

public class No10_2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		for(int i = 1; i <= count; i++) {
			for(int j = 1; j <= (count-i); j++) {
				System.out.print(" ");
			}
			for(int k= 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
