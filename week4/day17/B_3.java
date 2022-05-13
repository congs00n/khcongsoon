package com.week4.day17;

import javax.swing.JDialog;

public class B_3 extends JDialog {
			
	
			public B_3 () {
				System.out.println("B 디폴트 생성자 호출 성공.. 전변 초기화.. 선언 시 초기화 생략 가능");
				initDisplay();
			}
			
	
			public void initDisplay() {
				System.out.println("initDisplay 호출");
				this.setTitle("B-dialog");
				this.setSize(300,500);
				this.setVisible(true);
			}
		
		public static void main(String[] args) {
			B_3 b = new B_3();
			System.out.println("before ==> " + b);
			
			// 아래의 줄이 호출이 안 된 이유는 생성자에서 이미 호출이 되었기 때문..!
			b.initDisplay();
			
			b = new B_3();
			System.out.println("after ==>" + b);
		}
}
