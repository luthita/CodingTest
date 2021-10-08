package lesson02;

import java.util.Scanner;

public class No5_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int min = scan.nextInt();
		
		if(min >= 45) {
			min -= 45;
			System.out.println(hour+" "+ min);
		} else {
			min += 15;
			if(hour==0) {
				hour = 23;
				System.out.println(hour+" "+ min);
			} else {
				hour -= 1;
				System.out.println(hour+" "+ min);
			}
		}
	}

}
