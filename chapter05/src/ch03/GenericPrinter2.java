package ch03;

public class GenericPrinter2 <T extends Material>{
	
	//<T extends Material>
	// Material�� ����� �޴� �͵鸸 �Ҽ��ְ� ������ �ο�
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
