package lesson08;

import java.util.Scanner;

/*
public class No2_2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int count = 2;
		if(N == 1) {
			System.out.println(1);
		} else {
			while(sum(count) - 1 < N) {
				count++;
			}
			System.out.println(count);
		}
		
	}

	public static int sum(int num) {
		int sum = 0;
		if(num == 1)
			return 2;
		else
			return sum = (6 * num - 6) + sum(num-1);
	}
}
*/
public class No2_2292 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        
		int layer = 1;
		int num = 0; 
		int total = 1; 
		
		while (true) {
			if (n <= total)
				break;
			else {
				num += 6;
				total+=num;
				layer++;
			}
		}
		System.out.println(layer);
    }
}
