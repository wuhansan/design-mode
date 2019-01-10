package decorate;

public class Main {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $ " + beverage.cost());

		Beverage hBeverage = new HouseBlend();
		hBeverage = new Mocha(hBeverage);
		hBeverage=new Soy(hBeverage);
		System.out.println(hBeverage.getDescription()+" $ "+hBeverage.cost());
	}

}
