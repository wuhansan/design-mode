
/**
 * 
 * @author 34201
 *
 */

public class Client {

	public static void main(String[] args) {
		Prototype p1 = new ConcretePrototype1();
		PrototypeManager.setPrototype("p1", p1);

		try {
			Prototype p3 = PrototypeManager.getPrototype("p1").clone();
			p3.setName("張山");

			System.out.println("第一個實例 " + p3);

			// 有人动态的切换了实现
			Prototype p2 = new ConcretePrototype2();
			PrototypeManager.setPrototype("p1", p2);

			// 重新获取原来的原型来创建对象
			Prototype p4 = PrototypeManager.getPrototype("p1").clone();
			p4.setName("李四");
			System.out.println("第二个实例 " + p4);
			
			//注销
			PrototypeManager.removePrototype("p1");
			
			 //再次获取原型来创建对象
            Prototype p5 = PrototypeManager.getPrototype("p1").clone();
            p5.setName("王五");
            System.out.println("第三个实例：" + p5);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
