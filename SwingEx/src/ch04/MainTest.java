package ch04;

import java.awt.BorderLayout;
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

class MyFrame extends JFrame implements ActionListener {
	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	BufferedImage imageIcon2;

	JPanel panel;
	JButton startButton;
	JButton stopButton;

	CustomPanel customPanel;
	Thread thread;
	static int x1 = 200;
	static int y1 = 200;
	static int x2 = 000;
	static int y2 = 400;
	static boolean isOn = true;

	public MyFrame() {
		initData();
		setInitLayout();
		addEventListener();
		
		thread.start();
	}

	private void initData() {
		setTitle("어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1 = ImageIO.read(new File("어몽어스.png"));
			imageIcon2 = ImageIO.read(new File("among1.png"));
		} catch (Exception e) {
			System.err.println("파일을 찾을 수 없습니다.");
			System.exit(0);
		}
		panel = new JPanel();
		startButton = new JButton("시작");
		stopButton = new JButton("종료");
		customPanel = new CustomPanel();
		thread = new Thread(customPanel);

	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		add(customPanel, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		panel.add(startButton);
		panel.add(stopButton);

	}

	private void addEventListener() {
		startButton.addActionListener(this);
		stopButton.addActionListener(this);
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("키눌림");
				int keyNum = e.getKeyCode();
				switch (keyNum) {
				case KeyEvent.VK_LEFT:
					x1 = (x1 < 0) ? 0 : x1 - 10;
					break;

				case KeyEvent.VK_UP:
					y1 = (y1 < 0) ? 0 : y1 - 10;
					break;

				case KeyEvent.VK_RIGHT:
					x1 = (x1 > 500) ? 500 : x1 + 10;
					break;
				case KeyEvent.VK_DOWN:
					y1 = (y1 > 400) ? 400 : y1 + 10;
					break;
				}
				repaint();
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();
		if (clickedButton == startButton) {
			isOn = true;
		} else if (clickedButton == stopButton) {
			isOn = false;
		}

	}

	private class CustomPanel extends JPanel implements Runnable {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 600, 600, null);
			g.drawImage(imageIcon1, x1, y1, 100, 100, null);
			g.drawImage(imageIcon2, x2, y2, 100, 100, null);
		}

		@Override
		public void run() {
			boolean check = true;
			while (true) {
				if (isOn) {
					if (check) { // 밑에 이미지 움직이게 함
						x2 += 10;
						if (x2 == 500) {
							check = false;
						}
					} else {
						x2 -= 10;
						if (x2 == 0) {
							check = true;
						}
					}
					if (x1 == x2 && y1 == y2) { // 사진이 겹치면 사진이 사라지게 함
						imageIcon1 = null;
					}
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				repaint();
			}

		}
	}

}

public class MainTest {
	public static void main(String[] args) {
		new MyFrame();
	}

}
