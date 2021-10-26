package lesson09;

import java.util.Scanner;

// 소수 찾기
public class No1_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int[] num = new int[count];
		int result = 0;
		for(int i = 0; i < count; i++) {
			num[i] = scan.nextInt();
		}
		
		for(int i = 0; i < count; i++) {
			if(is_Prime(num[i]) == true) {
				result++;
			}
		}
		System.out.println(result);
	}

	public static boolean is_Prime(int number) {
		if(number == 1) {
			return false;
		}
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		// 위 조건을 통과한다면 소수
		return true;
		
	}
}
