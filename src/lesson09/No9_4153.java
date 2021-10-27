package lesson09;

import java.util.Arrays;
import java.util.Scanner;

// Á÷°¢ »ï°¢Çü
public class No9_4153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int[] size = new int[3];
			for(int i = 0; i < 3; i++) {
				size[i] = scan.nextInt();
			}
			
			Arrays.sort(size);
			
			if(size[size.length-1] == 0) {
				break;
			}
			if(size[2] * size[2] == (size[0] * size[0]) + (size[1] * size[1]) ) {
				System.out.println("right");
			}else
				System.out.println("wrong");
		}
	}

}
