package lesson03;

import java.util.Scanner;

public class No03_8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum=0;
		for(int i=num; i>0; i-- ) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
