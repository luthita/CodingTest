package lesson07;

import java.util.Scanner;

public class No10_1316 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int N = scan.nextInt();
		
		for(int i = 0; i < N; i++) {
			if(check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = scan.next();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			
			//�� ���ڿ� ���� �ʴٸ�
			if(prev != now) {
				
				// �ش� ���ڰ� ó�� ������ ���
				if(check[now -'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				}
				
				// �ش� ���ڰ� ���� �� �ִ� ���
				else {
					return false;
				}
			}
			
			// �ռ� ���ڿ� i ��° ���ڰ� ���ٸ�
			else {
				continue;
			}
		}
		return true;
	}
}
