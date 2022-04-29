package com.day10;

public class Shuffle_4 {

	public boolean methodA (int i, int j) {
		int imsi = i ; // 지역변수 imsi  
		i = j;
		j = imsi;
		System.out.println(i + ", " +j);
		return true; // 셔플이 성공하면 true, 실패하면 false 
	}
	
	public void methodB() {}
	
	public static void main(String[] args) {
		Shuffle_4 s4 = new Shuffle_4 ();
		boolean isOK = s4.methodA(3, 6);
		
		if (isOK) {
			System.out.println("참 잘했어요! ");
		}
		s4.methodB();

	}

}
