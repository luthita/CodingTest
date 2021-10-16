package lesson07;

import java.util.Scanner;

// »ó¼ö
public class No7_2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		String[] arrN1 = String.valueOf(n1).split("");
		String[] arrN2 = String.valueOf(n2).split("");
		
		String newN1 = "";
		String newN2 = "";
		for(int i = arrN1.length-1; i >= 0; i--) {
			newN1 = newN1 + arrN1[i];
			newN2 = newN2 + arrN2[i];
		}
		if(Integer.valueOf(newN1) > Integer.valueOf(newN2)) {
			System.out.println(newN1);
		}else{
			System.out.println(newN2);
		}
	}

}
