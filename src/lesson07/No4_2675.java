package lesson07;

import java.util.Scanner;

// ���ڿ� �ݺ�
public class No4_2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int[] caseCount = new int[count];
		String[] str = new String[count];
		// �Է¹ޱ�
		for(int i = 0; i < count; i++) {
			caseCount[i] = scan.nextInt();
			str[i] = scan.next();
		}
		
		for(int i = 0; i < count; i++) {
			for(int j = 0; j < str[i].length(); j++) {
				for(int k = 0; k < caseCount[i]; k++) {
					System.out.print(str[i].charAt(j));
				}
			}
			System.out.println();
		}
	}

}
