package ex10;

public class MainTest {

	public static void main(String[] args) {
		
		StarCraftTribe protoss1 = new Protoss("지존플토장인");
		StarCraftTribe terran1 = new Terran("테사기아님");
		StarCraftTribe zerg1 = new Zerg("저글링으로200");
		
		System.out.println(protoss1 instanceof Protoss);
		((Protoss)protoss1).dragoonSound();
	}

}
