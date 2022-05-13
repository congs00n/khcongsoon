package com.week4.day19.exception;

public class BaseBallgameDemo3 {
	public String account (String input) {
		// length : 배열의 원소 갯수
		// length() : 문자열의 갯수
		
		if (input.length() != 3 ) {
			return "세자리 숫자를 입력하세요.";
		}
		int temp = 0;
		
		try {
			temp = Integer.parseInt(input);
		} catch (Exception ex) {
			return "숫자만 입력하세요.";
		}
		return "1스 0볼";
	}
	
	public static void main(String[] args) {
		BaseBallgameDemo3 bbg = new BaseBallgameDemo3();
		String result = bbg.account("안녕3");
		System.out.println("판정 결과 : " + result );
	}

}
