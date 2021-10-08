package lesson03;

import java.util.Scanner;

public class No07_11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int[] sum = new int[count+1];
		for(int i = 1; i <= count; i++) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			sum[i] = num1 + num2;
		}
		
		for(int i = 1; i <= count; i++) {
			System.out.println("Case #" + i + ": " + sum[i]);
		}
	}

}
