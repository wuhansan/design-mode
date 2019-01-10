import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {

	/**
	 * 用来记录原型的编号和原型实例的对应关系
	 */

	private static Map<String, Prototype> map = new HashMap<String, Prototype>();

	/**
	 * 私有构造方法，避免外部创建实例
	 */
	private PrototypeManager() {

	}

	/**
	 * 向原型管理器里面添加或者修改某个原型注册
	 * 
	 * @param prototypeId 原型编号
	 * @param prototype   原型实例
	 */

	public synchronized static void setPrototype(String prototypeId, Prototype prototype) {
		map.put(prototypeId, prototype);
	}

	public synchronized static Prototype getPrototype(String prototypeId) throws Exception {
		Prototype prototype = map.get(prototypeId);

		if (prototype == null) {
			throw new Exception("您希望获取的原型还没有注册或者已经被销毁");
		}

		return prototype;
	}

	public synchronized static void removePrototype(String prototypeId) {
		map.remove(prototypeId);
	}


}
