import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {

	/**
	 * ������¼ԭ�͵ı�ź�ԭ��ʵ���Ķ�Ӧ��ϵ
	 */

	private static Map<String, Prototype> map = new HashMap<String, Prototype>();

	/**
	 * ˽�й��췽���������ⲿ����ʵ��
	 */
	private PrototypeManager() {

	}

	/**
	 * ��ԭ�͹�����������ӻ����޸�ĳ��ԭ��ע��
	 * 
	 * @param prototypeId ԭ�ͱ��
	 * @param prototype   ԭ��ʵ��
	 */

	public synchronized static void setPrototype(String prototypeId, Prototype prototype) {
		map.put(prototypeId, prototype);
	}

	public synchronized static Prototype getPrototype(String prototypeId) throws Exception {
		Prototype prototype = map.get(prototypeId);

		if (prototype == null) {
			throw new Exception("��ϣ����ȡ��ԭ�ͻ�û��ע������Ѿ�������");
		}

		return prototype;
	}

	public synchronized static void removePrototype(String prototypeId) {
		map.remove(prototypeId);
	}


}
