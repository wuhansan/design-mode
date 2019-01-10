
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
			p3.setName("��ɽ");

			System.out.println("��һ������ " + p3);

			// ���˶�̬���л���ʵ��
			Prototype p2 = new ConcretePrototype2();
			PrototypeManager.setPrototype("p1", p2);

			// ���»�ȡԭ����ԭ������������
			Prototype p4 = PrototypeManager.getPrototype("p1").clone();
			p4.setName("����");
			System.out.println("�ڶ���ʵ�� " + p4);
			
			//ע��
			PrototypeManager.removePrototype("p1");
			
			 //�ٴλ�ȡԭ������������
            Prototype p5 = PrototypeManager.getPrototype("p1").clone();
            p5.setName("����");
            System.out.println("������ʵ����" + p5);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
