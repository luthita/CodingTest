package lesson05;

import java.util.Scanner;

// 평균은 넘겠지
public class No7_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int num;
		double[] avg = new double[count];
		for(int i = 0; i < count; i++) {
			
			num = scan.nextInt();
			int sum = 0;
			int avgCount = 0;
			
			int[] score = new int[num];
			for(int j = 0; j < num; j++) {
				score[j] = scan.nextInt();
				sum += score[j];
			}
			double avgScore = sum / (double)num;
			
			for(int j = 0; j < num; j++) {
				if(score[j] > avgScore) {
					avgCount++;
				}
				avg[i] = avgCount / (double)num * 100;
			}
			
			System.out.format("%.3f%%%n", avg[i]);
		}
	}
}
