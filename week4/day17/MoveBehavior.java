package com.week4.day17;
/**
 * 인터페이스
 * - 단독으로 인스턴스화가 불가하다...
 * : 이것때문에 다형성이 가능한 것이다. 
 * : 이것때문에 구현체 클래스에 따라서 같은 이름의 메소드를 호출하더라도
 *   서로 다른 메소드가 실행되어 다른 기능이 제공되는 것이다. > 다형성 
 *   
 * - 오직 추상메소드만 가질 수 있다.
 * 
 * - 생성자를 가질 수 없다. 
 * 
 * - 상수를 가질 수 있다. 
 **/

public interface MoveBehavior {

	/**추상메소드
	 * - abstract 예약어는 생략이 가능
	 * - 메소드의 리턴타입이 있더라도 좌중괄호와 우중괄호를 쓸 수 없으므로 return 예약어를 쓰지 않아도 된다. **/
	public abstract void run();
	public abstract int stop();
}
