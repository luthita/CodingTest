package lesson07;

import java.util.Scanner;

// 숫자의 합
public class No2_11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		String str = scan.next();
		int sum = 0;
		
		for(int i = 0; i < count; i++) {
			sum += Integer.valueOf(str.charAt(i) - '0');
		}
		System.out.println(sum);
	}

}
