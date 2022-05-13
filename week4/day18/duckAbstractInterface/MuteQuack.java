package com.week4.day18.duckAbstractInterface;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<<조용 ~ >>");
	}

}
