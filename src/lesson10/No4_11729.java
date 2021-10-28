package lesson10;

import java.util.Scanner;

// 하노이 탑
public class No4_11729 {

	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		sb.append((int)Math.pow(2, n)-1).append("\n");
		hanoi(n, 1, 2, 3);
		System.out.println(sb);
	}
	
	public static void hanoi(int n, int start, int mid, int end) {
		if(n == 1) {
			sb.append(start + " " + end + "\n");
			return;
		}
		
		// 1. n-1 개를 A -> B
		hanoi(n-1, start, end, mid);
		
		// 2. 1개를 A -> C
		sb.append(start + " " + end + "\n");
		
		// 3. n-1 개를 B -> C
		hanoi(n-1, mid, start, end);
	}

}
