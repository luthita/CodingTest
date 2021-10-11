package lesson06;

import java.util.Scanner;

// 등차수열의 갯수(한수)
public class No3_1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	
		int sequenceCount = function(scan.nextInt());
		System.out.println(sequenceCount);
	}
	
	public static int function(int num) {
		int count = 0;
		
		for(int i = 1; i <= num; i++) {
			
			if(i >= 100) {
				int a = i % 10;
				int b = i / 10 % 10;
				int c = i / 100;
				if(a-b == b-c) {
					count++;
				}
			}else {
				count++;
			}
			
		}
		
		return count;
	}

}
