package lesson07;

import java.util.Scanner;

// ���ĺ� ã��
public class No3_10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		String[] alpha = "abcdefghijklmnopqrstuvwxyz".split("");
		
		for(int i = 0; i < 26; i++) {
			// ������  ���
			if(word.contains(alpha[i])) {
				for(int j = 0; j< word.length(); j++) {
					if(alpha[i].equals(String.valueOf(word.charAt(j)))) {
						System.out.print(j + " ");
						break;
					}
				}
			} else {
				System.out.print(-1 + " ");
			}
		}
	}

}
