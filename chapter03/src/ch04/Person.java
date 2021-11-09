package ch04;

public class Person {
	//상속구조를 만들때 밑에서부터 Person Teacher Studnet 를 다 만들어놓고 확신이 들면 쓸것
	//그렇지 않고 처음부터 바로 상속을 써버리면 나중에 후회할 수도 있음.
	String name;
	int age;
	int weight;
	int height;
	
	public void showInfo() {
		System.out.println(name +"님의 정보");
		System.out.println( "나이 : "+age);
		System.out.println( "몸무게 : "+weight);
		System.out.println( "키 : "+height);
	}
}
