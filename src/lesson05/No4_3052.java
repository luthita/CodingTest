package lesson05;

import java.util.HashSet;
import java.util.Scanner;

public class No4_3052 {

	// 문제 : 서로 다른 나머지값이 몇개가 있나요?
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		// HashSet 사용 X
		/*
		int[] arr = new int[10];
		int[] count = new int[42];
		int num = 0;
		for(int i = 0; i < 10; i++) {
			arr[i] = scan.nextInt() % 42;
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		
		for(int i = 0; i< count.length; i++) {
			if(count[i] != 0) {
				num++;
			}
		}
		System.out.println(num);
		*/
		
		// HashSet 사용
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			h.add(scan.nextInt() % 42);
			// 입력받은 값의 나머지 값을 add 메소드를 통해 HashSet에 저장
		}
		System.out.println(h.size());
	}

}
