package decorate;

public class Espresso  extends Beverage{

	/**
	 * description �̳��� Beverage
	 */
	public Espresso() {
		// TODO Auto-generated constructor stub
		description = "Espresso";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
