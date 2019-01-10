/**
 * ¿Í»§¶Ë
 * 
 * @author 34201
 *
 */
public class Client {
	public static void main(String []args) {
		// TODO Auto-generated method stub
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);

		director.consruct();

		Product product = builder.retrieveResult();
		
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());

	}
}
