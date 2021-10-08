package lesson05;

import java.util.Scanner;

public class No3_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int value = (scan.nextInt() * scan.nextInt() * scan.nextInt());
		scan.close();
		
		int[] count = new int[10];
		while(value > 0) {
			count[value%10]++;
			value /= 10;
		}
		for(int i=0; i< 10; i++) {
			System.out.println(count[i]);
		}
		
	}
}
