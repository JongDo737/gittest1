package ch07;

public class Hero {
	private String name;
	private int hp;
	private double defense;
	private int level;
	
	//get
	public String getName() {
		return name;
	}
	//set
	public void setName(String name) {
		//����� �ڵ��ۼ�
		if(name == null || name == "" || name.length()<2)
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		else {
			this.name = name;			
		}
	}
	public int getHP() {
		return hp;
	}
	public void setHP(int hp) {
		if(hp<0) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		else {
			this.hp = hp;			
		}
	}
	public double getDefense() {
		return defense;
	}
	public void setDefense(double defense) {
		if(defense <0) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		else {
		this.defense = defense;
		}
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if(level<0) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		else {
		this.level = level;
		}
	}
	
	public static void main(String[] args) {
		
		//Hero ��ü ���� �� getter, setter �޼��带 ����� ������.
		Hero ironMan = new Hero();
		Hero hulk = new Hero();
		Hero spiderMan = new Hero();
		
		ironMan.setName("IronMan");
		hulk.setName("Hulk");
		spiderMan.setName("SpiderMan");
		
		System.out.println(ironMan.getName());
		
		String name =hulk.getName();
		System.out.println(name);
		
		name = spiderMan.getName();
		System.out.println(name);
		
		
	}
}
