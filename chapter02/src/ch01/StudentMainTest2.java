package ch01;

public class StudentMainTest2 {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		//1. 접근해서 name,height,weight,grade
		//값을 줘서 화면에 출력해주세요
		student1.name = "신종민";
		student1.height = 180;
		student1.weight = 72;
		student1.grade = 1;  
		System.out.println("첫번째 학생\n이름 : "+student1.name+"\n키 : "+student1.height+"\n몸무게 : "+student1.weight+"\n학년 : "+student1.grade);
		
		System.out.println("---------");

		Student student2 = new Student();
		//1. 접근해서 name,height,weight,grade
				//값을 줘서 화면에 출력해주세요
		student2.name = "두";
		student2.height = 170;
		student2.weight = 50;
		student2.grade = 4;  
		System.out.println("두번째 학생\n이름 : "+student2.name+"\n키 : "+student2.height+"\n몸무게 : "+student2.weight+"\n학년 : "+student2.grade);
		
		
		
		
	}

}
