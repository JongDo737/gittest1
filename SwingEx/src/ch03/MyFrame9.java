package ch03;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame9 extends JFrame {
	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	BufferedImage imageIcon2;

	MyImagePanel myImagePanel;

	JPanel panel;

	JButton button1;
	JButton button2;

//	MyThread myThread;

	BorderLayout borderLayout;

	static int x1 = 200;
	static int y1 = 200;
	static int x2 = 10;
	static int y2 = 300;
	static boolean buttonCheck = true;

	public MyFrame9() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("궁예 피하기");
		setSize(500, 500);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("UranBackground.jpg"));
			imageIcon1 = ImageIO.read(new File("어몽어스.png"));
			imageIcon2 = ImageIO.read(new File("궁예.png"));
		} catch (Exception e) {
			System.err.println("파일을 찾을 수 없습니다.");
			System.exit(0);
		}

		myImagePanel = new MyImagePanel();
		panel = new JPanel();
		button1 = new JButton("빨간놈");
		button2 = new JButton("궁예");
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		myImagePanel.setPreferredSize(new Dimension(500, 400));
		add(myImagePanel, borderLayout.NORTH);

		panel.setLayout(new FlowLayout());
		panel.add(button1);
		panel.add(button2);
		add(panel, borderLayout.SOUTH);

	}

	private void addEventListener() {
		
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("키눌림");
				int keyNum = e.getKeyCode();
				if (buttonCheck) {
					switch (keyNum) {

					case KeyEvent.VK_LEFT:
						x1 = (x1 < 0) ? 0 : x1 - 10;
						break;
					case KeyEvent.VK_UP:
						y1 = (y1 < 0) ? 0 : y1 - 10;
						break;
					case KeyEvent.VK_RIGHT:
						x1 = (x1 > 400) ? 400 : x1 + 10;
						break;
					case KeyEvent.VK_DOWN:
						y1 = (y1 > 400) ? 400 : y1 + 10;
						break;

					}
					repaint();
				}
				else {
					switch (keyNum) {
					
					case KeyEvent.VK_LEFT:
						x2 = (x2 < 0) ? 0 : x2 - 10;
						break;
					case KeyEvent.VK_UP:
						y2 = (y2 < 0) ? 0 : y2 - 10;
						break;
					case KeyEvent.VK_RIGHT:
						x2 = (x2 > 400) ? 400 : x2 + 10;
						break;
					case KeyEvent.VK_DOWN:
						y2 = (y2 > 400) ? 400 : y2 + 10;
						break;

					}
					repaint();
				}
				
			}
		});
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1");
				buttonCheck = true;
			}
			
		});
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼2");
				buttonCheck = false;
			}
			
		});
		repaint();
//		ActionListener ac = new ActionListener() {
//			
//			public void actionPerformed(ActionEvent e) {	
//				System.out.println("버튼눌림");
//				JButton clickedButton = (JButton)e.getSource();
//				if(clickedButton.getText().equals(button1.getText())) {
//					buttonCheck = true;
//					System.out.println(buttonCheck);
//				}
//				else if(clickedButton.getText().equals(button2.getText())) {
//					buttonCheck = false;
//					System.out.println(buttonCheck);
//				}
//				
//			}
//			
//		};
		
	}

	private class MyImagePanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 400, null);
			g.drawImage(imageIcon1, x1, y1, 80, 80, null);
			g.drawImage(imageIcon2, x2, y2, 80, 80, null);

		}
	}

//	private class MyThread extends Thread {
//		boolean flag;
//
//		public MyThread(boolean flag) {
//			this.flag = flag;
//			run();
//		}
//
//		@Override
//		public void run() {
//
//			int check = 0;
//			while (flag) {
//				if (check == 0) {
//					x2 += 10;
//					if (x2 > 400) {
//						check = 1;
//					}
//				} else if (check == 1) {
//					x2 -= 10;
//					if (x2 < 10) {
//						check = 0;
//					}
//				}
//				try {
//					Thread.sleep(100);
//					repaint();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//	}

	public static void main(String[] args) {
		new MyFrame9();
	}
}
