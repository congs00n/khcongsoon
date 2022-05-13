package com.week4.day17.test01;

public class RanJavaExe {
	

	public static void main(String[] args) {
		
		RanArrayNum java2022 = new RanArrayNum ();
		int[] xxx = new int[5];
		
		System.out.println("****** 'xxx'의 랜덤성적******");
		java2022.nanSu(xxx);
		
		System.out.println("\n******총점******");
		java2022.jumsuSum();

		System.out.println("\n******평균******");
		java2022.jumsuAvg();
		
		System.out.println("\n******석차******");
		java2022.jumsuRank();
	}

}
