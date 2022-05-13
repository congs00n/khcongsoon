package com.week4.day19.exception;

import java.util.Scanner;

public class BaseBallGameDemo1 {
		
		// 사용자가 입력한 숫자를 받는 코드
		public int userInput (String input) {
			int my = 0;
			try {
				my = Integer.parseInt(input);
				
				// 다중 catch문일때 반드시 하위 클래스가 먼저 와야 한다. 
				
			} catch (NumberFormatException e) {
				System.out.println("제발 숫자만 입력하세요.");
				
			} catch (Exception ex) {
				// toString 으로 에러 이름 확인 가능!
				System.out.println(ex.toString());
			}
			// 설령 문제가 발생하더라도 여기까지 진행됩니다.
			// ** 이게 예외처리 하는 이유이다.
			// 예외가 발생하더라도 프로그램이 **중지하지 않고 다음으로 이동** 가능함. 
			System.out.println("요기");
			return my;
		}
	public static void main(String[] args) {
		BaseBallGameDemo1 bbg = new BaseBallGameDemo1();
		Scanner in = new Scanner(System.in);
		
		int result = bbg.userInput(in.next());
		System.out.println("사용자가 입력한 값은 : " + result);
		
	
	}

}
