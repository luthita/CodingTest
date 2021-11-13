package lesson13;

import java.util.Scanner;

// 1, 2, 3 ¥ı«œ±‚
public class No8_9095 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int tc = scan.nextInt();
		
		for(int i = 0; i < tc; i++) {
			int n = scan.nextInt();
			
			System.out.println(function(n));
		}
	}
	
	public static int function(int num) {
		if(num == 1) {
			return 1;
		}
		if(num == 2) {
			return 2;
		}
		if(num == 3) {
			return 4;
		}
		
		return function(num-1) + function(num-2) + function(num-3);
	}
}
