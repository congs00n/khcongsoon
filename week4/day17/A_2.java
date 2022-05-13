package com.week4.day17;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
// 콘테이너 
import javax.swing.JFrame;


public class A_2 extends JFrame implements ActionListener {
	
	
			B_1 b1 = new B_1 ();
			JButton jbtn_insert = new JButton("입력");

			public A_2 () {
				System.out.println("A_1생성자 호출 성공..!");
				
				this.setSize(400, 500);
				this.setTitle("A_1-Title");
				this.setVisible(true);
				
				
				this.setLayout(new FlowLayout());
				this.add("North",jbtn_insert);
				this.add(jbtn_insert);
				
				
				jbtn_insert.addActionListener(this);		
			}
	
////Main
	public static void main(String[] args) {
	
	/**try...catch 블록**/
		
		try {
			// 예외가 발생할 가능성이 있는 코드 집어 넣기 
			A_2 a1 = new A_2(); // 타입만 정해졌다. 
		
		} catch (Exception e) {
			System.out.println("NullPointerException 발생...!");
		}
		
	}
	
	// 아래 메소드는 ActionListener 라는 인터페이스에 선언되어 있는 추상메소드이다. 
	@Override
	public void actionPerformed (ActionEvent e) {
		
		// 버튼을 누르는건 사용자 이지만 느끼는 것은 JVM이다.
		// JVM이 느낀 버튼의 주소번지를 가져오는 메소드가 있다.
		// 더 큰 타입은 더 작은 방에 담을 수 없다. 대입할 수 없다. 오른쪽이 무조건 작아야 한다. 
		// 강제 타입변환 (형전환)
		
		/**JVM이 정의하고 있는 객체중에 JVM이 대신 인스턴스화 해주는 클래스가 있다. 
		 * 의존성 주입이다. - 내가 필요할 때 알아서 해줌.. **/
		Object obj = e.getSource();
		if(obj == jbtn_insert) {
			System.out.println("입력버튼 눌림.");
		}
	}
	
			
		

}
