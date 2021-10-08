package lesson03;

import java.util.Scanner;

public class No01_2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		for(int i = 1; i<=9; i++) {
			System.out.println(num1 +" * " + i + " = " + num1*i);
		}
	}

}
