package com.week4.day19.exception;

import java.util.Scanner;

/*왜 파라미터를 String 으로 받아야 할까? 생각해 볼 수 있는 예제*/
public class BaseBallgameDemo4 {
	// 사용자가 입력한 값 배열을 이용해서 받아서 비교! 
	int my[] = new int[3];
	
	public String account (String input) {
		System.out.println("사용자가 입력한 값 받아오기 : "+ input);
		
		if (input.length() != 3 ) {
			return "세자리 숫자를 입력하세요.";
		}
		int temp = 0;
		
		try {
			temp = Integer.parseInt(input);
		} catch (Exception ex) {
			return "숫자만 입력하세요.";
		}
		
		my[0] = temp/100;// 579
		my[1] = (temp%100)/10;// 7
		my[2] = temp%10;
		for(int val:my) {
			System.out.println(val);
		}
		
		return "1스 0볼";
		
	}
	
	public static void main(String[] args) {
		BaseBallgameDemo4 bbg = new BaseBallgameDemo4();
		Scanner scan = new Scanner(System.in);
		System.out.println("0부터 9까지 세자리 숫자를 입력하세요. ");
		String result = bbg.account(scan.next());
		System.out.println("판정 결과 : " + result );
	}

}
