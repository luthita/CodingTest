package lesson04;

import java.util.Scanner;

public class No3_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int cycle = 0;
		int result = num;
		while(true) {
			result = (result % 10 * 10) + ((result / 10 + result % 10) % 10);
			
			cycle++;
			if(result == num) {
				System.out.println(cycle);
				break;
			}
		}
	}

}
