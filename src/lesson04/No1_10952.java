package lesson04;

import java.util.ArrayList;
import java.util.Scanner;

public class No1_10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		
		while(true) {
			a.add(scan.nextInt());
			b.add(scan.nextInt());
			
			if(a.get(a.size()-1)== 0 && b.get(b.size()-1) == 0) {
				a.remove(a.size()-1);
				b.remove(b.size()-1);
				break;
			}
		}
		
		for(int i = 0; i < a.size(); i++) {
			int sum = a.get(i) + b.get(i);
			System.out.println(sum);
		}
	}

}
