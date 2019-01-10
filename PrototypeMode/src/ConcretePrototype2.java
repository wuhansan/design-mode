
public class ConcretePrototype2 implements Prototype {

	private String name;

	public Prototype clone() {

		Prototype prototype = new ConcretePrototype2();

		prototype.setName(this.name);

		return prototype;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Now  in prototype2 , name = " + this.name;
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
