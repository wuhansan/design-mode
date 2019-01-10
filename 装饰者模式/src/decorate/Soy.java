package decorate;


public class Soy extends CondimentDecorator {
	
	
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+" , Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.11+ beverage.cost() ;
	}

}
