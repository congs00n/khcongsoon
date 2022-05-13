package com.week4.day17;

public class Pride extends Car implements MoveBehavior {

	@Override
	public void run() {
		speed = speed + 2;
	}

	
	@Override
	public int stop() {
		
		return 0;
	}

	@Override
	public void display() {
		
	}
}

/**
 * Pride = MoveBehavior 인터페이스의 *구현체 클래스* 라 칭함 **/
 