package com.day5;

public class SungJuk {

	int kor = 90;
	int eng = 95;
	int math = 60;
	//method
	int total() {
		int sum = 0;
		sum = kor + eng + math;
		return sum;
	}
	double avg(int sum) {
		double avg = sum/3.0;
		return avg;
	}
	public static void main(String[] args) {
		SungJuk p1 = new SungJuk();
		int sum = p1.total();
		System.out.println(sum);
		double avg = p1.avg(sum);
		System.out.println(avg);

	}
}
