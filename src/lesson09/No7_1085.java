package lesson09;

import java.util.Scanner;

// 직사각형에서 탈출
public class No7_1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();

		int min = 1000;
		min = min > x ? x : min;
		min = min > y ? y : min;
		min = min > w-x ? w-x : min;
		min = min > h-y ? h-y : min;
		
		System.out.println(min);
	}

}
