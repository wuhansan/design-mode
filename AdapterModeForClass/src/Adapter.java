/**
 * 适配器角色  具体类  
 * 把源接口转换成目标接口
 * @author 34201
 *
 */
public class Adapter  extends Adaptee implements Target{
	/**
	 * 由于源类Adapter没有办法sampleOperation2()
	 * 因此适配器补充这个方法
	 */

	@Override
	public void sampleOperation2() {
		// TODO Auto-generated method stub
		
	}

}
