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
			
			//앞 문자와 같지 않다면
			if(prev != now) {
				
				// 해당 문자가 처음 나오는 경우
				if(check[now -'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				}
				
				// 해당 문자가 나온 적 있는 경우
				else {
					return false;
				}
			}
			
			// 앞선 문자와 i 번째 문자가 같다면
			else {
				continue;
			}
		}
		return true;
	}
}
