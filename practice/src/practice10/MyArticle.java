package practice10;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyArticle extends JFrame{
	JButton button;
	String article;
	WriteArticle writeArticle;
	
	public MyArticle(WriteArticle writeArticle) {
		this.writeArticle = writeArticle;
		setTitle("");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		button = new JButton("������");
		
	}
	
	public void complete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��縦 �Է��ϼ���");
		this.article = sc.nextLine();
		writeArticle.printArticle(article);
	}
	
	
}
