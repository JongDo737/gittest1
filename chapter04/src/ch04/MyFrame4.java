package ch04;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class MyFrame4 extends JFrame {

	BufferedImage backgroundImage;
//	BufferedImage imageIcon;
	ArrayList<BufferedImage> imageIcon = new ArrayList<BufferedImage>();
	final int IMAGE_NUM =3;
	//1. 3개 이상 만들어서 화면에 올려주세요
	
	//2. 반복적인 부분 보이면 배열, ArrayList 사용
	
	
	MyImagePanel myImagePanel;
	public MyFrame4() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("이미지 백그라운드 연습");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon.add(ImageIO.read(new File("among1.png")));
			imageIcon.add(ImageIO.read(new File("among2.jpg")));
			
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
		//myImagePanel 생성
		myImagePanel = new MyImagePanel();
		
		
	}
	private void setInitLayout() {
		setVisible(true);
		add(myImagePanel);
	}
	
	private class MyImagePanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage,0,0,500,500,null);
			g.drawImage(imageIcon.get(0),200,200,80,80,null);
			g.drawImage(imageIcon.get(1),100,200,80,80,null);
		}//
	}	
	//메인함수
	public static void main(String[] args) {
		new MyFrame4();

	}

}
