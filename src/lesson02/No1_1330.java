package lesson02;

import java.util.Scanner;

public class No1_1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A가 B보다 큰 경우에는 '>'를 출력한다.
//		A가 B보다 작은 경우에는 '<'를 출력한다.
//		A와 B가 같은 경우에는 '=='를 출력한다
		
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1>num2) {
			System.out.println(">");
		}else if(num1<num2) {
			System.out.println("<");
		} else {
			System.out.println("=");
		}
			
	}

}
