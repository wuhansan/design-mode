
public class ConcreteBuilder implements Builder {
	
	private Product product = new Product();

	/**
	 * 构建产品第一部分
	 */
	@Override
	public void buildPart1() {
		// TODO Auto-generated method stub
		product.setPart1("构造了地基");

	}
	/**
	 * 构建产品第二部分
	 */

	@Override
	public void buildPart2() {
		// TODO Auto-generated method stub
		
		product.setPart2("构造了房梁");

	}
	/**
	 * 产品返回方法
	 */

	@Override
	public Product retrieveResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
