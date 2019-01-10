/**
 * ������
 * 
 * @author 34201
 *
 */
public class Director {
	/**
	 * ���е�ǰ��Ҫ��ʹ�õĹ���������
	 */
	private Builder builder;

	public Director(Builder builder) {
		super();
		this.builder = builder;
	}

	/**
	 * ��Ʒ���췽��,���ø���������췽��
	 */
	public void consruct() {
		builder.buildPart1();
		builder.buildPart2();
	}

}
