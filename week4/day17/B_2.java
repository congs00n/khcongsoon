package com.week4.day17;

import javax.swing.JDialog;

public class B_2 extends JDialog {
			
	/**생성자
	 	* { } 안에 실행문을 작성할 수 있다.
	 	* 실행문 > 변수선언, 제어문, 조건문 & 반복문, 연산자, 산술식) **/
			public B_2 () {
				System.out.println("B 디폴트 생성자 호출 성공.. 전변 초기화.. 선언 시 초기화 생략 가능");
				initDisplay();
			}
			
	/**메소드**/
			public void initDisplay() {
				this.setSize(300,500);
				this.setTitle("B-dialog");
				this.setVisible(true);
			}
			
	public static void main(String[] args) {
		B_2 b2 = new B_2();
		b2.initDisplay();
	}

}
