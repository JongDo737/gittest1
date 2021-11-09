package ch03;

public class Plastic extends Material{

	@Override
	public String toString() {
		return "재료는 plastic입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("파우더 재료로 출력합니다.");
	}
}
