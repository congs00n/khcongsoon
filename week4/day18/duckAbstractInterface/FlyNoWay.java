package com.week4.day18.duckAbstractInterface;


// FlyNoWay는 고무오리 혹은 나무오리 즉, 못 나는 오리의 구현체 클래스이면 된다. 
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("저는 못 날아요");
	}

}
