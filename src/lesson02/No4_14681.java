package lesson02;

import java.util.Scanner;

public class No4_14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1>0 && num2>0) {
			System.out.println(1);
		} else if(num1 < 0 && num2 > 0) {
			System.out.println(2);
		} else if(num1 < 0 && num2 < 0) {
			System.out.println(3);
		} else if(num1 > 0 && num2 < 0) {
			System.out.println(4);
		}
			
	}

}
