package com.day10;

public class Shuffle_5 {
	//전역변수니까 인자 필요 없음 
	int i=3;
	int j=6;

	public boolean methodA () {
		boolean isOK = false; // 변수 생성  
		
		i = j;
		j = i;
		System.out.println(i + ", " +j);
		if (i != 3 && j !=6) isOK = true;
		return isOK; // 셔플이 성공하면 true, 실패하면 false 
	}
	
	public void methodB() {}
	
	public static void main(String[] args) {
		Shuffle_5 s4 = new Shuffle_5 ();
		boolean isOK = s4.methodA();
		
		if (isOK) {
			System.out.println("참 잘했어요! ");
		}else {
			System.out.println("다시 한번 도전! ");
		}
		s4.methodB();

	}

}
