
public class ConcretePrototype1 implements Prototype {

	private String name;

	public Prototype clone() {
		// ��򵥵Ŀ�¡���½�һ�������������û�����ԾͲ��ٸ���ֵ��
		Prototype prototype = new ConcretePrototype1();

		prototype.setName(this.name);

		return prototype;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Now in  Prototype1 , name = " + this.name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
}
