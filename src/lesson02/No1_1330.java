package lesson02;

import java.util.Scanner;

public class No1_1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A�� B���� ū ��쿡�� '>'�� ����Ѵ�.
//		A�� B���� ���� ��쿡�� '<'�� ����Ѵ�.
//		A�� B�� ���� ��쿡�� '=='�� ����Ѵ�
		
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
