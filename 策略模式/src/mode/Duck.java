package mode;

public abstract class Duck {
	public Duck() {
		// TODO Auto-generated constructor stub
	}

	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}
	
	public void swim() {
		System.out.println("All ducks float , even decoys! ");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
		
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
		
	}
}
