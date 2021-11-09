package ch08;

public class Person {

	// this 란
	// 1. 인스턴스(객체) 자신의 메모리를 가리킨다.
	// 2. 생성자에서 또 다른 생성자를 호출할 때 사용할 수 있다.
	// 3. 자신의 주소 (참조값, 주소값)을 반환 시킬 수 있다.

	String name;
	int age;

	public Person(String name, int age) {
		// 1. 자기 자신을 가리키는 this
		this.name = name;
		this.age = age;
	}

	public Person() {
		// 기본 생성자에서 다른 생성자를 호출
		this("이름없음", 1); // 바로위에있는 생성자를 부름
//		this.name = "이름없음";
//		this.age = 1;
		
		
	}
	//자신의 주소값(참조값)을 반환시킬 수 있다
	//빌더 패턴을 만들어 낼 수 있다.
	public Person getPerson() {
		return this;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void showInfo() {
		System.out.println("이름 : "+ name+" 나이 : "+age);
	}
	
	//main
	public static void main(String[] args) {
		Person person1 = new Person();
//		person1.showInfo();
		person1.setName("홍길동");
		//참조값을 받아서 다른 인스턴스 변수에 주소를 할당해 보자.
		Person person2 = person1.getPerson();
//		person2.showInfo();
		person2.setName("이순신");
		
		System.out.println(person1);
		System.out.println(person2);
		
		person1.showInfo();
		person2.showInfo();
		
		
		
		
		
	}
}
