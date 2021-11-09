package ch02;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {

		MyComponents mc = new MyComponents();
		System.out.println("글자를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		
		mc.textField.setText(userInput);
	}

}
