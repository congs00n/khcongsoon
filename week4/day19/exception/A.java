package com.week4.day19.exception;

public class A {
	
		void methodA(int i) {
			
			int j = 0;
	
				try {
					j = i/0;
				} catch (Exception e) {
					System.out.println("[Exception] = " + e.toString());
				}	
				System.out.println(" ** Hint!! ** int 타입을 0 으로 나눌 수 없습니다 ");	
		}

	public static void main(String[] args) {
		
		A a = new A();
		int i = 5;
		a.methodA(i);

	}

}
