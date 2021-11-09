package lesson12;

import java.util.Arrays;
import java.util.Scanner;

// 약수
public class No2_1037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] arr = new int[N];
		int result = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		if(N == 1){
			result = arr[0] * arr[0];
			System.out.println(result);
		}
		// 진짜 약수 갯수가 짝수인 경우
		else if(N % 2 == 0) {
			result = arr[0] * arr[N-1];
			System.out.println(result);
		} 
		// 진짜 약수 갯수가 홀수인 경우
		else{
			result = arr[N / 2] * arr[N / 2];
			System.out.println(result);
		}
		
		
	}

}
