package lesson08;

import java.util.Scanner;

// Fly me to the Alpha Centauri
public class No9_1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		for(int i = 0; i < count; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			int distance = y - x;
			int result = (int)Math.sqrt(distance);
			
			if(result == Math.sqrt(distance)) {
				System.out.println(2 * result - 1);
			} else if(distance <= result * result + result) {
				System.out.println(2 * result);
			} else {
				System.out.println(2 * result + 1);
			}
		}
	}

}
