package com.day10;
// 변수가 몇 개 필요하니? - 3개 
// 변수 위치는? 
public class Shuffle {
	int i = 3;
	int j = 6;
	int imsi;
// consturctor
	
	public Shuffle (int i, int j, int imsi) {
		this.i = i;
		this.j = j;
		this.imsi = imsi;
	}
	
	public static void main(String[] args) {
		Shuffle sfle = new Shuffle(0, 0, 0);
		System.out.println(sfle.i);
	}

}
