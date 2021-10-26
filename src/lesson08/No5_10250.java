package lesson08;

import java.util.Scanner;

// ACM хёез
public class No5_10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int[] H = new int[count];
		int[] W = new int[count];
		int[] N = new int[count];
		
		for(int i = 0; i < count; i++) {
			H[i] = scan.nextInt();
			W[i] = scan.nextInt();
			N[i] = scan.nextInt();
		}
		
		for(int i = 0; i< count; i++) {
			int room = 1;
			int floor = 1;
			
			while(N[i] > H[i]) {
				N[i] -= H[i];
				room++;
			}
			floor = N[i];
			if(room < 10) {
				System.out.println(String.valueOf(floor) + "0" +String.valueOf(room));
			}else {
				System.out.println(String.valueOf(floor) + String.valueOf(room));
			}
			
		}
	}

}
