package lesson11;

import java.util.Scanner;

// ü���� �ٽ� ĥ�ϱ�
public class No4_1018 {
	static char[][] b = {
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
    };
	static char[][] w = {
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
    };
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int err = 64;
		char[][] myChess = new char[N][M];
		
		
		
		for(int i= 0; i < N; i++) {
			String s = scan.next();
			for(int j = 0; j < M; j++) {
				myChess[i][j] = s.charAt(j);
			}
		}
		
		
		// myChess���� N-7 ȸ ��ŭ ����(��)
		for(int i = 0; i < N-7; i++) {
			// myChess���� N-7 ȸ ��ŭ ����(��)
			for(int j = 0; j < M-7; j++) {
				int countB = 0;
				int countW = 0;
				for(int k = 0; k < 8; k++) {
					for(int l = 0; l < 8; l++) {
						
						// 8 x 8 ó�� �����ϴ� ��ġ�� 'B'�϶�
						if(myChess[i + k][j + l] != b[k][l]) {
							countB++;
						}
						if(myChess[i + k][j + l] != w[k][l]) {
							countW++;
						}
						
						
					}
				}
				err = Math.min(countW, err);
				err = Math.min(countB, err);
			}
		}
		System.out.println(err);
	}

}
