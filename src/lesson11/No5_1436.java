package lesson11;

import java.util.Scanner;

// ¿µÈ­ °¨µ¶ ¼ò
public class No5_1436 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int count = 1;
		int num = 666;
		
		while(N != count) {
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println(num);

	}

	
}
