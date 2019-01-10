package Observer;

/**
 * 所有的气象组件度实现此观察接口， 这样，主题在需要通知观察者的时候，有了一个共同的接口
 * 
 * @author 34201
 *
 */
public interface Observer {
	
	public void update(float temp, float humidity, float pressure);

}
