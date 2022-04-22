package com.day5;

import java.util.Scanner;
public class ChaenSj {
	
	void stuScore() {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int[] stu = new int[n];
	
		double sum = 0;
		for (int i = 0; i < n; i ++) {
			System.out.println("성적을 입력해 주세요.");
			stu[i] = scanner.nextInt();
			sum += stu[i];
		}
		System.out.println("성적의 합 = " + sum );
		System.out.print("평균성적은 = " + sum/n+ "입니다.");
	}


	public static void main(String[] args) {
		ChaenSj p1 = new ChaenSj();
		System.out.println("학생이 몇 명입니까?");
		p1.stuScore(); // 학생 성적의 합 
		

	}

}
