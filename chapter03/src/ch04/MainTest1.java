package ch04;

public class MainTest1 {

	public static void main(String[] args) {

		Warrior warrior1 = new Warrior("����1",150);
		Wizard wizard1 = new Wizard("������1", 80);
		Archer archer1 = new Archer("�ü�1",100);

		String name = warrior1.name;	//hero
		int hp = warrior1.hp;					//hero
		warrior1.attack();						//hero
		warrior1.comboAttack();				//warrior
		
		wizard1.attack();
		wizard1.freezing();
		
		archer1.attack();
		archer1.fireArrow();
	}

}
