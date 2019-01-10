package mode;

public class ModeDuck extends Duck{
	public ModeDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	public void disPlay() {
		System.out.println("I'm a model duck");
		
	}

}
