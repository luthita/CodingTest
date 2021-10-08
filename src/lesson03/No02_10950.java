package lesson03;

import java.util.Scanner;

public class No02_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int[] result = new int[count+1];
		for(int i = 1; i <= count; i++) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			result[i] = num1+num2;
		}
		for(int i = 1; i <=count; i++) {
			System.out.println(result[i]);
		}
	}

}
