package com.week4.day18.array;

public class IntArray_2 {

	int[] deptNos = null;
	
	public IntArray_2() {
		deptNos = new int[3];
		initArray();
		arrayPrint();
	}
	
	public void initArray() {
		deptNos[0] = 10;
		deptNos[1] = 20;
		deptNos[2] = 30;
	}
	
	
	public void arrayPrint() {
		// 개선된 for 문 
		/*
		 * for (int deptNo = 0; depNo < deptNos.length; deptNo++){
		 * 			System.out.println()*/
		for (int deptNo : deptNos) {
			System.out.println(deptNo);
		}
	}
	public static void main(String[] args) {
		new IntArray_2();

	}

}
