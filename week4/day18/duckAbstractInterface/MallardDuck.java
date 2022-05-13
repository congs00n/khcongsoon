package com.week4.day18.duckAbstractInterface;

public class MallardDuck extends Duck{
	public MallardDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	
	public void display() {
		System.out.println("저는 물오리입니다.");
	}
}
