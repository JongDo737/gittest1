package ex10;

public class MainTest {

	public static void main(String[] args) {
		
		StarCraftTribe protoss1 = new Protoss("������������");
		StarCraftTribe terran1 = new Terran("�׻��ƴ�");
		StarCraftTribe zerg1 = new Zerg("���۸�����200");
		
		System.out.println(protoss1 instanceof Protoss);
		((Protoss)protoss1).dragoonSound();
	}

}
