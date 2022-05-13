package com.week4.day19.exception;

// throws 미루기!! 예제
public class B {

	// 메소드 뒤에 throws Exception 이 붙으면!! 
	// 예외처리를 나를 호출한 곳에서 처리해 주세요!!!!!!!!
	// 즉, 메소드를 작성할 때 에러가 발생할 것을 염두에 두기 때문에 throws Exception을 붙이는 것 
	void methodA() throws Exception {
		
		int[] is = {1,2,3};
		
			System.out.println(is [3]);
			
	}
	
	public static void main(String[] args) {
		B b = new B();
		try {
			b.methodA();
		} catch (Exception e) {
			System.out.println("예외처리 발생");
		}
		System.out.println("Hint!! 배열 인덱스 위치를 확인해보세요.");
	}

}
