package lesson08;

import java.util.Scanner;

// 달팽이는 올라가고 싶다
public class No4_2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int V = scan.nextInt();
		int day = (V - B) / (A - B);
		// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
		if ((V - B) % (A - B) != 0) {
			day++;
		}
		System.out.println(day);
	}

}
