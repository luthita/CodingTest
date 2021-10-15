package lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단어공부
public class No5_1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		String[] arrChar = word.split("");
		int[] count = new int[26];
		
		// 알파벳 사용 횟수 구하기

		for(int i = 0; i < arrChar.length; i++) {
			if('a' <= word.charAt(i) && word.charAt(i) <= 'z') {
				count[word.charAt(i) - 97]++;
			}
			else {
				count[word.charAt(i) - 65]++;
			}
		}

		
		// 출력
		int max = -1;
		char ch = '?';
		
		for(int i = 0; i < count.length; i++) {
			if(count[i] > max) {
				max = count[i];
				ch = (char)(i + 'A');
			}
			else if(count[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
