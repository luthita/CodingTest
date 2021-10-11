package lesson05;

import java.util.Scanner;

// OX 퀴즈의 결과를 1차원 배열로 입력받아 점수를 계산하는 문제
public class No6_8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String[] quiz = new String[count];
		
		for(int i = 0; i < count; i++) {
			quiz[i] = scan.next();
		}
		
		int[] result = new int[count];
		for(int i = 0; i < count; i++) {
			int sum = 0;
			result[i] = 0;
			
			for(int j = 0; j < quiz[i].length(); j++) {
				if(quiz[i].charAt(j) == 'O') {
					result[i]++;
				}else {
					result[i] = 0;
				}
				sum += result[i];
			}
			System.out.println(sum);
		}
	}

}
