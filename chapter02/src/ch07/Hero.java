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
		//방어적 코드작성
		if(name == null || name == "" || name.length()<2)
			System.out.println("잘못 입력하셨습니다.");
		else {
			this.name = name;			
		}
	}
	public int getHP() {
		return hp;
	}
	public void setHP(int hp) {
		if(hp<0) {
			System.out.println("잘못입력하셨습니다.");
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
			System.out.println("잘못입력하셨습니다.");
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
			System.out.println("잘못입력하셨습니다.");
		}
		else {
		this.level = level;
		}
	}
	
	public static void main(String[] args) {
		
		//Hero 객체 생성 후 getter, setter 메서드를 사용해 보세요.
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
