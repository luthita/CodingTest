package lesson08;

import java.util.Scanner;

public class No3_1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int X = scan.nextInt();
		int line = 1; // ��
		int cnt = 1; // ���� ĭ ����

		// ���� Ȧ�� �϶�, �и� �þ
		// ���� ¦�� �϶�, ���ڰ� �þ
		while(line < X) {
			X -= line; 
			line++;
		}
		cnt = X;
		
		// ���� Ȧ�� �� ���
		if(line % 2 == 1) {
			System.out.println((line + 1 - cnt) + "/" + cnt);
		}else {
			System.out.println(cnt + "/" + (line + 1 - cnt));
		}
		
	}

}
