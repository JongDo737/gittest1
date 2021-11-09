package practice03;

public class Powder extends Material{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "재료는 파우더입니다.";
	}
	@Override
	public void doPrint() {
		System.out.println("파우더로 출력합니다");
	}
}
