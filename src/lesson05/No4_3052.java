package lesson05;

import java.util.HashSet;
import java.util.Scanner;

public class No4_3052 {

	// ���� : ���� �ٸ� ���������� ��� �ֳ���?
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		// HashSet ��� X
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
		
		// HashSet ���
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			h.add(scan.nextInt() % 42);
			// �Է¹��� ���� ������ ���� add �޼ҵ带 ���� HashSet�� ����
		}
		System.out.println(h.size());
	}

}
