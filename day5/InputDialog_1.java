package com.day5;

import javax.swing.JOptionPane;

public class InputDialog_1 {

	public static void main(String[] args) {
		// 사용자에 의한 첫번째 문자열 입력
		String inputValue = null;
		inputValue = JOptionPane.showInputDialog("당신의 국어점수는?");
		System.out.println("당신의 국어점수는? : " + inputValue);
	}
}