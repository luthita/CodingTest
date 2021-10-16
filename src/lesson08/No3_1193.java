package lesson08;

import java.util.Scanner;

public class No3_1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int X = scan.nextInt();
		int line = 1; // 행
		int cnt = 1; // 행의 칸 갯수

		// 행이 홀수 일때, 분모가 늘어남
		// 행이 짝수 일때, 분자가 늘어남
		while(line < X) {
			X -= line; 
			line++;
		}
		cnt = X;
		
		// 행이 홀수 일 경우
		if(line % 2 == 1) {
			System.out.println((line + 1 - cnt) + "/" + cnt);
		}else {
			System.out.println(cnt + "/" + (line + 1 - cnt));
		}
		
	}

}
