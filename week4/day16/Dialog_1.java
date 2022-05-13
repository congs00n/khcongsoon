package com.week4.day16;

import javax.swing.JDialog;

public class Dialog_1 extends JDialog {
	// 디폴트 생성자는 생략가능
	// 인스턴스화를 했을 때 > Main_1 클래스의 initDisplay()메소드 안에서 즉, 20번 라인에서! 
	// Dialog_1 dialog = null; (선언 즉, 초기값은 null!)
	// dialog = new Dialog_1(); (생성 즉, 메모리 loading....!)
	// Dialog_1 dialog = new Dialog_1 (); (선언과 생성 동시에 즉, 생성자 호출!)
	
   public void initDisplay() { // 화면을 그려주는 메소드 구현이다. (서브창 - 자녀창이다. )
       this.setTitle("메인 서브창");
       this.setSize(300, 400);
       this.setVisible(true);
   }
}