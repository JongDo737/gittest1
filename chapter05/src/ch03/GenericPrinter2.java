package ch03;

public class GenericPrinter2 <T extends Material>{
	
	//<T extends Material>
	// Material의 상속을 받는 것들만 할수있게 강제성 부여
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}

}
