package lesson07;

import java.util.Scanner;

// �ܾ��� ����
public class No6_1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// split ������ �� : ���ڿ� "" ��� ��, ����� 1 ����, �׷��Ƿ� "" �� ��� 0���� ����ϵ��� �Ұ�
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
