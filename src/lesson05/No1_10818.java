package lesson05;

import java.util.Arrays;
import java.util.Scanner;

public class No1_10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int[] arr = new int[count];
		
		for(int i = 0; i < count; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);

		System.out.println(arr[0] + " " + arr[arr.length-1]);
	}

}
