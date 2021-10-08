package lesson03;

import java.util.Scanner;

public class No08_11022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int[] sum = new int[count+1];
		int[] num1 = new int[count+1];
		int[] num2 = new int[count+1];
		for(int i = 1; i <= count; i++) {
			num1[i] = scan.nextInt();
			num2[i] = scan.nextInt();
			sum[i] = num1[i] + num2[i];
		}
		
		for(int i = 1; i <= count; i++) {
			System.out.println("Case #" + i + ": "+ num1[i] + " + " + num2[i] + " = " + sum[i]);
		}
	}

}
