package ch03;

import java.util.Scanner;

//�ݸ� (ȣ����)
public class MyArticle {

	String article;
	WriteArticle hacker;
	WriteArticle sbs;
	
	//�ּҰ� ����
	public MyArticle(WriteArticle hacker, WriteArticle sbs) {
		this.hacker = hacker;
		this.sbs = sbs;
	}
	public void complete() {
		//Scanner ����ؼ� ����� �Է°��� �ް� �ݹ� �޼��带 ���� �����ּ���
		Scanner sc = new Scanner(System.in);
		System.out.println("��縦 �ۼ��ϼ��� : ");
		System.out.println();
		article = sc.nextLine();
		hacker.printArticle(article);
		sbs.printArticle(article);
	}
}
