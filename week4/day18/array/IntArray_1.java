package com.week4.day18.array;

public class IntArray_1 {
	
	// 부서 번호를 담을 배열 선언 (로딩중! )
	int[] deptNos = null;
	
	// 생성자 
	public IntArray_1() {
		// 길이가 3인 배열 생성! (완! )
		deptNos = new int[3];
		initArray();
		arrayPrint();
	}

	// 배열에 값을 넣어주는 메소드
	public void initArray() {
		deptNos[0] = 10;
		deptNos[1] = 20;
		deptNos[2] = 30;	
	}
	
	// 배열의 값을 출력하는 메소드 
	public void arrayPrint() {
		for (int i = 0; i < deptNos.length; i++) {
			System.out.println(deptNos[i]);
		}
	}
	
	public static void main(String[] args) {
		// 생성자 호출 
		new IntArray_1();
	}

}
