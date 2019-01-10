package Observer;
/**
 * 主题接口
 * @author 34201
 *
 */
public interface Subject {

	void registerObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObserver();

}
