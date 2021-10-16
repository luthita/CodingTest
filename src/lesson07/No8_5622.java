package lesson07;

import java.util.Scanner;

public class No8_5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int time = 0;
		String arrArr[] = str.split("");
		for(String var : arrArr) {
			if(var.equals("A") || var.equals("B") || var.equals("C")) {
				time = time + 3;
			}else if(var.equals("D") || var.equals("E") || var.equals("F")) {
				time = time + 4;
			}else if(var.equals("G") || var.equals("H") || var.equals("I")) {
				time = time + 5;
			}else if(var.equals("J") || var.equals("K") || var.equals("L")) {
				time = time + 6;
			}else if(var.equals("M") || var.equals("N") || var.equals("O")) {
				time = time + 7;
			}else if(var.equals("P") || var.equals("Q") || var.equals("R") || var.equals("S")) {
				time = time + 8;
			}else if(var.equals("T") || var.equals("U") || var.equals("V")) {
				time = time + 9;
			}else {
				time = time + 10;
			}
		}
		System.out.println(time);
	}

}
