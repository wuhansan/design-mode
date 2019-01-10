/**
 * 
 * @author 34201  
 * 克隆自身的方法
 * 一个从自身克隆出来的对象
 */
public interface Prototype {

	public Prototype clone();
	
	public String getName();
	
	public void setName(String name);

}
