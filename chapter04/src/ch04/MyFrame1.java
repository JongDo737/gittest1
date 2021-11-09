package ch04;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame1 extends JFrame{
	
	MyPanel myPanel;
	
	//생성자
	public MyFrame1() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("JAVA 2D Test");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myPanel = new MyPanel();
		
	}
	private void setInitLayout() {
		setVisible(true);
		add(myPanel);
	}
	//내부 클래스, static (정적 내부 클래스)
	static class MyPanel extends JPanel{
		
		@Override
		public void paint(Graphics g) {	//좌표값으로 그림을 그림
			super.paint(g);
			//글자 쓰기
//			g.drawString("안녕하세요",10,20);
			//선긋기
//			g.drawLine(20,30,100,100);  //(x1,y1) 에서 (x2,y2)
//			//사각형
//			g.drawRect(100,100,200,150); // (x1,y1) 에서 가로 200 세로 150
			
			g.drawLine(300,200,400,100);
			g.drawLine(400,100,500,200);
			g.drawRect(300,200,200,150);
			g.drawRect(430,230,40,40);
			g.drawLine(450,230,450,270);
			g.drawLine(430,250,470,250);
			g.drawRect(350,260,50,90);
			g.drawOval (200,50,50,50);
			g.drawString("해^^",220,80);
			g.drawOval (385,300,10,10);
		}
		
	}
	//메인함수
	public static void main(String[] args) {
		new MyFrame1();
	}
}
