package com.week4.day18.duckAbstractInterface;

// FlyWithWings는 FlyBehavior인터페이스의 구현체 클래스이다.
// 왜? 
// FlyBehavior에 있는 추상 메소드를 내가 오버라이딩 하고 있으니까.
// 아래 클래스는 나는 새에 해당되는 구현체 클래스에 해당! 
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("날고 있어요.");
	}

}
