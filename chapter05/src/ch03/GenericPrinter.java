package ch03;

public class GenericPrinter<T> { 
	
	// T는 임시값, 대체하는 문자, 아무거나 들어가도됨
	//T 라는 대체 문자를 사용한다. E - element , K- key, V - value 등등
	//자료형 매개변수 ( type paramater )
	
	private T material;
	
	public T getMaterial() {
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
	}
	
	//toString 오버라이드
	@Override
	public String toString() {
		return material.toString();
	}
}
