package ch04;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MiniAmongUs extends JFrame implements ActionListener {
	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	BufferedImage imageIcon2;
	CustomJPanel customJPanel;
	BorderLayout borderLayout;
	Thread thread;
	JPanel panel;
	JButton button1;
	JButton button2;
	Container con;
	ImageIcon image;
	JLabel imgLabel;
	boolean isStart = true;
	// thread 사용할 이미지
	int among1XPoint = 0;
	int among1YPoint = 370;

	// 키로 입력받을
	int among2XPoint = 200;
	int among2YPoint = 200;

	MiniAmongUs() {
		initData();
		setInitLayout();
		addEventListener();

		// 스레드 시작

		thread.start();
	}

	private void initData() {
		setTitle("어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		con = getContentPane();
		
		image = new ImageIcon("몽환배경.jfif");
		imgLabel = new JLabel(image);
		try {
//			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1 = ImageIO.read(new File("among1.png"));
			imageIcon2 = ImageIO.read(new File("어몽어스.png"));

		} catch (Exception e) {
			System.err.println("파일이 없습니다.");
			System.exit(0);
		}
		customJPanel = new CustomJPanel();
		panel = new JPanel();
		button1 = new JButton("시작");
		button2 = new JButton("종료");
		borderLayout = new BorderLayout();
		thread = new Thread(customJPanel);
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false);
		
//		setLayout(borderLayout);
//		add(customJPanel, borderLayout.CENTER);
//		add(panel, borderLayout.SOUTH);
//
//		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
//
//		panel.add(button1);
//		panel.add(button2);
		
		con.add(imgLabel);

	}

	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);

		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("키눌림");
				int code = e.getKeyCode();

				switch (code) {

				case KeyEvent.VK_LEFT:
					among2XPoint = (among2XPoint < 0) ? 0 : among2XPoint - 10;
					break;

				case KeyEvent.VK_UP:
					among2YPoint = (among2YPoint < 0) ? 0 : among2YPoint - 10;
					break;

				case KeyEvent.VK_RIGHT:
					among2XPoint = (among2XPoint > 500) ? 500 : among2XPoint + 10;
					break;
				case KeyEvent.VK_DOWN:
					among2YPoint = (among2YPoint > 400) ? 400 : among2YPoint + 10;
					break;
				}
				repaint();
			}

		});

	}

	private class CustomJPanel extends JPanel implements Runnable {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 600, 600, null);
			g.drawImage(imageIcon1, among1XPoint, among1YPoint, 100, 100, null);
			g.drawImage(imageIcon2, among2XPoint, among2YPoint, 100, 100, null);
			System.out.println("동작테스트");
		}

		@Override
		public void run() {
			boolean isRight = true;
			while (true) {
				if(isStart) {
					if (isRight) {
						among1XPoint += 10;
					} else {
						among1XPoint -= 10;
					}
					if (among1XPoint == 450) {
						isRight = false;
					}
					if (among1XPoint == 0) {
						isRight = true;
					}
					// 이미지 1과 이미지 2의 좌표값이 일치한다면 이미지 2를 없애라
					if (among1XPoint == among2XPoint && among1YPoint == among2YPoint) {
						imageIcon2 = null;
					}
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				repaint();	//repaint 는 밖으로 빼줘야함
			} // end of while
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 1. 버튼이 start, stop 구분해주세요

		JButton clickedButton = (JButton) e.getSource();
		// 2. 변수를 새롭게 활영해서 while 멈추거나 다시 시작할 수 있게 코드를 수정합니다.
		System.out.println("버튼눌러짐");
		if (clickedButton == button1) {
			isStart = true;

		} else if (clickedButton == button2) {
			isStart = false;
		}

	}

}

public class MainTest1 {
	public static void main(String[] args) {
		new MiniAmongUs();

	}

}
