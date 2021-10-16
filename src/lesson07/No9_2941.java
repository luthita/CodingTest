package lesson07;

import java.util.Scanner;

// 크로아티아 알파벳
public class No9_2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		if(str.contains("z=") || str.contains("c=")|| str.contains("c-")
				|| str.contains("d-")|| str.contains("lj")||str.contains("nj") || str.contains("s=")) {
			str = str.replace("dz=", "#");
			str = str.replace("z=", "#");
			str = str.replace("c=", "#");
			str = str.replace("c-", "#");
			str = str.replace("d-", "#");
			str = str.replace("lj", "#");
			str = str.replace("nj", "#");
			str = str.replace("s=", "#");
			
			System.out.println(str.length());
		} else {
			System.out.println(str.length());
		}
	}

}
