package com.week4.day18.array;

public class IntArray_5 {

// 매개변수는 없고 리턴타입은 int[] 인 메소드 > 초기 배열을 생성해줌 
	public int[] initArray() {
		// 배열 선언과 생성을 동시에 해줌 
	int[] deptNos = new int[] {10, 20, 30};
	return deptNos;
	}

// 매개변수는 int[] 타입 , 리턴타입은 없는 메소드 
	public void arrayPrint(int[] deptNos) {
		for(int deptNo : deptNos) {
			System.out.println(deptNos);
		}
	}
	
	public static void main(String[] args) {
		IntArray_5 i3 = new IntArray_5();
		
		// initArray() 메소드의 리턴타입은 int[] 이므로 **int[] 변수이름** 으로 전달받아야 함!!! 
		int[] deptNos = i3.initArray();
		i3.arrayPrint(deptNos);
		

	}

}
