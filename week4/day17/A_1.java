package com.week4.day17;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
// 콘테이너 
import javax.swing.JFrame;

// Frame 생성하기
// 방법 1 - JFrame 객체 생성.
// 방법 2 - JFrame 상속을 통해.. (택!)
public class A_1 extends JFrame implements ActionListener {
	
	// 인스턴스화는 초기화와 생성하기를 나누어 작성할 수도 있다. (클래스 선언분에서는 불가....!!)
			B_1 b1 = new B_1 ();
			JButton jbtn_insert = new JButton("입력");
			
	// 생성자 
			public A_1 () {
				System.out.println("A_1생성자 호출 성공..!");
				
				this.setSize(400, 500);
				this.setTitle("A_1-Title");
				this.setVisible(true);
				
				/** FlowLayout API 를 이용해서 배치할때는 동, 서, 남, 북 중앙 배치 불가하다. 
				 * BorderLayout 은 default 라서 기본적으로 된다. so 여기서는 BorderLayout으로 사용..
				 * **/
				this.setLayout(new FlowLayout());
				this.add("North",jbtn_insert);
				this.add(jbtn_insert);
				
				/** 입력버튼을 눌렀을 때 이벤트를 감지하고 콜백메소드를 호출하는 코드 추가
				 * 현재 클래스 안에는 actionPerformed 라는 메소드가 재정의가 안 되어 있기 때문에 implements 해주어야 함. **/
				jbtn_insert.addActionListener(this);
				
			}
	
	// 메소드
			public void initDisplay() {
			}
	
////Main
	public static void main(String[] args) {
		//A_1 a1 = null; // 타입만 정해졌다 > NullPointerException이 발생하면 그 뒤에 어떤 코드도 실행기회를 갖지 못함. 
		A_1 a1 = new A_1();		
	}
	
	// 아래 메소드는 ActionListener 라는 인터페이스에 선언되어 있는 추상메소드이다. 
	@Override
	public void actionPerformed (ActionEvent e) {
		
	}
	
			
		

}
