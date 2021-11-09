package ch03;

public class GenericPrinter<T> { 
	
	// T�� �ӽð�, ��ü�ϴ� ����, �ƹ��ų� ������
	//T ��� ��ü ���ڸ� ����Ѵ�. E - element , K- key, V - value ���
	//�ڷ��� �Ű����� ( type paramater )
	
	private T material;
	
	public T getMaterial() {
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
	}
	
	//toString �������̵�
	@Override
	public String toString() {
		return material.toString();
	}
}
