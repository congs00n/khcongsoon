package com.week4.day19.twoArray;

public class TwoArray_1 {

	// UI - 테이블구조
	// 오라클 서버 설치 - 테이블 조회 - 테이블 구성요소 (컬럼 + 로우)
	public static void main(String[] args) {
		int jumsu[][]= new int[3][2];
		
		/* ********* jumsu[0] 호출하면???? 값이 호출되지만 2차 배열에서는 1차 배열의 주소번지가 출력된다. 
		 * 메모리 구조는 무조건 1층 구조이다. 2층이나 3층은 아예 없다.
		 * 마치 2층이나 3층이 있는 것처럼 처리하는 것이다.
		 * 다차원 배열이 가능하다. 
		 * */
		
		jumsu[0] = new int[2];
		jumsu[0][0] = 0;
		jumsu[0][1] = 0;
		jumsu[1] = new int[2];
		jumsu[1][0] = 0;
		jumsu[1][1] = 0;
		jumsu[2] = new int[2]; 
		jumsu[2][0] = 0;
		jumsu[2][1] = 0;
		
		
	}

}
