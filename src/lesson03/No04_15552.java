package lesson03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No04_15552 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 모르는 개념이 많으니 다시 공부하자
		// BufferedReader, BufferedWriter, StringTokenizer
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());

		StringTokenizer st;
		
		for(int i = 1; i <= count; i++) {
			st = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		bw.close();
	}

}
