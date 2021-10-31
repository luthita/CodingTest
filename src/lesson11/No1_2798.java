package lesson11;

import java.util.Scanner;

// ∫Ì∑¢¿Ë
public class No1_2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] card = new int[n];
		int result = 0;
		for(int i = 0; i < n; i++) {
			card[i] = scan.nextInt();
		}

		outline : for(int i =0; i < n-2; i++) {
			for(int j = i+1; j < n-1; j++) {
				for(int k = j+1; k < n; k++) {
					int temp = card[i] + card[j] + card[k];
					
					if(temp <= m) {
						result = Math.max(result, temp);
					}
					if(result == m) {
						break outline;
					}
				}
			}
		}
		System.out.println(result);
	}
}
