package lesson09;

import java.util.Scanner;

// 네번째 점
public class No8_3009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int[] pointX = new int[3];
		int[] pointY = new int[3];
		int resultX = 0;
		int resultY = 0;
		
		for(int i = 0; i < 3; i++) {
			pointX[i] = scan.nextInt();
			pointY[i] = scan.nextInt();
		}
		
		if(pointX[0] == pointX[1]) {
			resultX = pointX[2];
		}else if(pointX[1] == pointX[2]) {
			resultX = pointX[0];
		}else
			resultX = pointX[1];
		
		if(pointY[0] == pointY[1]) {
			resultY = pointY[2];
		}else if(pointY[1] == pointY[2]) {
			resultY = pointY[0];
		}else
			resultY = pointY[1];
		
		System.out.println(resultX + " " + resultY);
	}

}
