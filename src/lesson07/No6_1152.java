package lesson07;

import java.util.Scanner;

// 단어의 개수
public class No6_1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// split 주의할 점 : 문자열 "" 출력 시, 결과값 1 나옴, 그러므로 "" 일 경우 0으로 출력하도록 할것
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		str = str.trim();
		if(str.equals("")) {
			System.out.println(0);
		} else {
			String[] arrStr = str.split(" ");
			System.out.println(arrStr.length);
		}
		
	}

}
