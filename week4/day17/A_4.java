package com.week4.day17;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class A_4 extends JFrame implements ActionListener {
		
	// Dialog 창이 만들어짐 
		B_4 b = new B_4();
	
	// 버튼 객체를 만들어둠 
		private JButton btnInsert = new JButton("입력");
	    private JButton btnUpdate = new JButton("수정");
	    private JButton btnDelete = new JButton("삭제");
	    private JButton btnSelect = new JButton("조회");
	    private JButton btnDetail = new JButton("상세보기");
		
			public A_4 () {
				initDisplay();
			}
			
			public void initDisplay ( ) {
				
				// Container 만듦 
				this.setSize(400, 500);
				this.setTitle("A-Title");
				this.setVisible(true);
				
					// Constructor 배치 및 붙이기 
				   this.setLayout(new FlowLayout());
				   this.add(btnInsert);
				   this.add(btnUpdate);
				   this.add(btnDelete);
				   this.add(btnSelect);
				   this.add(btnDetail);
			       btnInsert.addActionListener(this);
			       btnUpdate.addActionListener(this); 
			       btnDetail.addActionListener(this);
			}
		
	public static void main(String[] args) {
		A_4 a = new A_4();

//Error a.initDisplay(); 하지 않으면 컴포넌트가 나타나지 않음!
		
	}
	
	@Override
	public void actionPerformed (ActionEvent e) {
		
		Object obj = e.getSource();
		// if문이 세번이면 무조건 비교를 3번하게 되므로 비효율적이다. 
		// 만일 else if로 했다면 위의 조건이 만족되었을 때 아래 조건은 따지지 않으니 
		// 비용이 절약된다. 
		
		// 부모창이 열릴 때 열리는 창의 타이틀은 부모창에서 결정된다.*******
		if (obj == btnInsert) {
			// getText() 메소드 = 버튼의 텍스트를 return 하는 메소드  
			String label = btnInsert.getText();
			System.out.println(label);
			b.set(label, true);
		}
		else if (obj == btnUpdate) {
			String label = btnUpdate.getText();
			System.out.println(label);
			b.set(label, true);
		}
		else if (obj == btnDetail){
			String label = btnDetail.getText();
			System.out.println(label);
			b.set(label, true);
		}
	}

}
