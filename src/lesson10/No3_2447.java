package lesson10;

import java.util.Scanner;

// º°Âï±â - 10
public class No3_2447 {

	static String[][] arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		arr = new String[n][n];
		for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j] = " ";
            }
        }
		star(0, 0, n);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
	
	public static void star(int x, int y, int n) {
		if(n == 1) {
			arr[x][y] = "*";
			return;
		}
		
		int div = n / 3;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 1 && j == 1) {
					continue;
				}else {
					star(x + (i * div), y + (j * div), div);
				}
			}
		}
	}

}
