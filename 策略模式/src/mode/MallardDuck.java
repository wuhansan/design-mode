package mode;

public class MallardDuck extends Duck {
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWing();
	}
	
	public void disPlay() {
		System.out.println("I'm a real Mallard duck");
	}

}
