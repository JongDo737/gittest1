package practice01;

public class BuildToss {

	int id;
	String name;
	
	public BuildToss(int id, String name) {
		this.id = id;
		this.name =name;
	}
	public void showInfo() {
		System.out.println(id+"번째 "+name+"입니다.");
	}
}
