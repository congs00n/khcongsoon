package com.week4.day17;

import javax.swing.JDialog;

public class B_4 extends JDialog {
	
		// 전역변수를 선언해서 생성자에 원하는 변수를 받아 처리할 수도 있음. 	
		String title = null;
		boolean isView = false;
	
			public B_4 () {
				initDisplay();
			}
			
			public void set (String title, boolean isView) {
				this.setTitle(title);
				this.setVisible(isView);
			}
	
			public void initDisplay() {
				this.setSize(300,500);
				this.setTitle("B-dialog");
				this.setVisible(isView);
			}

}
