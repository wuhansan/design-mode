
public class ConcreteBuilder implements Builder {
	
	private Product product = new Product();

	/**
	 * ������Ʒ��һ����
	 */
	@Override
	public void buildPart1() {
		// TODO Auto-generated method stub
		product.setPart1("�����˵ػ�");

	}
	/**
	 * ������Ʒ�ڶ�����
	 */

	@Override
	public void buildPart2() {
		// TODO Auto-generated method stub
		
		product.setPart2("�����˷���");

	}
	/**
	 * ��Ʒ���ط���
	 */

	@Override
	public Product retrieveResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
