package ch03;

import java.util.Scanner;

//콜리 (호출자)
public class MyArticle {

	String article;
	WriteArticle hacker;
	WriteArticle sbs;
	
	//주소값 연결
	public MyArticle(WriteArticle hacker, WriteArticle sbs) {
		this.hacker = hacker;
		this.sbs = sbs;
	}
	public void complete() {
		//Scanner 사용해서 사용자 입력값을 받고 콜백 메서드를 실행 시켜주세요
		Scanner sc = new Scanner(System.in);
		System.out.println("기사를 작성하세요 : ");
		System.out.println();
		article = sc.nextLine();
		hacker.printArticle(article);
		sbs.printArticle(article);
	}
}
