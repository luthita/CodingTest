package lesson05;

import java.util.Arrays;
import java.util.Scanner;


// 평균 조작 문제
public class No5_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		double[] score = new double[N];
		
		for(int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
		}
		
		Arrays.sort(score);
		double M = score[score.length-1];
		double sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			score[i] = score[i] / M * 100;
			sum += score[i];
		}
		double avg = sum / score.length;
		
		System.out.println(avg);
	}

}
