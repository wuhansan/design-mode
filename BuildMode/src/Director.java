/**
 * 导演者
 * 
 * @author 34201
 *
 */
public class Director {
	/**
	 * 持有当前需要的使用的构造器对象
	 */
	private Builder builder;

	public Director(Builder builder) {
		super();
		this.builder = builder;
	}

	/**
	 * 产品构造方法,调用各个零件建造方法
	 */
	public void consruct() {
		builder.buildPart1();
		builder.buildPart2();
	}

}
