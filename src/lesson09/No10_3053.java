package lesson09;

import java.util.Scanner;

// 택시 기하학
public class No10_3053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		
		System.out.println(String.format("%.6f", r * r * Math.PI));
		System.out.println(String.format("%.6f", (double)r * r * 2));
	}

}
