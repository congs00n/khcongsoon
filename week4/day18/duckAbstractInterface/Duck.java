package com.week4.day18.duckAbstractInterface;

public abstract class Duck {
	
	// 나는 행동, 꽥 행동은 더 추상적인 의미 >> 인터페이스!! 
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {}
		 	
			// 추상클래스에서는 구현체 클래스를 결정할 수 없다. 
			// 왜냐하면 구체적인 클래스가 정해지지 않았다.  WoodDuck 인지 RubberDuck인지 or MallarDuck인지..
			// flyBehavior = new FlyWithWings();
	
	// 고무오리와 나무오리와 청둥오리는 외모가 각기 다르다.
	// 서로 다른 외모를 구현하려면 구현체 클래스가 필요하다. 
	
	public abstract void display ();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void perFormQuack() {
		quackBehavior.quack();
	}
	
	public void swimming() {
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
	}

}
