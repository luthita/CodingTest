package lesson08;

import java.util.Scanner;

// �����̴� �ö󰡰� �ʹ�
public class No4_2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int V = scan.nextInt();
		int day = (V - B) / (A - B);
		// �������� ���� ��� (�ܿ� ���� ���� ���)
		if ((V - B) % (A - B) != 0) {
			day++;
		}
		System.out.println(day);
	}

}
