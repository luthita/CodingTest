package lesson13;

import java.util.Scanner;

// 수 이어쓰기
public class No7_1748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int count = 1;
		int result = 0;
		int num = 10;
		for(int i = 1; i <= N; i++) {
			// 자릿 수가 바뀔 때 마다, 추가 값 증가
			if(i == num) {
				count++;
				num = num*10;
			}
			// 결과값에 자릿 수 더하기
			result += count;
			
		}
		System.out.println(result);
		
	}

}
