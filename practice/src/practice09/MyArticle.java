package practice09;

import java.util.Scanner;

public class MyArticle {

	String article;
	WriteArticle writeArticle;
	
	public MyArticle(WriteArticle writeArticle) {
		this.writeArticle = writeArticle;
		
	}
	public void complet() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��縦 �ۼ��ϼ��� : ");
		this.article = sc.nextLine();
		System.out.println();
		writeArticle.printArticle(article);
	}

}
