package com.week4.day18.array;

public class IntArray_4 {

	// 메소드
// 매개변수는 int[] 타입, 리턴타입은 없는 메소드 
// 받는다 : deptNos{}; 
// 보낸다 : 없음 
	public void initArray(int[] deptNos) {
		arrayPrint(deptNos);
	}// initArray()
	
	public void arrayPrint(int[] deptNos) {
		for(int deptno:deptNos) {
			System.out.println(deptno);
		}
	}
	
	public static void main(String[] args) {
		IntArray_4 i3 = new IntArray_4();
		int[] deptNos = null;
		deptNos = new int[] {10, 20, 30};
		i3.initArray(deptNos);
	}

}
