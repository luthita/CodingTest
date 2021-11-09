package lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 약수의 합
public class No4_17425 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int caseCount = Integer.parseInt(br.readLine());
		
		int[] N = new int[caseCount];
		
		for(int i = 0; i < caseCount; i++) {
			long result = 0;
			
			N[i] = Integer.parseInt(br.readLine());
			for(int j = 1; j <= N[i]; j++) {
				result += (N[i] / j) * j;
			}
			sb.append(result).append("\n");
		}
		System.out.println(sb);
		
	}

}
