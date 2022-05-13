package com.week4.day17;

// 콘테이너 
import javax.swing.JFrame;

// Frame 생성하기
// 방법 1 - JFrame 객체 생성.
// 방법 2 - JFrame 상속을 통해.. (택!)
public class A extends JFrame {
		
		B b = new B();
		// B 의 주소를 참조하는 객체 b 생성됨.  
	
		// 생성자 
			public A () {
				this.setSize(400, 500);
				this.setTitle("A-Title");
				this.setVisible(true);
			}
		
	public static void main(String[] args) {
			
		A a = new A();
		
	}

}
