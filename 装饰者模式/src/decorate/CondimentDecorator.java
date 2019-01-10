package decorate;

/**
 * 为了让 CondimentDecorator 替代 Beverage，所以让其拓展自 Beverage
 * @author 34201
 *
 */
public abstract class CondimentDecorator extends Beverage {

	public abstract String getDescription();

}
