package ch02;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame8 extends JFrame {
	
	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	MyImagePanel imagePanel;
	static int x = 200;
	static int y = 200;

	public MyFrame8() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("이미지 백그라운드 연습2");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1 = ImageIO.read(new File("어몽어스.png"));
		} catch (Exception e) {
			System.err.println("파일이 없습니다."); // err은 빨간색을 표시해줌
			System.exit(0); // 파일이 없으면 프로그램 종료
		}

		imagePanel = new MyImagePanel();

	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false); // 그림 크기를 늘리거나 줄이게 못함
		this.add(imagePanel);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {	//추상클래스이지만 클래스를 만들어줘서
			//익명구현객체(변수명이 없음)로 만들어준것 (뒤에 블럭이있음)
			@Override
			public void keyPressed(KeyEvent e) {
				
				//switch문으로 변경
				int keyCode = e.getKeyCode();
				switch(keyCode) {
				
					case KeyEvent.VK_UP :
						y = (y < 0) ? 0 : y-10;
						break;
					case KeyEvent.VK_LEFT :
						x= (x<0) ? 0: x-10;
						break;
					case KeyEvent.VK_RIGHT :
						x= (x>400) ? 400 : x+10;
						break;
					case KeyEvent.VK_DOWN :
						y=(y>400) ? 400 : y+10;
						break;
						
				}
				repaint();		//다시 그림을 그려줌
			}//end of keyPressed
		});

	}

	// 내부클래스
	private class MyImagePanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon1, x, y, 80, 80, null);

		}
	}

}// end of class
